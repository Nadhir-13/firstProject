package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Contrat;
import tn.esprit.firstproject.repository.ContratRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class IContratServiceUmp implements IContratService{

    ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAllContrats(){
        return contratRepository.findAll();
    }
    @Override
    public Contrat updateContrat (Contrat ce){
      return  contratRepository.save(ce);
    }
    @Override
    public Contrat addContrat (Contrat ce){
        return contratRepository.save(ce);
    }
    @Override
    public Contrat retrieveContrat (Integer idContrat){
      return  contratRepository.findById((Integer)idContrat).orElse(null);
    }
    @Override
    public void removeContrat(Integer idContrat){
        contratRepository.deleteById(idContrat);
    }

}
