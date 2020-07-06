package com.model;

public class Solicitudes {
	
	private int ID;
	
	private String rutCliente;
	
	private String nombreCliente;
	
	private int estado;
	
	private String estadoString;
	
	





	private int tipoSolicitud;
	
	private String tipoSolicitudString;

	public Solicitudes() {
		super();
	}

	

	

	public Solicitudes(String rutCliente, int estado, int tipoSolicitud) {
		super();
		this.rutCliente = rutCliente;
		this.estado = estado;
		this.tipoSolicitud = tipoSolicitud;		
	}


	


	public Solicitudes(int iD, String rutCliente, int estado, int tipoSolicitud) {
		super();
		ID = iD;
		this.rutCliente = rutCliente;
		this.estado = estado;
		this.tipoSolicitud = tipoSolicitud;
	}





	public Solicitudes(int iD) {
		super();
		ID = iD;
	}





	public int getID() {
		return ID;
	}





	public void setID(int iD) {
		ID = iD;
	}





	public String getRutCliente() {
		return rutCliente;
	}





	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}





	public int getEstado() {
		return estado;
	}





	public String getNombreCliente() {
		return nombreCliente;
	}





	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}





	public void setEstado(int estado) {
		this.estado = estado;
		setEstadoString(estado);
	}
	
	public String getEstadoString() {
		return estadoString;
	}


	private void setEstadoString(int estado) {
		
		if (estado == 1 ) estadoString = "PENDIENTE";
		if (estado == 2 ) estadoString = "AGENDADO";
		if (estado == 3 ) estadoString = "REALIZADO";
		
	}





	public int getTipoSolicitud() {
		return tipoSolicitud;
	}





	public void setTipoSolicitud(int tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
		setTipoSolicitudString( tipoSolicitud);
	}



	

	public String getTipoSolicitudString() {
		return tipoSolicitudString;
	}





	private void setTipoSolicitudString(int tipoSolicitud) {
		
		if(tipoSolicitud == 1) tipoSolicitudString = "CAPACITACION";
		if(tipoSolicitud == 2) tipoSolicitudString = "ASESORIA";
		if(tipoSolicitud == 3) tipoSolicitudString = "ASESORIA ESPECIAL";
		
	}





	@Override
	public String toString() {
		return "Solicitudes [ID=" + ID + ", rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", estado="
				+ estado + ", estadoString=" + estadoString + ", tipoSolicitud=" + tipoSolicitud
				+ ", tipoSolicitudString=" + tipoSolicitudString + "]";
	}





	




	





	
	
	
	
	
	
	
	
	
	

}
