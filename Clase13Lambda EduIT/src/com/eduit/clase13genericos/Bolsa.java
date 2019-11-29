package com.eduit.clase13genericos;

import java.util.ArrayList;
import java.util.Iterator;
//https://www.arquitecturajava.com/uso-de-java-generics/
public class Bolsa implements Iterable {
//	 Implementar Iterable tan s�lo obliga a sobreescribir un m�todo que es iterator(). Este m�todo debe devolver un objeto de tipo Iterator
	public Iterator iterator() {
		return lista.iterator();
	}

	private ArrayList lista = new ArrayList();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() <= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

}
