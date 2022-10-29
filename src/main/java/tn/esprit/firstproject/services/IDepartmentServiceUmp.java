package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Department;
import tn.esprit.firstproject.repository.DepartmentRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class IDepartmentServiceUmp implements IDepartmentService{

    DepartmentRepository departmentRepository;
    @Override
    public List<Department> retrieveAllDepartements(){
        return departmentRepository.findAll();

    }
    @Override
    public Department addDepartement (Department d){
        return departmentRepository.save(d);

    }
    @Override
    public Department updateDepartement (Department d){
        return departmentRepository.save(d);
    }
    @Override
    public Department retrieveDepartement (Integer idDepart){
        return departmentRepository.findById(idDepart).orElse(null);
    }
}
