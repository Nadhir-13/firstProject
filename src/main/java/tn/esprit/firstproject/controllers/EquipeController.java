package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Equipe;
import tn.esprit.firstproject.services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {
    IEquipeService iEquipeService;
   @RequestMapping("/retrieveAllEquipes")
    public List<Equipe> retrieveAllEquipes() {
        return iEquipeService.retrieveAllEquipes();
    }

    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        return iEquipeService.addEquipe(e);
    }

    @PutMapping("/updateEquipe")
    public Equipe updateEquipe(@RequestBody Equipe e) {
        return iEquipeService.updateEquipe(e);
    }

   @RequestMapping("/{idEquipe}")
    public Equipe retrieveEquipe(@PathVariable(value = "idEquipe") Integer idEquipe) {
        return iEquipeService.retrieveEquipe(idEquipe) ;
    }

}
