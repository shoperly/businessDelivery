package service;

import domain.Customer;

import java.util.UUID;

public interface CustomerInterface {

	public Customer getCustomerByID(String id);
	public int updateCustomerByID(Customer customer);
	public int addCustomerByID(Customer customer);
	public int deleteCustomerByID(String id);
	
	public Customer getCustomerByEmail(String email);
	public int updateCustomerByEmail(Customer customer);
	public int addCustomerByEmail(Customer customer);
	public int deleteCustomerByEmail(String email);
	
	public Customer getCustomerByUserName(String userName);
	public int updateCustomerByUserName(Customer customer);
	public int addCustomerByUserName(Customer customer);
	public int deleteCustomerByUsername(String userName);

	

}
