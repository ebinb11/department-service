package com.departmentService.Departmentmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departmentService.Departmentmicroservice.entity.Department;
import com.departmentService.Departmentmicroservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/departmentCreate")
	public Department departmentCreate(@RequestBody Department requestDepartment) {
		log.info("inside departmentCreate  DepartmentController");
		return departmentService.createDepartMent(requestDepartment);
	}
	
	@GetMapping("getDepartment/{id}")
	public Department findDepartmentById(@PathVariable Long id) {
		log.info("inside findDepartmentById DepartmentController");
		return departmentService.findDepartmentById(id);
	}

}
