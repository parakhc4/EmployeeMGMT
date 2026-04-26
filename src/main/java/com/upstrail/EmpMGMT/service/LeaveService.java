package com.upstrail.EmpMGMT.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upstrail.EmpMGMT.model.Employee;
import com.upstrail.EmpMGMT.model.Leave;
import com.upstrail.EmpMGMT.model.LeaveStatus;
import com.upstrail.EmpMGMT.model.Manager;
import com.upstrail.EmpMGMT.repository.LeaveRepository;

@Service
public class LeaveService {
    @Autowired
    private LeaveRepository leaveRepository;
    
    public Leave applyLeave(Employee emp, LocalDate startDate, LocalDate endDate){
        long number_of_days = ChronoUnit.DAYS.between(startDate, endDate);
        Leave leaveApplied = new Leave();
        leaveApplied.setEmployee(emp);
        leaveApplied.setStartDate(startDate);
        leaveApplied.setEndDate(endDate);

        if (number_of_days <=2){
            leaveApplied.setStatus(LeaveStatus.APPROVED);
        }
        return leaveRepository.save(leaveApplied);
    }

    public Leave getLeaveByID(Long leaveId){
        return leaveRepository.findById(leaveId).orElseThrow(()->new RuntimeException("leaveNotFound"));
    }
    
}
