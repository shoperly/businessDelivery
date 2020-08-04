package service;

import java.util.UUID;

import domain.Receipt;

public interface ReceiptInterface {

		public Receipt getReceiptByID(UUID id);
		
		public int updateReceiptByID(Receipt receipt);
		
		public int deleteReceiptByID(UUID id);
		
		public int createRecieptByID(Receipt receipt);
}
