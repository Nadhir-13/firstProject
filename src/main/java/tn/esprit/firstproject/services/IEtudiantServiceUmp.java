package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Niveau;
import tn.esprit.firstproject.repository.EtudiantRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class IEtudiantServiceUmp implements IEtudiantService {

    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants(){
        return etudiantRepository.findAll();

    }
    @Override
    public Etudiant addEtudiant (Etudiant e){
        return etudiantRepository.save(e);

    }
    @Override
    public Etudiant updateEtudiant (Etudiant e){
        return etudiantRepository.save(e);

    }
    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant){
        return etudiantRepository.findById((int)idEtudiant).orElse(null);

    }
    @Override
    public void removeEtudiant(Integer idEtudiant){
        etudiantRepository.deleteById(idEtudiant);

    }

   @Override
    public List<Etudiant> afficherEtudiantDepart(Integer idDepartment) {
        return etudiantRepository.findByDepartmentIdDepart(idDepartment);
    }

      /*  @Override
    public Set<Etudiant> afficherEquipesNiveau(Niveau niveau) {
        return etudiantRepository.findByEquipesNiveau(niveau);
    }
*/
}
