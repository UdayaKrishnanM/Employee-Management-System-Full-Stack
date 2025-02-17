package com.ems.ems_backend.service;

import java.util.List;

import com.ems.ems_backend.dto.DepartmentDto;

public interface DepartmentService {

	DepartmentDto createDepartment(DepartmentDto departmentdto);

	DepartmentDto getDepartmentById(Long id);
	
	List<DepartmentDto> getAllDepartment();
	
	DepartmentDto updateDepartment(Long id, DepartmentDto department);
	
	void deleteDepartment(Long id);
	
}
