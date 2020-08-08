package service;

import domain.Order;

import java.util.UUID;

public interface DeliveryInterface {

	public Order getDeliveryByCustID(UUID id);
	
	public int addDeliveryByCustID(Order delivery);
	
	public int updateDeliveryByCustID(Order delivery);
	
	public int deleteDeliveryByCustID(UUID id);
	

	public Order getDeliveryByStaffID(UUID id);
	
	public int addDeliveryByStaffID(Order delivery);
	
	public int updateDeliveryByStaffID(Order delivery);
	
	public int deleteDeliveryByStaffID(UUID id);
}
