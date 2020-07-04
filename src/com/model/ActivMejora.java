package com.model;

public class ActivMejora {
	
	private int id;
	private String acme;

	public ActivMejora() {
		
	}

	public ActivMejora(String acme) {
		this.acme = acme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcme() {
		return acme;
	}

	public void setAcme(String acme) {
		this.acme = acme;
	}

	@Override
	public String toString() {
		return "ActivMejora [id=" + id + ", acme=" + acme + "]";
	}
		
}
