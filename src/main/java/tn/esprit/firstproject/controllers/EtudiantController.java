package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Department;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Niveau;
import tn.esprit.firstproject.repository.DepartmentRepository;
import tn.esprit.firstproject.repository.EquipeRepository;
import tn.esprit.firstproject.repository.EtudiantRepository;
import tn.esprit.firstproject.services.IEtudiantService;


import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
private DepartmentRepository departmentRepository;
private EtudiantRepository etudiantRepository;
    IEtudiantService iEtudiantService;
    @GetMapping("/retrieveAllEtudiants")
    public List<Etudiant> retrieveAllEtudiants(){
        return iEtudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant etudiant){

        return iEtudiantService.addEtudiant(etudiant);

    }
    @PutMapping(value = "/updateEtudiant")
    public Etudiant updateEtudiant (@RequestBody Etudiant etudiant){
        return iEtudiantService.updateEtudiant(etudiant);
    }

    @GetMapping(value = "/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable Integer idEtudiant){
        return iEtudiantService.retrieveEtudiant(idEtudiant);
    }
    @DeleteMapping(value = "/{idEtudiant}")
    public List<Etudiant> removeEtudiant(@PathVariable("idEtudiant") Integer idEtudiant){
        iEtudiantService.removeEtudiant(idEtudiant);
        return iEtudiantService.retrieveAllEtudiants();

    }
@GetMapping("/afficherEtudiantDepart/{idDepartment}")
    public List<Etudiant> afficherEtudiantDepart(@PathVariable Integer idDepartment){
       return  iEtudiantService.afficherEtudiantDepart(idDepartment);

    }
   /*     @GetMapping("/afficherEquipesNiveau/{niveau}")
    public Set<Etudiant> afficherEquipesNiveau(@PathVariable Niveau niveau){
         Etudiant e2=new Etudiant();
        e2.getClass(Niveau.valueOf(niveau));
        return iEtudiantService.afficherEquipesNiveau(niveau);
    }*/
    @PostMapping("/addEtudiantpar/{idDepart}")
    public Etudiant addEtudiantParDepart(@PathVariable Integer idDepart, @RequestBody Etudiant e) {

        try {
            Department dep = departmentRepository.findById(idDepart).get();
            e.setDepartment(dep);
            Etudiant etudiant = etudiantRepository.save(e);
            return etudiant;

        } catch (Exception exception) {
            System.out.println("depart not exist");
            return null;
        }
    }

        @PostMapping("/addEtudiantparThrow/{idDepart}")
        public Etudiant addEtudiantParDepartment(@PathVariable Integer idDepart, @RequestBody Etudiant e) throws Exception {


                Department dep=departmentRepository.findById(idDepart).orElseThrow(()->new Exception(""));
                e.setDepartment(dep);
                Etudiant etudiant=etudiantRepository.save(e);
                return  etudiant;


         }

}
