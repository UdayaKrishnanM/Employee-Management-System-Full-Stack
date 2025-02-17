package com.ems.ems_backend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.ems_backend.dto.DepartmentDto;
import com.ems.ems_backend.entity.Department;
import com.ems.ems_backend.entity.Employee;
import com.ems.ems_backend.exception.ResourceNotFoundException;
import com.ems.ems_backend.mapper.DepartmentMapper;
import com.ems.ems_backend.mapper.EmployeeMapper;
import com.ems.ems_backend.repo.DepartmentRepo;
import com.ems.ems_backend.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Override
	public DepartmentDto createDepartment(DepartmentDto departmentdto) {
		Department department = DepartmentMapper.mapToDepartment(departmentdto);
		Department savedDepartment = departmentRepo.save(department);
		return DepartmentMapper.mapToDepartmentDto(savedDepartment);
	}
	
		
	@Override
	public DepartmentDto getDepartmentById(Long employeeId) {
		Department getDepartment = departmentRepo.findById(employeeId)
				.orElseThrow(() ->
					new ResourceNotFoundException("Employee is not exists with given id : " + employeeId));
		
		return DepartmentMapper.mapToDepartmentDto(getDepartment);
	}
	
	
	@Override
	public List<DepartmentDto> getAllDepartment(){
		List<Department> getDepartments = departmentRepo.findAll();
        return getDepartments.stream().map((dept) -> DepartmentMapper.mapToDepartmentDto(dept))
        		.collect(Collectors.toList());
	}
	
	@Override
	public DepartmentDto updateDepartment(Long id, DepartmentDto departmentDto) {
		
		Department department = departmentRepo.findById(id).orElseThrow(() ->
			new ResourceNotFoundException("Employee id not exists with the given id :" + id));
		
		department.setDepartmentDesc(departmentDto.getDepartmentDesc());
		department.setDepartmentName(departmentDto.getDepartmentName());
		Department updatedDepartment = departmentRepo.save(department);
		
		return DepartmentMapper.mapToDepartmentDto(updatedDepartment);
	}
	
	@Override
	public void deleteDepartment(Long id) {
		
		Department dept = departmentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee id not found"));
		departmentRepo.deleteById(id);
		
		
	}
	
	
	

}
