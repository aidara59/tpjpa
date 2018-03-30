package com.formation.jpatp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Ordinateur")
public class Ordinateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="ordinateur")
	private List<Ram> ram;
	
	public List<Ram> getRam() {
		return ram;
	}

	public void setRam(List<Ram> ram) {
		this.ram = ram;
	}

	@Column(name = "marque", nullable = false, length = 250)
	private String marque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Ordinateur(Long id, String marque) {
		super();
		this.id = id;
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Ordinateur [id=" + id + ", marque=" + marque + "]";
	}

	public Ordinateur() {

	}
	
	
}
