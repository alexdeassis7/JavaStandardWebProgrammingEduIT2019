package com.eduit.clase9;

import java.util.Arrays;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// https://www.apuntesdejava.com/2009/04/comparable-y-comparator.html
//		Una colección en Java puede tener sus elementos ordenados.
//		Consideremos el siguiente código:
		List<String> nombres = Arrays.asList("Carlos", "Ana", "Dionisio", "Bernardo");
		System.out.println("lista original:" + nombres);

		Collections.sort(nombres);// La función Collections.sort() nos ordena una lista cualquiera.
		System.out.println("lista ordenada:" + nombres);

		Set<String> otrosNombres = new TreeSet<>();
		otrosNombres.add("Mario");
		otrosNombres.add("Fernando");
		otrosNombres.add("Omar");
		otrosNombres.add("Juana");

		System.out.println("conjunto ordenado:" + otrosNombres);

		Set<Persona> personas = new TreeSet<>();
		personas.add(new Persona(1, "Mario"));
		personas.add(new Persona(2, "Fernando"));
		personas.add(new Persona(3, "Omar"));
		personas.add(new Persona(4, "Juana"));

		System.out.println("conjunto ordenado de personas: " + personas);

		List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "Juana"), new Persona(2, "Fernando"),
				new Persona(1, "Mario"), new Persona(3, "Omar"));
		Collections.sort(otrasPersonas, new OrdenarPersonaPorId());
		System.out.println("lista de personas ordenadas por ID:" + otrasPersonas);

		Set<Persona> conjuntoPersonas = new TreeSet<>(new OrdenarPersonaPorId());
		conjuntoPersonas.add(new Persona(3, "Omar"));
		conjuntoPersonas.add(new Persona(4, "Juana"));
		conjuntoPersonas.add(new Persona(2, "Fernando"));
		conjuntoPersonas.add(new Persona(1, "Mario"));

		System.out.println("conjunto de personas ordenadas por ID:" + conjuntoPersonas);
	}

}