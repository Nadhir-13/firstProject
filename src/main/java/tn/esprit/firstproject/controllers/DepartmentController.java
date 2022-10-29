package tn.esprit.firstproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Department;
import tn.esprit.firstproject.services.IDepartmentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    IDepartmentService iDepartmentService;
   @RequestMapping("/retrieveAllDepartements")
    public List<Department> retrieveAllDepartements(){
        return iDepartmentService.retrieveAllDepartements();

    }
    @PostMapping("/addDepartement")
    public Department addDepartement (@RequestBody Department d){
        return iDepartmentService.addDepartement(d);

    }
    @PutMapping("/updateDepartement")
    public Department updateDepartement (@RequestBody Department d){
        return iDepartmentService.updateDepartement(d);
    }
    @RequestMapping("/{idDepart}")
    public Department retrieveDepartement (@PathVariable Integer idDepart){
        return iDepartmentService.retrieveDepartement(idDepart);
    }
}
