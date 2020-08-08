package service;

import domain.Receipt;

import java.util.UUID;

public interface ReceiptInterface {

		public Receipt getReceiptByID(UUID id);
		
		public int updateReceiptByID(Receipt receipt);
		
		public int deleteReceiptByID(UUID id);
		
		public int createRecieptByID(Receipt receipt);
}
