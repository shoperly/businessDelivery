package domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

public class Receipt {
	@Getter @Setter
	private String custID;
	@Getter @Setter
	private BigDecimal total;
	@Getter @Setter
	private Date date;
	@Getter @Setter
	private String items;
	@Getter @Setter
	private String location;
	
}
