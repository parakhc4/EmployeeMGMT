package com.upstrail.EmpMGMT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upstrail.EmpMGMT.model.*;
import java.util.*;


public interface LeaveRepository extends JpaRepository<Leave,Long>{
    public List<Leave> findByEmployee_ManagerAndStatus(Manager manager,LeaveStatus status); 
    public List<Leave> findByEmployee(Employee emp);
}
