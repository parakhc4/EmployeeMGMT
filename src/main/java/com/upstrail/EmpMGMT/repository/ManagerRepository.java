package com.upstrail.EmpMGMT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upstrail.EmpMGMT.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Long>{
    
}
