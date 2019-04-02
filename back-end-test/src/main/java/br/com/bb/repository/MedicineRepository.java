package br.com.bb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bb.entity.Medicine;

@Repository
public interface MedicineRepository  extends JpaRepository<Medicine, Integer> {

	@Override
    List<Medicine> findAll();
	
	List<Medicine> findAllByCategoryId(Integer categoryId);

	Medicine findOne(Integer id);
	
}
