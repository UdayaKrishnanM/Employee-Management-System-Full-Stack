package com.ems.ems_backend.dto;

public class DepartmentDto {

	
	private Long id;
	
	private String departmentName;
	
	private String departmentDesc;

	public DepartmentDto(Long id, String departmentName, String departmentDesc) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentDesc = departmentDesc;
	}

	public DepartmentDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDesc() {
		return departmentDesc;
	}

	public void setDepartmentDesc(String departmentDesc) {
		this.departmentDesc = departmentDesc;
	}
	
}


