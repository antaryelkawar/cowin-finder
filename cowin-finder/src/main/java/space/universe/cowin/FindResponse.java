package space.universe.cowin;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FindResponse {

	private List<Session> sessions = new ArrayList<>();
	private List<Session> centers = new ArrayList<>();

}
