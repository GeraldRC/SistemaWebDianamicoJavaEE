package com.model;

public class RegistroCheklist {

	private int idChek;
	private int valorChek;
	
	
	public RegistroCheklist() {
		super();
	}


	public RegistroCheklist(int idChek, int valorChek) {
		super();
		this.idChek = idChek;
		this.valorChek = valorChek;
	}


	public int getIdChek() {
		return idChek;
	}


	public void setIdChek(int idChek) {
		this.idChek = idChek;
	}


	public int getValorChek() {
		return valorChek;
	}


	public void setValorChek(int valorChek) {
		this.valorChek = valorChek;
	}


	@Override
	public String toString() {
		return "RegistroCheklist [idChek=" + idChek + ", valorChek=" + valorChek + "]";
	}
	
	
	
	
}
