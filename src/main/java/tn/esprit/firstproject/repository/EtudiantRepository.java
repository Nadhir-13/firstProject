package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Niveau;

import java.util.List;
import java.util.Set;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    List<Etudiant> findByDepartmentIdDepart(Integer id);
    Set<Etudiant> findByEquipesNiveau(Niveau niveau);

}
