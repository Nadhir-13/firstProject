package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> retrieveAllDepartements();
    Department addDepartement (Department d);
    Department updateDepartement (Department d);
    Department retrieveDepartement (Integer idDepart);

}
