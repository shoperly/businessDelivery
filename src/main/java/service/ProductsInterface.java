package service;

import java.util.UUID;

import domain.Products;

public interface ProductsInterface {

		public int updateItem(UUID id);
		
		public int deleteItem(UUID id);
		
		public int addItem(UUID id);
		
		public Products getItem(UUID id);
}
