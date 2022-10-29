package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
