package com.upstrail.EmpMGMT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upstrail.EmpMGMT.model.Leave;

public interface LeaveRepository extends JpaRepository<Leave,Long>{
    
}
