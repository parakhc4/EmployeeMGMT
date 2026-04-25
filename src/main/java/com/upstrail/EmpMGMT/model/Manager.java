package com.upstrail.EmpMGMT.model;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Manager extends User{

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;


}
