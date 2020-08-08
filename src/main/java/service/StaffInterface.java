package service;

import domain.Staff;

import java.util.UUID;

public interface StaffInterface {
	
	public Staff getStaffByID(int id);
	public int updateStaffByID(Staff staff);
	public int deleteStaffByID(int id);
	public int addStaffByID(Staff staff);
	
	
	public Staff getStaffByEmail(String email);
	public int updateStaffByEmail(Staff staff);
	public int deleteStaffByEmail(String email);
	public int addStaffByEmail(Staff staff);
	
	
	public Staff getStaffByName(String name);
	public int updateStaffByName(Staff staff);
	public int deleteStaffByName(String name);
	public int addStaffByName(Staff staff);
}
