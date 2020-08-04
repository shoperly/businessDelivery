package service;

import java.util.UUID;

import domain.Products;

public class ProductsDAO implements ProductsInterface{
	private String databaseURI;
    
    public ProductsDAO() {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
    }
    
    public ProductsDAO(final String uri) {
        this.databaseURI = "jdbc:h2:tcp://localhost:9092/~/310project";
        this.databaseURI = uri;
    }
	@Override
	public int updateItem(Products product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItem(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addItem(Products product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Products getItem(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}


}
