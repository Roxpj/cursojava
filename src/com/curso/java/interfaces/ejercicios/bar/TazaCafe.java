package com.curso.java.interfaces.ejercicios.bar;

public class TazaCafe {

	private String tipoCafe;
	private int temperatura;
	
	public TazaCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
		this.temperatura = (int)(Math.random()*100);
	}
	
	public String getTipoCafe() {
		return tipoCafe;
	}
	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
