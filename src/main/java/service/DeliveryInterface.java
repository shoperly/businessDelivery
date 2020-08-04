package service;

import java.util.UUID;

import domain.Delivery;

public interface DeliveryInterface {

	public Delivery getDeliveryByCustID(UUID id);
	
	public int addDeliveryByCustID(UUID id);
	
	public int updateDeliveryByCustID(UUID id);
	
	public int deleteDeliveryByCustID(UUID id);
	

	public Delivery getDeliveryByStaffID(UUID id);
	
	public int addDeliveryByStaffID(UUID id);
	
	public int updateDeliveryByStaffID(UUID id);
	
	public int deleteDeliveryByStaffID(UUID id);
}
