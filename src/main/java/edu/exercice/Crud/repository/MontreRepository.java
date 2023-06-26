package edu.exercice.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.exercice.Crud.model.Montre;

@Repository
public interface MontreRepository extends JpaRepository<Montre, Integer>{

}
