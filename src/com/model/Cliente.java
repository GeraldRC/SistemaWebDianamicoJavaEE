package com.model;

public class Cliente extends Usuario{
	
	private String rut; 
	private String razonsocial;
	private String direccion;
	private String comuna;
	private int telefono;
	private String acteconomica;
	private String tipoEmpresa;
	private int id_usu;
	
	public Cliente() {
		super();
	}

	public Cliente(int id, int id_rol, String nombre, String apellido, String contrasena, String login, String rut,
			String razonsocial, String direccion, String comuna, int telefono, String acteconomica, String tipoEmpresa,
			int id_usu) {
		super(id, id_rol, nombre, apellido, contrasena, login);
		this.rut = rut;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.acteconomica = acteconomica;
		this.tipoEmpresa = tipoEmpresa;
		this.id_usu = id_usu;
	}
	
	

	public Cliente(String rut, String razonsocial, String direccion, String comuna, int telefono, String acteconomica,
			String tipoEmpresa) {
		super();
		this.rut = rut;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.acteconomica = acteconomica;
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getActeconomica() {
		return acteconomica;
	}

	public void setActeconomica(String acteconomica) {
		this.acteconomica = acteconomica;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public int getId_usu() {
		return id_usu;
	}

	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}


}
