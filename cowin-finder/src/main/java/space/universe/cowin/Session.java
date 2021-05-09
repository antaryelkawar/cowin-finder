package space.universe.cowin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Session {

	private String center_id;
	private String name;
	private String address;
	private String from;
	private String to;
	private String date;
	private int available_capacity;
	private int min_age_limit;

}
