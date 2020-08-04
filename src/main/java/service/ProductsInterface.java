package service;

import java.util.UUID;

import domain.Products;

public interface ProductsInterface {

		public int updateItem(Products product);
		
		public int deleteItem(UUID id);
		
		public int addItem(Products product);
		
		public Products getItem(UUID id);
}
