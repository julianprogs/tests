package br.com.bb.service;

import java.util.List;

import br.com.bb.entity.Medicine;

public interface MedicineService {
	
	Medicine findOne(Integer id);

	List<Medicine> findAll();

	List<Medicine> findByCategory(Integer id);
}
