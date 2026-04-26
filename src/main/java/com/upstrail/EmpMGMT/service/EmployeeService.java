package com.upstrail.EmpMGMT.service;

import com.upstrail.EmpMGMT.repository.EmployeeRepository;
import com.upstrail.EmpMGMT.repository.LeaveRepository;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upstrail.EmpMGMT.model.*;

@Service
public class EmployeeService {
    @Autowired
    private LeaveRepository leaveRepository;
    @Autowired
    private EmployeeRepository empRepository;

    public List<Leave> getAllLeaves(Long empId){
        Employee emp = empRepository.findById(empId)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
        return leaveRepository.findByEmployee(emp);
    }
    
}
