package com.hospiquick.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospiquick.appointment.model.Vaccination;
import com.hospiquick.appointment.service.AppService;

@CrossOrigin(origins = "http://localhost:3000",allowedHeaders = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class AppController {
	
	 	@Autowired
	 	public AppService appService;
	
	 	
	 	
		@RequestMapping(value="/home", method = RequestMethod.GET)
	    public String home()
	    {
			return "hello";
	    }
		
		@GetMapping("/vaccination")
		public List<Vaccination> getAllAppointments(){
			return this.appService.getAllAppointments();
		}
		
		@GetMapping("/vaccination/{patEmail}")
		public List<Vaccination> getAppointmentsByEmail(@PathVariable String patEmail)
		{
			return this.appService.getAppointmentsByEmail(patEmail);
		}
		
		@PostMapping("/vaccination")
		public String postNewQuery(@RequestBody Vaccination vaccination) {
			return this.appService.createNewAppointment(vaccination);
		}
		
		@DeleteMapping("/vaccination/{AppId}")
		public String deleteAppointment(@PathVariable("AppId") Long AppId) {
			return this.appService.deleteAppointmentById(AppId);
		}
		

		@PutMapping("/vaccination/{AppId}")
		public String updateAppointmentById(@PathVariable("AppId") Long AppId,@RequestBody Vaccination vaccination) {
			System.out.println("Updated sucessfully");
			return this.appService.updateAppointmentById(AppId,vaccination);
		}
		
	
}
