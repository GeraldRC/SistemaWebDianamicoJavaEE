
package com.model;

public class Usuario{
	
	private int id;
	private String nombre;
	private String apellido;
	private String password;
	private int rol;
	
	public Usuario() {
	}
	
	public Usuario(int id) {
		this.id = id;
	}

	public Usuario(String nombre, String apellido, String password, int rol) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.rol = rol;
	}

	public Usuario(int id, String nombre, String apellido, String password, int rol) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.rol = rol;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password
				+ ", rol=" + rol + "]";
	}

	
	

}
