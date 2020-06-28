package com.pojo;

import java.util.Date;

public class Patient {

	private int id;
	
	private String ssnId;
	
	private String name;
	private int age;
	
	private Date dateOfAdmission;
	
	private String typeOfBed;
	private String address;
	private String city;
	private String state;
	private boolean status;
	
	
	public Patient(String ssnId, String name, int age, Date dateOfAdmission, String typeOfBed, String address,
			String city, String state, boolean status) {
		super();
		this.ssnId = ssnId;
		this.name = name;
		this.age = age;
		this.dateOfAdmission = dateOfAdmission;
		this.typeOfBed = typeOfBed;
		this.address = address;
		this.city = city;
		this.state = state;
		this.status = status;
	}


	public Patient() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSsnId() {
		return ssnId;
	}


	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}


	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}


	public String getTypeOfBed() {
		return typeOfBed;
	}


	public void setTypeOfBed(String typeOfBed) {
		this.typeOfBed = typeOfBed;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	 
}
