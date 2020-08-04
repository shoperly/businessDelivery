package service;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

import domain.Vendor;

public class VendorDAO implements VendorInterface{
	private String databaseURI;
    
    public VendorDAO() {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
    }
    
    public VendorDAO(final String uri) {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
        this.databaseURI = uri;
    }

	@Override
	public Vendor getVendorByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addVendorByID(Vendor vendor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVendorByID(Vendor vendor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteVendorByID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vendor getVendorByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addVendorByName(Vendor vendor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVendorByName(Vendor vendor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteVendorByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vendor getVendorByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addVendorByEmail(Vendor vendor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVendorByEmail(Vendor vendor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteVendorByEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

}
