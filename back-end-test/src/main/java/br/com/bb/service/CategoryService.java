package br.com.bb.service;

import java.util.List;

import br.com.bb.entity.Category;

public interface CategoryService {

    /**
     * Listar todos os registros de {@link Category}
     * @return {@link List<Category>}
     */
    List<Category> findAll();

}