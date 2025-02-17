package com.ems.ems_backend.mapper;

import com.ems.ems_backend.dto.DepartmentDto;
import com.ems.ems_backend.entity.Department;

public class DepartmentMapper {

	// convert dept jpa entity to dept dto
	public static DepartmentDto mapToDepartmentDto(Department department) {
		return new DepartmentDto(
					department.getId(),
					department.getDepartmentName(),
					department.getDepartmentDesc()
				);
				
	}
	
	// convert department dto to department jpa entity
	public static Department mapToDepartment(DepartmentDto departmentDto) {
		return new Department(
					departmentDto.getId(),
					departmentDto.getDepartmentName(),
					departmentDto.getDepartmentDesc()
				);
	}
	
	
}
