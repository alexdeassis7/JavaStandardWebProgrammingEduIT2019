package com.eduit.clase13genericos;

import java.util.ArrayList;
import java.util.Iterator;

////https://www.arquitecturajava.com/uso-de-java-generics/

//Java Generics
//Para solventar este problema podemos construir una clase Genérica .Este tipo de clase nos permitirá definir una Bolsa de un tipo concreto .
//Puede ser una bolsa de Golosinas o una bolsa de Chocolatinas pero NO de las dos cosas  a la vez .Esto en un principio puede parecer poco 
//flexible pero si nos ponemos a pensar cuando programamos solemos imprimir una lista de Facturas o una lista de Compras no una lista mixta.
//Así  el enfoque parece razonable. Vamos a ver el código fuente y comentarlo:

public class Bolsa2Generica<T> implements Iterable<T> {

//	La clase es un poco peculiar ya que al no saber de entrada de que tipo va a ser la bolsa debemos declarar un tipo Genérico 
//	T a nivel de clase y que será repetido en cada uno de los métodos que lo usen.

	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa2Generica(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T objeto) {

		if (lista.size() <= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	public Iterator<T> iterator() {
		return lista.iterator();
	}

}
