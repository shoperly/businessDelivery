package service;

import domain.Vendor;

import java.sql.*;
import java.util.UUID;

public class VendorDAO implements VendorInterface{
	private String databaseURI;
    
    public VendorDAO() {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
    }
    
    public VendorDAO(final String uri) {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
        this.databaseURI = uri;
    }

	@Override
	public Vendor getVendorByID(int id) {
		String sql = "SELECT * FROM VENDOR WHERE vendorid = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Vendor vendor = new Vendor();
				vendor.setName(rs.getString("name"));
				vendor.setCellNumber(rs.getString("cellNumber"));
				vendor.setAddress(rs.getString("address"));
				vendor.setVendorID(rs.getInt("vendorID"));
				vendor.setEmail(rs.getString("email"));
				return vendor;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int addVendorByID(Vendor vendor) {
		String sql = "INSERT INTO vendor (vendorName, cellNumber, address, vendorid, email) VALUES (?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
				stmt.setString(1, vendor.getName());
				stmt.setString(2, vendor.getCellNumber());
				stmt.setString(3, vendor.getAddress());
				stmt.setInt(4, vendor.getVendorID());
				stmt.setString(5, vendor.getEmail());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public int updateVendorByID(Vendor vendor) {
		String sql = "Update vendor Set vendorName =?, cellNumber =? , address = ?, email = ? where vendorid =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{

			stmt.setString(1, vendor.getName());
			stmt.setString(2, vendor.getCellNumber());
			stmt.setString(3, vendor.getAddress());
			stmt.setString(4, vendor.getEmail());
			stmt.setInt(5, vendor.getVendorID());

			stmt.execute();

			return 1;

		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteVendorByID(int id) {
		String sql = "delete from vendor where vendorid = ?";
		try (
				// get a connection to the database
				Connection dbCon = DriverManager.getConnection(databaseURI); // create the statement
				PreparedStatement stmt = dbCon.prepareStatement(sql);)
		{
			stmt.setInt(1, id);
			// execute the query
			int rs = stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public Vendor getVendorByName(String name) {
		String sql = "SELECT * FROM VENDOR WHERE vendorName = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Vendor vendor = new Vendor();
				vendor.setName(rs.getString("name"));
				vendor.setCellNumber(rs.getString("cellNumber"));
				vendor.setAddress(rs.getString("address"));
				vendor.setVendorID(rs.getInt("vendorID"));
				vendor.setEmail(rs.getString("email"));
				return vendor;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int addVendorByName(Vendor vendor) {
		String sql = "INSERT INTO vendor (vendorName, cellNumber, address, vendorid, email) VALUES (?, ?, ?, ?, ?)";

		try (
			Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
			PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, vendor.getName());
			stmt.setString(2, vendor.getCellNumber());
			stmt.setString(3, vendor.getAddress());
			stmt.setInt(4, vendor.getVendorID());
			stmt.setString(5, vendor.getEmail());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public int updateVendorByName(Vendor vendor) {
		String sql = "Update vendor Set cellNumber =? , address = ?, vendorID =?,email = ? where vendorName =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{
			stmt.setString(1, vendor.getCellNumber());
			stmt.setString(2, vendor.getAddress());
			stmt.setInt(3, vendor.getVendorID());
			stmt.setString(4, vendor.getEmail());
			stmt.execute();
			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteVendorByName(String name) {
		String sql = "delete from vendor where vendorname = ?";
		try (
				// get a connection to the database
				Connection dbCon = DriverManager.getConnection(databaseURI); // create the statement
				PreparedStatement stmt = dbCon.prepareStatement(sql);)
		{
			stmt.setString(1, name);
			// execute the query
			int rs = stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public Vendor getVendorByEmail(String email) {
		String sql = "SELECT * FROM VENDOR WHERE email = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Vendor vendor = new Vendor();
				vendor.setName(rs.getString("name"));
				vendor.setCellNumber(rs.getString("cellNumber"));
				vendor.setAddress(rs.getString("address"));
				vendor.setVendorID(rs.getInt("vendorID"));
				vendor.setEmail(rs.getString("email"));
				return vendor;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int addVendorByEmail(Vendor vendor) {
		String sql = "INSERT INTO vendor (vendorName, cellNumber, address, vendorid, email) VALUES (?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, vendor.getName());
			stmt.setString(2, vendor.getCellNumber());
			stmt.setString(3, vendor.getAddress());
			stmt.setInt(4, vendor.getVendorID());
			stmt.setString(5, vendor.getEmail());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public int updateVendorByEmail(Vendor vendor) {
		String sql = "Update vendor Set vendorname =?, cellNumber =? , address = ?, vendorID =? where email =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{
			stmt.setString(1, vendor.getName());
			stmt.setString(2, vendor.getCellNumber());
			stmt.setString(3, vendor.getAddress());
			stmt.setInt(4, vendor.getVendorID());
			stmt.setString(5, vendor.getEmail());
			stmt.execute();
			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteVendorByEmail(String email) {
		String sql = "delete from vendor where email = ?";
		try (
				// get a connection to the database
				Connection dbCon = DriverManager.getConnection(databaseURI); // create the statement
				PreparedStatement stmt = dbCon.prepareStatement(sql);)
		{
			stmt.setString(1, email);
			// execute the query
			int rs = stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

}
