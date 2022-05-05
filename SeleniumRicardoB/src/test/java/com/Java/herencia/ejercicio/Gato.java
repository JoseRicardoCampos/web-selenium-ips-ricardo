package com.Java.herencia.ejercicio;

public class Gato {

	private String color;
	private String tipoCola;
	private int patas;

	public Gato(String color, String tipoCola, int patas) {
		this.color = color;
		this.tipoCola = tipoCola;
		this.patas = patas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoCola() {
		return tipoCola;
	}

	public void setTipoCola(String tipoCola) {
		this.tipoCola = tipoCola;
	}

	public void temperamento() {
		System.out.println("Jugueton");
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		if (patas > 10) {
			patas = -1;
		} else {
			this.patas = patas;
		}

	}

}
