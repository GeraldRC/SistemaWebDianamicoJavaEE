package com.model;

public class Visita {
	
	
	private int rutProfesional;
	
	private int ID;
	
	private int IDSolicitud;
	
	private String fecha;

	
	
	public Visita() {
		super();
	}



	public Visita(int iD) {
		super();
		ID = iD;
	}

	
	

	public Visita(int rutProfesional, int iDSolicitud) {
		super();
		this.rutProfesional = rutProfesional;
		IDSolicitud = iDSolicitud;
	}



	public Visita(int rutProfesional, int iDSolicitud, String fecha) {
		super();
		this.rutProfesional = rutProfesional;
		IDSolicitud = iDSolicitud;
		this.fecha= fecha;
	}



	public Visita(int rutProfesional, int iD, int iDSolicitud) {
		super();
		this.rutProfesional = rutProfesional;
		ID = iD;
		IDSolicitud = iDSolicitud;
	}



	public int getRutProfesional() {
		return rutProfesional;
	}



	public void setRutProfesional(int rutProfesional) {
		this.rutProfesional = rutProfesional;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public int getIDSolicitud() {
		return IDSolicitud;
	}



	public void setIDSolicitud(int iDSolicitud) {
		IDSolicitud = iDSolicitud;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Visita [rutProfesional=" + rutProfesional + ", ID=" + ID + ", IDSolicitud=" + IDSolicitud + ", fecha="
				+ fecha + "]";
	}



	


	
	
	
		
	

}
