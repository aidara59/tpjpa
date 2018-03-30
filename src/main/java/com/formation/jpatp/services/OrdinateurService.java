package com.formation.jpatp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.jpatp.entities.Ordinateur;
import com.formation.jpatp.entities.Ram;
import com.formation.jpatp.repositories.OrdinateurRepository;
import com.formation.jpatp.repositories.RamRepository;

@Service

public class OrdinateurService {
	@Autowired
	OrdinateurRepository ordinateurRepository;

	public OrdinateurService(OrdinateurRepository ordinateurRepository) {
		this.ordinateurRepository = ordinateurRepository;

	}

	public void setAllOrdinateur(List<Ordinateur> liste) {
		ordinateurRepository.saveAll(liste);
	}

	public void delete(Ordinateur ordinateur) {
		ordinateurRepository.delete(ordinateur);
	}

	public void create(Ordinateur ordinateur) {
		ordinateurRepository.save(ordinateur);
	}

	public void update(Ordinateur ordinateur) {
		ordinateurRepository.save(ordinateur);
	}

	public Long count() {
		return ordinateurRepository.count();
	}

	public List<Ordinateur> getAllOrdinateur() {

		return ordinateurRepository.findAll();
	}
}
