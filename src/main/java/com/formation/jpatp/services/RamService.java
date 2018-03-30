package com.formation.jpatp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.jpatp.entities.Ram;
import com.formation.jpatp.repositories.RamRepository;

@Service
public class RamService {

	private final RamRepository ramRepository;

	@Autowired
	public RamService(RamRepository ramRepository) {
		this.ramRepository = ramRepository;
	}

	public void setAllRam(List<Ram> liste) {
		ramRepository.saveAll(liste);
	}

	public void delete(Ram ram) {
		ramRepository.delete(ram);
	}

	public void create(Ram ram) {
		ramRepository.save(ram);
	}

	public void update(Ram ram) {
		ramRepository.save(ram);
	}

	public Long count() {
		return ramRepository.count();
	}

}
