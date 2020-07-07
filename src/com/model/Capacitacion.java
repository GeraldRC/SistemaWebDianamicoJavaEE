package com.model;

public class Capacitacion {
	
	private int id;
	
	private String Capacitacion;
	

	public Capacitacion() {
		super();
	}


	public Capacitacion(int id) {
		super();
		this.id = id;
	}


	public Capacitacion(String capacitacion) {
		super();
		Capacitacion = capacitacion;
	}


	public Capacitacion(int id, String capacitacion) {
		super();
		this.id = id;
		Capacitacion = capacitacion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCapacitacion() {
		return Capacitacion;
	}


	public void setCapacitacion(String capacitacion) {
		Capacitacion = capacitacion;
	}


	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", Capacitacion=" + Capacitacion + "]";
	}
	
	
	
	
	
	
	

}
