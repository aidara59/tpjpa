package com.formation.jpatp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.jpatp.entities.Ordinateur;
@Repository
public interface OrdinateurRepository extends JpaRepository<Ordinateur, Long>{

}
