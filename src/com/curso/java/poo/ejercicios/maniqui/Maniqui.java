package com.curso.java.poo.ejercicios.maniqui;

public class Maniqui {

	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	
	public Maniqui(Vestido vestido) {
		this.vestido = vestido;
	}
	
	public Maniqui(Camisa camisa, Pantalon pantalon) {
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}
	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	public Pantalon getPantalon() {
		return pantalon;
	}
	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	
	public void desvestir() {
		this.setCamisa(null);
		this.setPantalon(null);
		this.setVestido(null);
	}
	
	public void vestir(Vestido vestido) {
		this.setVestido(vestido);
	}
	public void vestir(Camisa camisa, Pantalon pantalon) {
		this.setCamisa(camisa);
		this.setPantalon(pantalon);
	}
}
