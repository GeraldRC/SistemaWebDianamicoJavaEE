package com.model;

public class Cliente extends Usuario{
	
	private String rut;
	private String razonsocial;
	private String direccion;
	private String comuna;
	private int telefono;
	private String acteconomica;
	private String usuario_id;
	
	public Cliente() {
		super();
	}

	public Cliente(String rut, String razonsocial, String direccion, String comuna, int telefono, String acteconomica,
			String usuario_id) {
		super();
		this.rut = rut;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.acteconomica = acteconomica;
		this.usuario_id = usuario_id;
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

	public String getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", razonsocial=" + razonsocial + ", direccion=" + direccion + ", comuna="
				+ comuna + ", telefono=" + telefono + ", acteconomica=" + acteconomica + ", usuario_id=" + usuario_id
				+ "]";
	}
	
	

}
