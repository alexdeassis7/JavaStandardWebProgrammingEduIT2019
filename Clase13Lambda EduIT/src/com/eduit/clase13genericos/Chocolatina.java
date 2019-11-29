package com.eduit.clase13genericos;

//vamos a disponer de dos clases con las cuales rellenar la bolsa . La clase Golosina y la clase Chocolatina.
public class Chocolatina {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Chocolatina(String marca) {
		super();
		this.marca = marca;

	}
}
