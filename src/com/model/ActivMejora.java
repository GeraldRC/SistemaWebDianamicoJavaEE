/**
 * @author Edgardo
 *  REVISADO 05-07-2020
 */
package com.model;

public class ActivMejora {
	
	private int asesoria_id;
	private int id_1;
	private int estado_mejora_id;
	private String descripcion;
	
  
	public ActivMejora() {
		
	}
	
	//constructor a utilizar por el formulario
	public ActivMejora(int asesoria_id, int estado_mejora_id, String descripcion) {
		this.asesoria_id = asesoria_id;
		this.estado_mejora_id = estado_mejora_id;
		this.descripcion = descripcion;
	}

	public ActivMejora(int asesoria_id, int id_1, int estado_mejora_id, String descripcion) {
		this.asesoria_id = asesoria_id;
		this.id_1 = id_1;
		this.estado_mejora_id = estado_mejora_id;
		this.descripcion = descripcion;
	}


	public int getAsesoria_id() {
		return asesoria_id;
	}


	public void setAsesoria_id(int asesoria_id) {
		this.asesoria_id = asesoria_id;
	}


	public int getId_1() {
		return id_1;
	}


	public void setId_1(int id_1) {
		this.id_1 = id_1;
	}


	public int getEstado_mejora_id() {
		return estado_mejora_id;
	}


	public void setEstado_mejora_id(int estado_mejora_id) {
		this.estado_mejora_id = estado_mejora_id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "ActivMejora [asesoria_id=" + asesoria_id + ", id_1=" + id_1 + ", estado_mejora_id=" + estado_mejora_id
				+ ", descripcion=" + descripcion + "]";
	}
	
}
