package net.javaguides.springboot.springboot.crudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springboot.crudrestfulwebservices.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
