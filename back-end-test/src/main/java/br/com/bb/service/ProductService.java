package br.com.bb.service;

import java.util.List;

import br.com.bb.entity.Product;

public interface ProductService {
	
	Product findOne(Integer id);

	List<Product> findAll();

	List<Product> findByCategory(Integer id);
}
