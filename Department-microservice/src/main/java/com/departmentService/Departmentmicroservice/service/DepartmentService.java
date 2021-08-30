package com.departmentService.Departmentmicroservice.service;

import com.departmentService.Departmentmicroservice.entity.Department;

public interface DepartmentService {

	Department createDepartMent(Department requestDepartment);

	Department findDepartmentById(Long id);
}
