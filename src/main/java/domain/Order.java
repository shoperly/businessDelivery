package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Order {
	@Getter @Setter
	private String orderID;
	@Getter @Setter
	private String custID;
	@Getter @Setter
	private String staffID;
	@Getter @Setter
	private Date date;
	@Getter @Setter
	private Collection<OrderLine> order = new ArrayList<OrderLine>();
	@Getter @Setter
	private Double totalPrice;
	
	public Order(String orderID, String custID, Date date, Collection<OrderLine> items) {
		this.orderID = orderID;
		this.custID = custID;
		this.date = date;
		this.order = items;
	}
	
	public int addItems(Collection<OrderLine> items) {
		for(OrderLine a:items){
			this.order.add(a);
		}
		return 1;
	}
}
