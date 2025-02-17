package com.ems.ems_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.ems_backend.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
