package domain;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class Customer implements Person{
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
	private String cardDetails;
	@Getter @Setter
	private UUID custID;

}
