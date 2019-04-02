package br.com.bb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bb.entity.Toy;

@Repository
public interface ToyRepository  extends JpaRepository<Toy, Integer> {

	@Override
    List<Toy> findAll();
	
	List<Toy> findAllByCategoryId(Integer categoryId);

	Toy findOne(Integer id);

}
