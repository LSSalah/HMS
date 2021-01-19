package com.exam.show.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exam.show.models.Department;

public interface DepartmentRepo extends CrudRepository<Department, Long>{
	List<Department> findAll();
}
