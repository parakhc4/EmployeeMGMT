package com.upstrail.EmpMGMT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upstrail.EmpMGMT.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
