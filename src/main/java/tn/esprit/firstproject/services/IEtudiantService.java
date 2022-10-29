package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Niveau;

import java.util.List;
import java.util.Set;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant (Etudiant e);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);
   List<Etudiant> afficherEtudiantDepart(Integer idDepartment);
    //Set<Etudiant> afficherEquipesNiveau(Niveau niveau);
}
