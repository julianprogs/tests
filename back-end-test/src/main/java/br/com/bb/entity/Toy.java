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
@Table(name = "TOY", schema = "TEST")
public class Toy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9035578097564566648L;

	@Id
	@SequenceGenerator(name = "TOY_SEQ", sequenceName = "TOY_SEQ", allocationSize = 1)
	@Column(name = "TOY_ID", nullable = false)
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}	
}