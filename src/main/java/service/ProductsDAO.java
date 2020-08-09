package service;

import domain.Products;
import domain.Receipt;

import java.sql.*;
import java.util.UUID;

public class ProductsDAO implements ProductsInterface{
	private String databaseURI;
    
    public ProductsDAO() {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
    }
    
    public ProductsDAO(final String uri) {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
        this.databaseURI = uri;
    }
	@Override
	public int updateItem(Products product) {
		String sql = "Update products Set productname =?, price =? , details = ?where productid =?";
		try (Connection dbCon = DriverManager.getConnection(databaseURI);
			 PreparedStatement stmt = dbCon.prepareStatement(sql);
		)
		{

			stmt.setString(1, product.getName());
			stmt.setDouble(2, product.getPrice());
			stmt.setString(3, product.getDetails());
			stmt.setString(4, product.getProductID());


			stmt.execute();

			return 1;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}

	@Override
	public int deleteItem(String id) {
		String sql = "delete from products where productid = ?";
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
	public int addItem(Products product) {
		String sql = "INSERT INTO staff (productname, price, details, productid) VALUES (?, ?, ?, ?)";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, product.getName());
			stmt.setDouble(2, product.getPrice());
			stmt.setString(3, product.getDetails());
			stmt.setString(4, product.getProductID());


			stmt.executeUpdate();
			return 1;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Products getItem(String id) {
		String sql = "SELECT * FROM products WHERE productID = ?";

		try (
				Connection dbCon = DriverManager.getConnection(databaseURI, "sa", "sa");
				PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Products product = new Products();
				product.setName(rs.getString("productname"));
				product.setPrice(rs.getDouble("price"));
				product.setDetails(rs.getString("details"));
				product.setProductID(rs.getString("productid"));
				return product;
			}
			return null;
		} catch (SQLException ex) {
			throw new Exceptions(ex.getMessage(), ex);
		}
	}


}
