package br.com.bb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bb.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {

	@Override
    List<Product> findAll();
	
	List<Product> findAllByCategoryId(Integer categoryId);

	Product findOne(Integer id);
	
}
