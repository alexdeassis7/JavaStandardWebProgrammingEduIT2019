package com.edu.clse9;

import java.util.PriorityQueue;

//
//Las operaciones básicas que se realizan sobre una cola suelen ser las siguientes:
//
//constructor: Crea la pila con cero elementos.
//encola: Añade el parámetro elElemento al extremo de inserción de la cola. Si elElemento es incompatible con los elementos que se almacenan en esta colección lanza una excepción.
//desencola: Elimina de la cola el elemento que está en el extremo de extracción y lo retorna. Si no hay ningún elemento, lanza una excepción.
//hazNula: Elimina todos los elementos de la cola, dejándola vacía.
//estaVacia: Si la cola está vacía retorna true. En otro caso, retorna false.
//tamaño: Retorna un entero que dice cuántos elementos hay en la cola.
//Posibles implementaciones
//
//La interfaz Queue, junto a la operación add() heredada de la colección, dispone de operaciones para encolar, desencolar, o consultar el primer elemento de la cola (el próximo que se va a desencolar). De cada una de ellas dispone de dos versiones, una que lanza una excepción si hay un fallo, y otra que retorna un valor especial si la acción solicitada no puede realizarse.
//
//offer(): retorna true si ha conseguido encolar el elemento y false si no (por ejemplo, si la cola es limitada, y el elemento no cabe).
//poll(): desencola y retorna un elemento si existe; si no existe, retorna null.
//peek(): retorna sin desencolarlo el primer elemento si existe (el que se desencolaría con peek); si no existe, retorna null.
//add(): intenta encolar el elemento e, y en caso de que no pueda (por ejemplo, si la cola es limitada, y el elemento no cabe) lanza IllegalStateException.
//remove(): desencola y retorna un elemento si existe; si no existe, lanza NoSuchElementException.
//element(): retorna sin desencolarlo el primer elemento si existe (el que se desencolaría con peek); si no existe, lanza NoSuchElementException.
//Las colas Java no deben usarse para almacenar elementos que sean null, ya que entonces los métodos poll() y peek() no funcionarían bien.

public class Main {
//	PriorityQueue
//	Una variante de una cola clásica la implementa la clase PriorityQueue.
//	Cuando se agregan elementos a la cola se organiza según su valor, por ejemplo
//	si es un número se ingresan de menor a mayor.
//
//	Veamos un ejemplo como se organizan los valores en la cola con prioridad:
	public static void main(String[] args) {
//		Creamos un objeto de la clase PriorityQueue que almacene objetos de la clase Integer:
		PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
//		Cargamos tres objetos en la cola de prioridad:
		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		System.out.println("Imprimimos la cola con prioridades de enteros");
		
//		Mediante un while comenzamos a recuperar los elementos de la cola con prioridad
//		y podemos comprobar que el primero de la cola es el que tiene el valor 6, luego el 70 
//		y finalmente el 120:
		while (!cola1.isEmpty())
			System.out.print(cola1.poll() + "-");
	}

}
