package service;

import domain.Customer;
import domain.Staff;

import java.sql.*;
import java.util.UUID;

public class CustomerDAO implements CustomerInterface{

	private String databaseURI;
    
    public CustomerDAO() {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
    }
    
    public CustomerDAO(final String uri) {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
        this.databaseURI = uri;
    }
    
	@Override
	public Customer getCustomerByID(String id) {
		String sql = "SELECT * FROM customer WHERE custid = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Customer cust = new Customer();
				cust.setName(rs.getString("customername"));
				cust.setCellNumber(rs.getString("cellNumber"));
				cust.setAddress(rs.getString("address"));
				cust.setCustID(rs.getString("custID"));
				cust.setEmail(rs.getString("email"));
				cust.setLastName(rs.getString("lastname"));
				cust.setCardDetails(rs.getString("carddetails"));
				return cust;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int updateCustomerByID(Customer customer) {
		String sql = "Update staff Set customername =?, lastName =? , address = ?, cellnumber = ?, email = ?, cardDetails= ? where staffid =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{

			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getAddress());
			stmt.setString(4, customer.getCellNumber());
			stmt.setString(5, customer.getEmail());
			stmt.setString(6, customer.getCardDetails());
			stmt.setString(7, customer.getCustID());

			stmt.execute();

			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int addCustomerByID(Customer customer) {
		String sql = "INSERT INTO customer (customername, lastname, address, cellnumber, email, cardDetails, custid) VALUES (?, ?, ?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getAddress());
			stmt.setString(4, customer.getCellNumber());
			stmt.setString(5, customer.getEmail());
			stmt.setString(6, customer.getCardDetails());
			stmt.setString(7, customer.getCustID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public int deleteCustomerByID(String id) {
		String sql = "delete from customer where custid = ?";
		try (
				// get a connection to the database
				Connection dbCon = DriverManager.getConnection(databaseURI); // create the statement
				PreparedStatement stmt = dbCon.prepareStatement(sql);)
		{
			stmt.setString(1, id);
			// execute the query
			int rs = stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
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
		String sql = "INSERT INTO customer (customername, lastname, address, cellnumber, email, cardDetails, custid) VALUES (?, ?, ?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getAddress());
			stmt.setString(4, customer.getCellNumber());
			stmt.setString(5, customer.getEmail());
			stmt.setString(6, customer.getCardDetails());
			stmt.setString(7, customer.getCustID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
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
		String sql = "INSERT INTO customer (customername, lastname, address, cellnumber, email, cardDetails, custid) VALUES (?, ?, ?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getAddress());
			stmt.setString(4, customer.getCellNumber());
			stmt.setString(5, customer.getEmail());
			stmt.setString(6, customer.getCardDetails());
			stmt.setString(7, customer.getCustID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public int deleteCustomerByUsername(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

}
