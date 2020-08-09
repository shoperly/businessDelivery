package domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

public class Receipt {
	@Getter @Setter
	private int custID;
	@Getter @Setter
	private Double total;
	@Getter @Setter
	private Date date;
	@Getter @Setter
	private String location;
	@Getter @Setter
	private String receiptID;
}
