package br.com.bb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bb.entity.Category;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {

	@Override
    List<Category> findAll();
}
