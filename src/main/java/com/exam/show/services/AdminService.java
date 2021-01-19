package com.exam.show.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exam.show.models.Appointment;
import com.exam.show.models.User;
import com.exam.show.repositories.AppointmentRepo;
import com.exam.show.repositories.UserRepo;

@Service
public class AdminService {
	
	private UserRepo userRepo;
	private AppointmentRepo appointmentRepo;
	
	private List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	
	private List<Appointment> getAllAppointments(){
		return appointmentRepo.findAll();
	}
	
	private List<User> getAllDoctors(){
		String role = "ROLE_DOCTOR";
		return userRepo.findByRoles(role);
	}
	
	private Optional<User> getAdmin(Long id){
		Optional<User> thisAdmin = userRepo.findById(id);
		return thisAdmin;
	}
	
	
	
}
