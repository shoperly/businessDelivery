package service;

import java.util.UUID;

import domain.Customer;

public interface CustomerInterface {

	public Customer getCustomerByID(UUID id);
	public int updateCustomerByID(UUID id);
	public int addCustomerByID(UUID id);
	public int deleteCustomerByID(UUID id);
	
	public Customer getCustomerByEmail(String email);
	public int updateCustomerByEmail(String email);
	public int addCustomerByEmail(String email);
	public int deleteCustomerByEmail(String email);
	
	public Customer getCustomerByUserName(String userName);
	public int updateCustomerByUserName(String userName);
	public int addCustomerByUserName(String userName);
	public int deleteCustomerByUsername(String userName);

	

}
