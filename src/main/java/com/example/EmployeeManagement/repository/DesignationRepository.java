package com.example.EmployeeManagement.repository;

import com.example.EmployeeManagement.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
