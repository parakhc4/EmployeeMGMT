package com.upstrail.EmpMGMT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upstrail.EmpMGMT.model.*;
import com.upstrail.EmpMGMT.repository.LeaveRepository;
import com.upstrail.EmpMGMT.repository.ManagerRepository;

import java.util.*;

@Service
public class ManagerService {
    
    @Autowired
    private LeaveRepository leaveRepo;

    public Leave approveLeave(Long leaveId){
        Leave leave = leaveRepo.findById(leaveId).orElseThrow(() -> new RuntimeException("Leave not found"));
        leave.setStatus(LeaveStatus.APPROVED);
        return leaveRepo.save(leave);
    }

    public Leave rejectLeave(Long leaveId){
        Leave leave = leaveRepo.findById(leaveId).orElseThrow(() -> new RuntimeException("Leave not found"));
        leave.setStatus(LeaveStatus.DENIED);
        return leaveRepo.save(leave);
    }

    public List<Leave> viewPendingLeaves(Manager manager, LeaveStatus status)
    {
        return leaveRepo.findByEmployee_ManagerAndStatus(manager, LeaveStatus.PENDING);
    }
}