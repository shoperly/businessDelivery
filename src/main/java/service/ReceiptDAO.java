package service;

import domain.Receipt;

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
	public Receipt getReceiptByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateReceiptByID(Receipt receipt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReceiptByID(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createRecieptByID(Receipt receipt) {
		// TODO Auto-generated method stub
		return 0;
	}


}
