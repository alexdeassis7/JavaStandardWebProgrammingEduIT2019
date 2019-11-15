package com.eduit.clase9;

import java.util.Comparator;
//https://www.apuntesdejava.com/2009/04/comparable-y-comparator.html
//
//Para ello debemos utilizar un comparador de elementos. Un comparador es una clase de apoyo que será
//utilizada para los métodos de ordenamiento. Esto se logra implementando la interfaz java.util.Comparator
//
//Para continuar con nuestro ejemplo, creemos la siguiente clase que implemente la interfaz mencionada
class OrdenarPersonaPorId implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getIdPersona() - o2.getIdPersona();
	}
}
