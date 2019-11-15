package com.educacionit.map;

import java.util.*;

public class Main {
//	// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
//	Map<Integer, String> nombreMap = new HashMap<Integer, String>();
//	nombreMap.size(); // Devuelve el numero de elementos del Map
//	nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
//	nombreMap.put(K clave, V valor); // Añade un elemento al Map
//	nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
//	nombreMap.clear(); // Borra todos los componentes del Map
//	nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
//	nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
//	nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
//	nombreMap.values(); // Devuelve una "Collection" con los valores del Map

	public static void main(String[] args) {
//		HashMap: Los elementos que inserta en el map no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos.
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");
		map.put(15, "Ramos");
		map.put(3, "Pique");
		map.put(5, "Puyol");
		map.put(11, "Capdevila");
		map.put(14, "Xabi Alonso");
		map.put(16, "Busquets");
		map.put(8, "Xavi Hernandez");
		map.put(18, "Pedrito");
		map.put(6, "Iniesta");
		map.put(7, "Villa");

		// Imprimimos el Map con un Iterador
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}

		////////// TREE MAP****************************************************
		// El Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores
		////////// enteros (como luego veremos), los ordena de menos a mayor.
		System.out.println("////////// TREE MAP****************************************************");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Casillas");
		treeMap.put(15, "Ramos");
		treeMap.put(3, "Pique");
		treeMap.put(5, "Puyol");
		treeMap.put(11, "Capdevila");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(16, "Busquets");
		treeMap.put(8, "Xavi Hernandez");
		treeMap.put(18, "Pedrito");
		treeMap.put(6, "Iniesta");
		treeMap.put(7, "Villa");

		// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
		it = treeMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
		}

//		LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando; es decir, que no tiene una ordenación de los elementos como tal,
//		por lo que esta clase realiza las búsquedas de los elementos de forma más lenta que las demás clases.
		System.out.println("******************LinkedHashMap"
				+ "******************************");

		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(16, "Busquets");
		linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(6, "Iniesta");
		linkedHashMap.put(7, "Villa");

		// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
		it = linkedHashMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
		}

	}

}
