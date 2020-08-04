package service;
import java.util.UUID;

import domain.Staff;

public interface StaffInterface {
	
	public Staff getStaffByID(UUID id);
	public int updateStaffByID(UUID id);
	public int deleteStaffByID(UUID id);
	public int addStaffByID(UUID id);
	
	
	public Staff getStaffByEmail(String email);
	public int updateStaffByEmail(String email);
	public int deleteStaffByEmail(String email);
	public int addStaffByEmail(String email);
	
	
	public Staff getStaffByName(String name);
	public int updateStaffByName(String name);
	public int deleteStaffByName(String name);
	public int addStaffByName(String name);
}
