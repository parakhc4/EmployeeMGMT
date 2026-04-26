package com.upstrail.EmpMGMT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upstrail.EmpMGMT.model.*;
import java.util.*;


public interface LeaveRepository extends JpaRepository<Leave,Long>{
    public List<Leave> viewPendingLeaves(Manager manager,LeaveStatus status); 
}
