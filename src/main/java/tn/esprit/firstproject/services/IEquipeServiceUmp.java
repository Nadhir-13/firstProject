package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Equipe;
import tn.esprit.firstproject.repository.EquipeRepository;


import java.util.List;
@Service
@AllArgsConstructor
public class IEquipeServiceUmp implements IEquipeService{

    EquipeRepository equipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById((int)idEquipe).orElse(null);
    }
}
