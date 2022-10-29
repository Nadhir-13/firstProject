package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Department;
import tn.esprit.firstproject.entities.Equipe;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
