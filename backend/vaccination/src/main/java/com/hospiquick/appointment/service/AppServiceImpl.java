package com.hospiquick.appointment.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospiquick.appointment.model.Vaccination;
import com.hospiquick.appointment.repository.AppRepository;

@Service
public class AppServiceImpl implements AppService{
	
	@Autowired
	public AppRepository appRepository;
	
	@Autowired
	public EntityManager entityManager;
	
	
	@Override
	public List<Vaccination> getAllAppointments()
	{
	  List<Vaccination> temp=new ArrayList<Vaccination>();
	  Query query=entityManager.createNativeQuery("select * from vaccination order by app_date",Vaccination.class);
	  temp=query.getResultList();
	  System.out.println("sorted Appoinments");
	  System.out.println(temp);
	  return temp;
	}
	
	@Override
	public List<Vaccination> getAppointmentsByEmail(String email)
	{
		System.out.println("Inside get");
		List<Vaccination> temp=new ArrayList<Vaccination>();
	    Query query=entityManager.createNativeQuery("select * from vaccination where pat_email = ?1 order by app_date", Vaccination.class);
	    query.setParameter(1, email);
	    temp=query.getResultList();    
	    System.out.println(temp);	   
		return temp;

	}
	
	@Override
	public String createNewAppointment(Vaccination vaccination)
	{
		appRepository.save(vaccination);
		return "Vaccination Successfully added";
	}
	
	@Override
	public String updateAppointmentById(Long AppId,Vaccination vaccination) {
		appRepository.save(vaccination);
		return "Vaccination Updated Successfully";
	}
	
	@Override
	public String deleteAppointmentById(Long AppId) {
		Vaccination vaccination = appRepository.getById(AppId);
		appRepository.delete(vaccination);
		return "Vaccination Deleted Successfully";
	}


}
