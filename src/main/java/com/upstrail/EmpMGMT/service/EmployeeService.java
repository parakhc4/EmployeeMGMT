package com.upstrail.EmpMGMT.service;

import com.upstrail.EmpMGMT.repository.LeaveRepository;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upstrail.EmpMGMT.model.*;

@Service
public class EmployeeService {
    @Autowired
    private LeaveRepository leaveRepository;

    public List<Leave> getAllLeaves(Long empId){
        return leaveRepository.findAllById(empId).orElseThrow(()->new RuntimeException("emp id not found"));
    }
    
}
