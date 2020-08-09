package service;

import domain.Receipt;
import domain.Staff;

import java.sql.*;
import java.util.UUID;

public class ReceiptDAO implements ReceiptInterface{
	private String databaseURI;
    
    public ReceiptDAO() {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
    }
    
    public ReceiptDAO(final String uri) {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
        this.databaseURI = uri;
    }
	@Override
	public Receipt getReceiptByID(int id) {
		String sql = "SELECT * FROM receipt WHERE customerid = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Receipt receipt = new Receipt();
				receipt.setCustID(rs.getInt("custid"));
				receipt.setDate(rs.getDate("dateofreceipt"));
				receipt.setTotal(rs.getDouble("total"));
				receipt.setLocation(rs.getString("location"));
				receipt.setReceiptID(rs.getString("receiptID"));
				return receipt;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int updateReceiptByID(Receipt receipt) {
		String sql = "Update staff Set custid =?, total =? , dateofreceipt = ?, location = ?,  where receiptid =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{

			stmt.setInt(1, receipt.getCustID());
			stmt.setDouble(2, receipt.getTotal());
			stmt.setDate(3, receipt.getDate());
			stmt.setString(4, receipt.getLocation());
			stmt.setString(5, receipt.getReceiptID());

			stmt.execute();

			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteReceiptByID(int id) {
		String sql = "delete from receipt where receiptid = ?";
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
	public int createRecieptByID(Receipt receipt) {
		String sql = "INSERT INTO staff (custid, total, dateofreceipt, location, receiptid) VALUES (?, ?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setInt(1, receipt.getCustID());
			stmt.setDouble(2, receipt.getTotal());
			stmt.setDate(3, receipt.getDate());
			stmt.setString(4, receipt.getLocation());
			stmt.setString(5, receipt.getReceiptID());

			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}


}
