package domain;

import lombok.Getter;
import lombok.Setter;

public class Vendor {
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String cellNumber;
	@Getter @Setter
	private String address;
	@Getter @Setter
	private String vendorID;
}
