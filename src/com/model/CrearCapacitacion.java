package com.model;

public class CrearCapacitacion {
	
	private int id;
	private String cap;
	
	
	
	public CrearCapacitacion(String cap) {
		super();
		this.cap = cap;
	}



	public CrearCapacitacion() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCap() {
		return cap;
	}



	public void setCap(String cap) {
		this.cap = cap;
	}



	@Override
	public String toString() {
		return "CrearCapacitacion [id=" + id + ", cap=" + cap + "]";
	}
	
}
	
	
	