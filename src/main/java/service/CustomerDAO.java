package service;

import java.util.UUID;

import domain.Customer;

public class CustomerDAO implements CustomerInterface{

	private String databaseURI;
    
    public CustomerDAO() {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
    }
    
    public CustomerDAO(final String uri) {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
        this.databaseURI = uri;
    }
    
	@Override
	public Customer getCustomerByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCustomerByID(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCustomerByID(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomerByID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCustomerByEmail(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCustomerByEmail(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCustomerByUserName(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCustomerByUserName(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomerByUsername(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

}