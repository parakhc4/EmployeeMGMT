package com.upstrail.EmpMGMT.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Data
@Entity
public class Employee extends User{
    
    @ManyToOne
    @JoinColumn(name="managerId")
    private Manager manager;
    private int leaveBalance = 12;
    private Boolean payCutApplied;
    
}
