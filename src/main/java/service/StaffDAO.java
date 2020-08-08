package service;

import domain.Staff;
import domain.Vendor;

import java.sql.*;
import java.util.UUID;

public class StaffDAO implements StaffInterface{
	private String databaseURI;
    
    public StaffDAO() {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
    }
    
    public StaffDAO(final String uri) {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
        this.databaseURI = uri;
    }
	
	@Override
	public Staff getStaffByID(int id) {
		String sql = "SELECT * FROM staff WHERE staffid = ?";

		try (
			Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
			PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Staff staff = new Staff();
				staff.setName(rs.getString("staffname"));
				staff.setCellNumber(rs.getString("cellNumber"));
				staff.setAddress(rs.getString("address"));
				staff.setStaffID(rs.getInt("staffID"));
				staff.setEmail(rs.getString("email"));
				staff.setLastName(rs.getString("lastname"));
				return staff;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int updateStaffByID(Staff staff) {
		String sql = "Update staff Set staffname =?, lastName =? , address = ?, cellnumber = ?, email = ? where staffid =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{

			stmt.setString(1, staff.getName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getAddress());
			stmt.setString(4, staff.getCellNumber());
			stmt.setString(5, staff.getEmail());
			stmt.setInt(6, staff.getStaffID());

			stmt.execute();

			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteStaffByID(int id) {
		String sql = "delete from staff where staffid = ?";
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
	public int addStaffByID(Staff staff) {
		String sql = "INSERT INTO staff (staffname, lastname, address, cellnumber, email, staffid) VALUES (?, ?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, staff.getName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getAddress());
			stmt.setString(4, staff.getCellNumber());
			stmt.setString(5, staff.getEmail());
			stmt.setInt(6, staff.getStaffID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Staff getStaffByEmail(String email) {
		String sql = "SELECT * FROM staff WHERE email = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Staff staff = new Staff();
				staff.setName(rs.getString("staffname"));
				staff.setCellNumber(rs.getString("cellNumber"));
				staff.setAddress(rs.getString("address"));
				staff.setStaffID(rs.getInt("staffID"));
				staff.setEmail(rs.getString("email"));
				staff.setLastName(rs.getString("lastname"));
				return staff;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int updateStaffByEmail(Staff staff) {
		String sql = "Update staff Set staffname =?, lastName =? , address = ?, cellnumber = ?, staffid =? where email = ?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{

			stmt.setString(1, staff.getName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getAddress());
			stmt.setString(4, staff.getCellNumber());
			stmt.setInt(5, staff.getStaffID());
			stmt.setString(6, staff.getEmail());

			stmt.execute();

			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteStaffByEmail(String email) {
		String sql = "delete from staff where email = ?";
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

	@Override
	public int addStaffByEmail(Staff staff) {
		String sql = "INSERT INTO staff (staffname, lastname, address, cellnumber, email, staffid) VALUES (?, ?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, staff.getName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getAddress());
			stmt.setString(4, staff.getCellNumber());
			stmt.setString(5, staff.getEmail());
			stmt.setInt(6, staff.getStaffID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Staff getStaffByName(String name) {
		String sql = "SELECT * FROM staff WHERE name = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Staff staff = new Staff();
				staff.setName(rs.getString("staffname"));
				staff.setCellNumber(rs.getString("cellNumber"));
				staff.setAddress(rs.getString("address"));
				staff.setStaffID(rs.getInt("staffID"));
				staff.setEmail(rs.getString("email"));
				staff.setLastName(rs.getString("lastname"));
				return staff;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int updateStaffByName(Staff staff) {
		String sql = "Update staff Set lastName =? , address = ?, cellnumber = ?, email =?, staffid =? where staffname = ?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{
			stmt.setString(1, staff.getLastName());
			stmt.setString(2, staff.getAddress());
			stmt.setString(3, staff.getCellNumber());
			stmt.setString(4, staff.getEmail());
			stmt.setInt(5, staff.getStaffID());
			stmt.setString(6, staff.getName());

			stmt.execute();

			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteStaffByName(String name) {
		String sql = "delete from staff where staffname = ?";
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
	public int addStaffByName(Staff staff) {
		String sql = "INSERT INTO staff (staffname, lastname, address, cellnumber, email, staffid) VALUES (?, ?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, staff.getName());
			stmt.setString(2, staff.getLastName());
			stmt.setString(3, staff.getAddress());
			stmt.setString(4, staff.getCellNumber());
			stmt.setString(5, staff.getEmail());
			stmt.setInt(6, staff.getStaffID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

}
