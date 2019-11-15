package com.edu.it.clases9;

import java.util.LinkedList;
import java.util.Queue;

public class AppPrincipal {

	public static void main(String[] args) {
		Queue queue = new LinkedList();

		// Eliminar el primer elemento de la cola.
		// Si la cola esta vacia una excepcion java.util.NoSuchElementException sera
		// botada.
		//System.out.println("remove: " + queue.remove());
		
		
		// Usando el metodo ADD para anadir.
		// Si algo sale mal se botara existira una excepcion.
		queue.add("item1");
		queue.add("item2");

		// Usando el metodo OFFER para anadir.
		// Si algo sale mal se retornara un nulo.
		queue.offer("Item3");
		queue.offer("Item4");

		// Eliminar el primer elemento de la cola.
		// Si la cola esta vacia una excepcion java.util.NoSuchElementException sera
		// botada.
		System.out.println("remove: " + queue.remove());

		// Observar que elemento esta en el primer puesto de la fila sin eliminarlo.
		// Si la cola esta vacia una excepcion java.util.NoSuchElementException sera
		// botada.
		System.out.println("element: " + queue.element());

		// Eliminar el primer elemento de la cola.
		// Si la cola esta vacia, solo se retorna un falso.
		System.out.println("poll: " + queue.poll());

		// Observar que elemento esta en el primer puesto de la fila sin eliminarlo.
		// Si la cola esta vacia, solo se retorna un nulo.
		System.out.println("peek: " + queue.peek());
		
		System.out.println("element: " + queue.element());

	}

}
