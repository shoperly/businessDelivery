package service;

import domain.Receipt;

import java.util.UUID;

public interface ReceiptInterface {

		public Receipt getReceiptByID(int id);
		
		public int updateReceiptByID(Receipt receipt);
		
		public int deleteReceiptByID(int id);
		
		public int createRecieptByID(Receipt receipt);
}
