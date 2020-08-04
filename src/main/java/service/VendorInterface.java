package service;

import java.util.UUID;

import domain.Vendor;

public interface VendorInterface {

	public Vendor getVendorByID(UUID id);
	public int addVendorByID(UUID id);
	public int updateVendorByID(UUID id);
	public int deleteVendorByID(UUID id);
	
	public Vendor getVendorByName(String name);
	public int addVendorByName(String name);
	public int updateVendorByName(String name);
	public int deleteVendorByName(String name);
	
	public Vendor getVendorByEmail(String email);
	public int addVendorByEmail(String email);
	public int updateVendorByEmail(String email);
	public int deleteVendorByEmail(String email);
}

