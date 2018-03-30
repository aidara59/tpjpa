package com.formation.jpatp.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.jpatp.entities.Ordinateur;
import com.formation.jpatp.entities.Ram;
import com.formation.jpatp.services.OrdinateurService;
import com.formation.jpatp.services.RamService;

@RestController
public class Controller implements Serializable {
	private static final Long serialVersionUID = 1L;

	private List<Ordinateur> listeOrdinateur = new ArrayList<>(Arrays.asList(new Ordinateur(1L, "Dell"),
			new Ordinateur(2L, "TOSHIBA"), new Ordinateur(3L, "Sonny"), new Ordinateur(4L, "Asus")));
	private final OrdinateurService ordinateurService;
	private final RamService ramService;

	@Autowired
	public Controller(OrdinateurService ordinateurService, RamService ramService) {
		this.ordinateurService = ordinateurService;
		this.ramService = ramService;

	}

	@GetMapping("/ordinateur")
	public List<Ordinateur> getAllRest() {
		ordinateurService.setAllOrdinateur(listeOrdinateur);
		return ordinateurService.getAllOrdinateur();

	}

	@PostMapping("/ordinateur")
	public void addRam(@RequestBody Ram ram) {
        ramService.create(ram);
	}
	@RequestMapping(value = "/ordinateur", method = RequestMethod.DELETE)
	public void deleteRam(@RequestBody Ram ram) {
        ramService.delete(ram);
	}
	@RequestMapping(value = "/ordinateur", method = RequestMethod.PUT)
	public void updateRam(@RequestBody Ram ram) {
        ramService.update(ram);
	}
}