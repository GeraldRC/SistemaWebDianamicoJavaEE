package com.model;

public class Cheklist {

	
	private int id;
	private String chek;
	
	
	public Cheklist() {
	}


	public Cheklist(String chek) {
		this.chek = chek;
	}


	public Cheklist(int id) {
		this.id = id;
	}


	public Cheklist(int id, String chek) {
		this.id = id;
		this.chek = chek;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getChek() {
		return chek;
	}


	public void setChek(String chek) {
		this.chek = chek;
	}


	@Override
	public String toString() {
		return "Cheklist [id=" + id + ", chek=" + chek + "]";
	}
	
	
	
}
