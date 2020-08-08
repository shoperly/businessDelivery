package service;

import domain.Products;

import java.util.UUID;

public class ProductsDAO implements ProductsInterface{
	private String databaseURI;
    
    public ProductsDAO() {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
    }
    
    public ProductsDAO(final String uri) {
        this.databaseURI = "jdbc:h2:~/Downloads/h2/bin/INFO301/301";
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
