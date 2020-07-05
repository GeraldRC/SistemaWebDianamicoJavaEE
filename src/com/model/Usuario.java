
package com.model;

public class Usuario{
	
	private int id;
	private int id_rol;
	private String nombre;
	private String apellido;
	private String contrasena;
	private String login;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, int id_rol, String nombre, String apellido, String contrasena, String login) {
		super();
		this.id = id;
		this.id_rol = id_rol;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasena = contrasena;
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_rol=" + id_rol + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", contrasena=" + contrasena + ", login=" + login + "]";
	}

	
	

}
