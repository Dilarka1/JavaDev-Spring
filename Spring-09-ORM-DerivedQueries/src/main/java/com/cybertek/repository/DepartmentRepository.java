package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

List<Department>findByDepartment(String department);

List<Department>findByDivision(String division);

List<Department>findByDivisionIs(String division);

List<Department>findByDivisionEquals(String division);




}
