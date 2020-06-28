package com.pojo;


public class Diagnostics {

	private int id;
	private String name;

	private double charge;
	
	
	public Diagnostics() {
	}


	public Diagnostics(String name, double charge) {
		super();
		this.name = name;
		this.charge = charge;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getCharge() {
		return charge;
	}


	public void setCharge(double charge) {
		this.charge = charge;
	}
	
	
	
}
