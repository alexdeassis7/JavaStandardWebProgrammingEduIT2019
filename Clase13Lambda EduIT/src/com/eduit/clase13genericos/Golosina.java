package com.eduit.clase13genericos;

//vamos a disponer de dos clases con las cuales rellenar la bolsa . La clase Golosina y la clase Chocolatina.
public class Golosina {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Golosina(String nombre) {
		super();
		this.nombre = nombre;
	}

}
