package com.hospiquick.appointment.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Date;

@Entity
public class Vaccination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long AppId;
	
	public Vaccination(long appId, String patName, int patAge, Date appDate, Time appTime, String vaccine,
			String patEmail) {
		super();
		AppId = appId;
		this.patName = patName;
		this.patAge = patAge;
		this.appDate = appDate;
		this.appTime = appTime;
		this.vaccine = vaccine;
		this.patEmail = patEmail;
	}

	public long getAppId() {
		return AppId;
	}

	public void setAppId(long appId) {
		AppId = appId;
	}
	@Column(name="patName")
	private String patName;
	
	@Column(name="patAge")
	private int patAge;
	
	@Column(name="appDate")
	private Date appDate;
	
	@Column(name="appTime")
	private Time appTime;
	
	@Column(name="vaccine")
	private String vaccine;
	
	@Column(name="patEmail")
	private String patEmail;
	
	public Vaccination() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Appointment [AppId=" + AppId + ", patName=" + patName + ", patAge=" + patAge + ", appDate=" + appDate
				+ ", appTime=" + appTime + ", vaccine=" + vaccine + ", patEmail=" + patEmail + "]";
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public int getPatAge() {
		return patAge;
	}
	public void setPatAge(int patAge) {
		this.patAge = patAge;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public Time getAppTime() {
		return appTime;
	}
	public void setAppTime(Time appTime) {
		this.appTime = appTime;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public String getpatEmail() {
		return patEmail;
	}
	public void setpatEmail(String patEmail) {
		this.patEmail = patEmail;
	}
	
	
	
}
