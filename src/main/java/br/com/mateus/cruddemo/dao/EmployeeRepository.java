package br.com.mateus.cruddemo.dao;

import br.com.mateus.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need code
}
