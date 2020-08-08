package service;

import domain.Order;

import java.util.UUID;

public class DeliveryDAO implements DeliveryInterface{
	private String databaseURI;

	public DeliveryDAO() {
		this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
	}

	public DeliveryDAO(final String uri) {
		this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
		this.databaseURI = uri;
	}

	@Override
	public Order getDeliveryByCustID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addDeliveryByCustID(Order delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDeliveryByCustID(Order delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDeliveryByCustID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order getDeliveryByStaffID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addDeliveryByStaffID(Order delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDeliveryByStaffID(Order delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDeliveryByStaffID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

  
}
