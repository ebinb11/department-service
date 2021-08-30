package com.departmentService.Departmentmicroservice.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentService.Departmentmicroservice.entity.Department;
import com.departmentService.Departmentmicroservice.exception.ResourceNotFoundException;
import com.departmentService.Departmentmicroservice.repository.DepartmentRepository;
import com.departmentService.Departmentmicroservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department createDepartMent(Department requestDepartment) {
		log.info("inside createDepartMent of DepartmentService" );
		return departmentRepository.save(requestDepartment);
	}

	@Override
	public Department findDepartmentById(Long id) {
		log.info("inside findDepartmentById of DepartmentService" );
		Optional<Department> departmentGet = departmentRepository.findById(id);
		if (!departmentGet.isPresent()) {
			throw new ResourceNotFoundException("data Not found!");
		}
		return departmentGet.get();
	}
}
