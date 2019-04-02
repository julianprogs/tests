package br.com.bb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT", schema = "TEST")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6887121832724747968L;

	@Id
	@SequenceGenerator(name = "PRODUCT_SEQ", sequenceName = "CATEGORY_SEQ", allocationSize = 1)
	@Column(name = "ID", nullable = false)
    private Long id;

	@Column(name = "NAME")
    private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}