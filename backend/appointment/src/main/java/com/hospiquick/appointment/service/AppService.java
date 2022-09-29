package com.hospiquick.appointment.service;

import java.util.List;

import com.hospiquick.appointment.model.Appointment;

public interface AppService {
	
	public List<Appointment> getAllAppointments();
	public String createNewAppointment(Appointment appointment);
	public String updateAppointmentById(Long AppId,Appointment appointment);
	public String deleteAppointmentById(Long AppId);
	
	
	public List<Appointment> getAppointmentsByEmail(String email);
	
}
