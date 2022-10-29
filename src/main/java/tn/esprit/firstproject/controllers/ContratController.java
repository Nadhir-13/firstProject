package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Contrat;
import tn.esprit.firstproject.services.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {

    IContratService iContratService;
    @GetMapping("/retrieveAllContrats")
    public List<Contrat> retrieveAllContrats(){
        return iContratService.retrieveAllContrats();
    }
    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat contrat){
        return  iContratService.updateContrat(contrat);
    }
    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat ce){
        return iContratService.addContrat(ce);
    }
    @GetMapping(value = "/{idContrat}")
    public Contrat retrieveContrat (@PathVariable Integer idContrat){
        return iContratService.retrieveContrat(idContrat) ;
    }
    @DeleteMapping(value = "/{idContrat}")
    public List<Contrat> removeContrat(@PathVariable("idContrat") Integer idContrat){
        iContratService.removeContrat(idContrat);
        return iContratService.retrieveAllContrats();
    }

}
