package com.formation.jpatp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.jpatp.entities.Ram;
@Repository
public interface RamRepository extends JpaRepository<Ram ,Long>{

}
