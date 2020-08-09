package domain;

import lombok.Getter;
import lombok.Setter;

public class OrderLine {
	@Getter @Setter
	private String productID;
	@Getter @Setter
	private String orderID;
	@Getter @Setter
	private String receiptID;
	@Getter @Setter
	private Double quantity;
}
