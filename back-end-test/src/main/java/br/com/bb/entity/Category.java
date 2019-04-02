package br.com.bb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY", schema = "TEST")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5955699321464484958L;

	@Id
	@SequenceGenerator(name = "CATEGORY_SEQ", sequenceName = "CATEGORY_SEQ", allocationSize = 1)
	@Column(name = "CATEGORY_ID", nullable = false)
    private Integer id;

	@Column(name = "NAME")
    private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    }

