package com.exam.show.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.show.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	List<User> findAll();
<<<<<<< HEAD
	@Query( "select u from User u where u.role =':role'" )
	List<User> findByRoles(@Param("role") String role);
=======
	User findByEmail(String email);
>>>>>>> 86e4b6947853a13b91d6547f97c790de6732502e
	
	User findByConfirmationToken(String confirmationToken);
	
}
