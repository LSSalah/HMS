package com.exam.show.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.exam.show.models.Role;

public interface RoleRepo extends CrudRepository<Role, Long>{
	List<Role> findAll();
}
