package br.com.bb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.entity.Medicine;
import br.com.bb.repository.MedicineRepository;
import br.com.bb.service.MedicineService;

@Service
public class MediceServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public Medicine findOne(Integer integer) {

		return medicineRepository.findOne(integer);
	}

	@Override
	public List<Medicine> findAll() {

		return medicineRepository.findAll();
	}

	@Override
	public List<Medicine> findByCategory(Integer id) {

		return medicineRepository.findAllByCategoryId(id);
	}

}