package br.com.bb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.entity.Toy;
import br.com.bb.repository.ToyRepository;
import br.com.bb.service.ToyService;

@Service
public class ToyServiceImpl implements ToyService {

	@Autowired
	private ToyRepository toyRepository;

	@Override
	public Toy findOne(Integer integer) {

		return toyRepository.findOne(integer);
	}

	@Override
	public List<Toy> findAll() {

		return toyRepository.findAll();
	}

	@Override
	public List<Toy> findByCategory(Integer id) {

		return toyRepository.findAllByCategoryId(id);
	}
}