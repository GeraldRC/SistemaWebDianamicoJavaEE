package com.model;

public class ReporteAccidente {
	
	private int Id;
	private String Fecha;
	private String ClienteRut;
	private String RutTrabajador;
	private String NombreTrabajador;
	private String Direccion;
	private String Comuna;
	private int Telefono;
	private String Sexo;
	
	
	
	public ReporteAccidente() {
		super();
	}


	public ReporteAccidente(int id, String fecha, String clienteRut, String rutTrabajador, String nombreTrabajador,
			String direccion, String comuna, int telefono, String sexo) {
		super();
		Id = id;
		Fecha = fecha;
		ClienteRut = clienteRut;
		RutTrabajador = rutTrabajador;
		NombreTrabajador = nombreTrabajador;
		Direccion = direccion;
		Comuna = comuna;
		Telefono = telefono;
		Sexo = sexo;
	}
	
	


	public ReporteAccidente(int id, String clienteRut, String rutTrabajador, String nombreTrabajador, String direccion,
			String comuna, int telefono, String sexo) {
		super();
		Id = id;
		ClienteRut = clienteRut;
		RutTrabajador = rutTrabajador;
		NombreTrabajador = nombreTrabajador;
		Direccion = direccion;
		Comuna = comuna;
		Telefono = telefono;
		Sexo = sexo;
	}


	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getFecha() {
		return Fecha;
	}



	public void setFecha(String fecha) {
		Fecha = fecha;
	}



	public String getClienteRut() {
		return ClienteRut;
	}



	public void setClienteRut(String clienteRut) {
		ClienteRut = clienteRut;
	}



	public String getRutTrabajador() {
		return RutTrabajador;
	}



	public void setRutTrabajador(String rutTrabajador) {
		RutTrabajador = rutTrabajador;
	}



	public String getNombreTrabajador() {
		return NombreTrabajador;
	}



	public void setNombreTrabajador(String nombreTrabajador) {
		NombreTrabajador = nombreTrabajador;
	}



	public String getDireccion() {
		return Direccion;
	}



	public void setDireccion(String direccion) {
		Direccion = direccion;
	}



	public String getComuna() {
		return Comuna;
	}



	public void setComuna(String comuna) {
		Comuna = comuna;
	}



	public int getTelefono() {
		return Telefono;
	}



	public void setTelefono(int telefono) {
		Telefono = telefono;
	}



	public String getSexo() {
		return Sexo;
	}



	public void setSexo(String sexo) {
		Sexo = sexo;
	}



	@Override
	public String toString() {
		return "ReporteAccidente [Id=" + Id + ", Fecha=" + Fecha + ", ClienteRut=" + ClienteRut + ", RutTrabajador="
				+ RutTrabajador + ", NombreTrabajador=" + NombreTrabajador + ", Direccion=" + Direccion + ", Comuna="
				+ Comuna + ", Telefono=" + Telefono + ", Sexo=" + Sexo + "]";
	}

	
	
	
}
