package service;

import domain.Customer;

public interface CustomerInterface {

	public Customer getCustomer();
	
	public int updateCustomer();
	
	public int addCustomer();
	
	public int deleteCustomer();
}
