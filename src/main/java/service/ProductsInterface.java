package service;

import domain.Products;

import java.util.UUID;

public interface ProductsInterface {

		public int updateItem(Products product);
		
		public int deleteItem(String id);
		
		public int addItem(Products product);
		
		public Products getItem(String id);
}
