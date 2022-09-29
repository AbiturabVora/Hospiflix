package com.hospiquick.appointment.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.Query;

import com.hospiquick.appointment.model.Vaccination;

public interface AppService {
	
	public List<Vaccination> getAllAppointments();
	public String createNewAppointment(Vaccination vaccination);
	public String updateAppointmentById(Long AppId,Vaccination vaccination);
	public String deleteAppointmentById(Long AppId);
	
	
	public List<Vaccination> getAppointmentsByEmail(String email);
	
}
