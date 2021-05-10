package space.universe.cowin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import space.universe.cowin.api.AppointmentAvailabilityApisApi;

public class Main {

	private static final ApiClient apiClient = new ApiClient();
	static {
		apiClient.setUserAgent("cowin-get-slots");
	}

	private static final AppointmentAvailabilityApisApi availabilityApi = new AppointmentAvailabilityApisApi(apiClient);

	public static void main(String[] args) throws ApiException, FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();

		String webhookUrl = "https://maker.ifttt.com/trigger/notify_cowin/with/key/fKYMWaMcG5ATaVjzj0m_bDFlYisi02AjKNGiLuYD_lj";
		String districtId = "365";

		Long pollerSlow = 60L;
		Long pollerFast = 10L;

		try (FileReader reader = new FileReader("properties.json")) {

			JSONObject properties = (JSONObject) jsonParser.parse(reader);

			webhookUrl = (String) properties.get("webhook-url");
			districtId = (String) properties.get("district-id");
			pollerSlow = (Long) properties.get("polling-slow");
			pollerFast = (Long) properties.get("polling-fast");
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found, defaulting");
		}

		OkHttpClient httpClient = new OkHttpClient();
		Request request = new Request.Builder().url(webhookUrl).build();

		try {

			while (true) {

				LocalDate today = LocalDate.now();

				List<Session> available = new ArrayList<>();

				for (int i = 0; i < 7; i++) {
					String todayString = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					available.addAll(getAvailableSessions(districtId, todayString));
					today = today.plusDays(1);
				}

				if (!available.isEmpty()) {
					System.out.println(available);
					httpClient.newCall(request).execute();
					Thread.sleep(pollerFast * 1000);
					continue;
				}

				System.out.println("nothing found!");
				Thread.sleep(pollerSlow * 1000);
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	private static List<Session> getAvailableSessions(String districtId, String date) throws ApiException {

		Gson gson = new Gson();

		Object response = availabilityApi.findByDistrict(districtId, date, "hi_IN");

		String jsonString = gson.toJson(response);
		FindResponse clone = gson.fromJson(jsonString, FindResponse.class);
		return clone.getSessions().stream().filter(session -> session.getMin_age_limit() < 27)
				.collect(Collectors.toList());
	}

}
