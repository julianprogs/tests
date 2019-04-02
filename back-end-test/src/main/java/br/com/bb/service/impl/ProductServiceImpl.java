package br.com.bb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.entity.Product;
import br.com.bb.repository.ProductRepository;
import br.com.bb.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product findOne(Integer integer) {

		return productRepository.findOne(integer);
	}

	@Override
	public List<Product> findAll() {

		return productRepository.findAll();
	}

	@Override
	public List<Product> findByCategory(Integer id) {

		return productRepository.findAllByCategoryId(id);
	}
}