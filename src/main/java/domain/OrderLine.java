package domain;

import lombok.Getter;
import lombok.Setter;

public class OrderLine {
	@Getter @Setter
	private Products product;
	@Getter @Setter
	private Double quantity;
}
