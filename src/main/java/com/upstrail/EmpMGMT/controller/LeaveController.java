package com.upstrail.EmpMGMT.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.upstrail.EmpMGMT.service.*;
import com.upstrail.EmpMGMT.model.*;
import com.upstrail.EmpMGMT.repository.LeaveRepository;

import java.util.*;

@RestController
public class LeaveController {
    @Autowired
    private LeaveService leaveService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/leaves")
    public Leave applyLeave(@RequestBody Employee emp,
    @RequestParam LocalDate start,
    @RequestParam LocalDate end)
    {
            return leaveService.applyLeave(emp, start, end);
    }

    @PatchMapping("/api/leaves/{id}/status")
    public Leave updateLeave(@PathVariable Long id,
        @RequestParam LeaveStatus status){
            if (status == LeaveStatus.APPROVED){
                return (managerService.approveLeave(id));
            }
            else{
                return (managerService.rejectLeave(id));
            }
        }

    @GetMapping("/api/leaves/{id}")
    public Leave getLeaveByID(@PathVariable Long id){
        return leaveService.getLeaveByID(id);
    }

    @GetMapping("/api/leaves")
    public List<Leave> getEmpLeaves(@RequestParam Long empId){
        return employeeService.getAllLeaves(empId);
    }
    
    
}
