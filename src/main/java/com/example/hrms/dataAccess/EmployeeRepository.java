package com.example.hrms.dataAccess;

import com.example.hrms.entities.concretes.Employee;
import com.example.hrms.entities.concretes.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
