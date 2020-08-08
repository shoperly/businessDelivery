package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Staff implements Person{
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String lastName;
	@Getter @Setter
	private String address;
	@Getter @Setter
	private String cellNumber;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private int staffID;
}
