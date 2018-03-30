package com.formation.jpatp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ram")
public class Ram {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne()
	private  Ordinateur ordinateur;
	
	public Ordinateur getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
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

	public Ram(Long id, String marque) {
		super();
		this.id = id;
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Ram [id=" + id + ", marque=" + marque + "]";
	}

	public Ram() {

	}
	
	
}
