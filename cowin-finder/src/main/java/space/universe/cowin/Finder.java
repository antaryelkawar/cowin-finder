package space.universe.cowin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import space.universe.cowin.api.AppointmentAvailabilityApisApi;

public class Finder {

	private static final ApiClient apiClient = new ApiClient();
	private static final AppointmentAvailabilityApisApi availabilityApi = new AppointmentAvailabilityApisApi(apiClient);

	public static void main(String[] args) throws ApiException {

		apiClient.setUserAgent("antariksha-test");

		OkHttpClient httpClient = new OkHttpClient();
		Request request = new Request.Builder().url(
				"https://maker.ifttt.com/trigger/notify_cowin/with/key/fKYMWaMcG5ATaVjzj0m_bDFlYisi02AjKNGiLuYD_lj")
				.build();

		try {

			while (true) {

				List<Session> available = new ArrayList<>();
				available.addAll(getAvailableSessions("10-05-2021"));
				available.addAll(getAvailableSessions("11-05-2021"));
				available.addAll(getAvailableSessions("12-05-2021"));
				available.addAll(getAvailableSessions("13-05-2021"));
				available.addAll(getAvailableSessions("14-05-2021"));
				available.addAll(getAvailableSessions("15-05-2021"));
				available.addAll(getAvailableSessions("16-05-2021"));

				if (!available.isEmpty()) {
					System.out.println(available);
					httpClient.newCall(request).execute();
					Thread.sleep(10000);
					continue;
				}

				System.out.println("nothing found!");
				Thread.sleep(60000);
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	private static List<Session> getAvailableSessions(String date) throws ApiException {

		Gson gson = new Gson();

		Object response = availabilityApi.findByDistrict("365", date, "hi_IN");

		String jsonString = gson.toJson(response);
		FindResponse clone = gson.fromJson(jsonString, FindResponse.class);
		return clone.getSessions().stream().filter(session -> session.getMin_age_limit() < 27)
				.collect(Collectors.toList());
	}

}
