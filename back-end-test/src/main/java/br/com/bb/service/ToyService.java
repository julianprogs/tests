package br.com.bb.service;

import java.util.List;

import br.com.bb.entity.Toy;

public interface ToyService {
	
	Toy findOne(Integer id);

	List<Toy> findAll();

	List<Toy> findByCategory(Integer id);
	
}
