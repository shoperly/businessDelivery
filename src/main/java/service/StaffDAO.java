package service;

import domain.Staff;

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
	public Staff getStaffByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStaffByID(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStaffByID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addStaffByID(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Staff getStaffByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStaffByEmail(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStaffByEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addStaffByEmail(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Staff getStaffByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStaffByName(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStaffByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addStaffByName(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

}
