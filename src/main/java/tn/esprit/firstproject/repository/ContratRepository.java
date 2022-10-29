package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Contrat;
@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {
}
