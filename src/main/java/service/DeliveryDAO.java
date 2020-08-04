package service;

import java.util.UUID;

import domain.Delivery;

public class DeliveryDAO implements DeliveryInterface{
	private String databaseURI;
    
    public DeliveryDAO() {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
    }
    
    public DeliveryDAO(final String uri) {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
        this.databaseURI = uri;
    }
    
	@Override
	public Delivery getDeliveryByCustID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addDeliveryByCustID(Delivery delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDeliveryByCustID(Delivery delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDeliveryByCustID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Delivery getDeliveryByStaffID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addDeliveryByStaffID(Delivery delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDeliveryByStaffID(Delivery delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDeliveryByStaffID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
