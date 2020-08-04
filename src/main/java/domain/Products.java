package domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Products {
	@Getter @Setter
	private String name;
	@Getter @Setter
	private  BigDecimal price;
	@Getter @Setter
	private String details;
}
