package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Department;

import java.util.List;

public interface IDetailEquipeService {
    List<Department> retrieveAllDetailEquipe();
    Department addDetailEquipe (Department d);
    Department updateDetailEquipe (Department d);
    Department retrieveDetailEquipe (Integer idDepart);

}
