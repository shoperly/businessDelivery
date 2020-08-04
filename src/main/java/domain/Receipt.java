package domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

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
