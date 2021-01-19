package com.exam.show.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exam.show.models.Appointment;

public interface AppointmentRepo extends CrudRepository<Appointment, Long>{
	List<Appointment> findAll();
}
