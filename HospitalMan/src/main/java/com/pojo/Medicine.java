package com.pojo;


public class Medicine {
	
	private int id;
	
	private String name;
	private int quantityAvaialable;
	private double rate; // cost of the medicine
	
	public Medicine(String name, int quantityAvaialable, double rate) {
		super();
		this.name = name;
		this.quantityAvaialable = quantityAvaialable;
		this.rate = rate;
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

	public int getQuantityAvaialable() {
		return quantityAvaialable;
	}

	public void setQuantityAvaialable(int quantityAvaialable) {
		this.quantityAvaialable = quantityAvaialable;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
	
}
