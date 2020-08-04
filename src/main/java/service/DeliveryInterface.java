package service;

import java.util.UUID;

import domain.Delivery;

public interface DeliveryInterface {

	public Delivery getDeliveryByCustID(UUID id);
	
	public int addDeliveryByCustID(Delivery delivery);
	
	public int updateDeliveryByCustID(Delivery delivery);
	
	public int deleteDeliveryByCustID(UUID id);
	

	public Delivery getDeliveryByStaffID(UUID id);
	
	public int addDeliveryByStaffID(Delivery delivery);
	
	public int updateDeliveryByStaffID(Delivery delivery);
	
	public int deleteDeliveryByStaffID(UUID id);
}
