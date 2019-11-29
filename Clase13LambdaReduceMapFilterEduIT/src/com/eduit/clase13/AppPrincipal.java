package com.eduit.clase13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
//NOVEDADES JAVA 8
//https://openwebinars.net/blog/7-novedades-de-java-8-debes-saber-para-estar-al-dia/

public class AppPrincipal {
	
	
	public static void main(String[] args) {
		/**##############################################################################     MAP   ############################################################################ */
		//ejemplo de https://www.sitepoint.com/java-8-streams-filter-map-reduce/
		
//		Aunque parezca marciano es algo a lo que nos enfrentamos comunmente cuando trabajamos con una secuencia de datos ya sea de un archivo en disco, una base de datos o desde un servicio web.
//
//		Para comprender mejor, Map toma como parámetros una función unaria, es decir que recibe un solo parámetro, y como segundo argumento recibe una colección de datos (una lista, un set),
//		en Java la condición es que dicha colección proveea un Iterator. Ejemplo en pseudocódigo:
//
//		map(sqrt, [1, 4, 9, 16])        # ==> [1.0, 2.0, 3.0, 4.0]
		
		String[] myVector = new String[]{"bob", "alice", "paul", "ellie"};
		
		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}
		
		
//		Comienza convirtiendo la matriz en un Stream:
		Stream<String> myStream = Arrays.stream(myVector);
		
//		Luego llama al mapmétodo, pasando una expresión lambda, una que puede convertir una cadena a mayúsculas, como único argumento:
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());
		
//		El Streamobjeto devuelto contiene las cadenas modificadas. Para convertirlo en una matriz, usa su toArraymétodo:		
		String[] myNewArray =   myNewStream.toArray(String[]::new);
		
//		String[]::new
//		Esta es lambda para el siguiente método:
//
//		public String[] create(int size) {
//		    return new String[size];
//		}
		
		for (int i = 0; i < myNewArray.length; i++) {
			
			System.out.println(myNewArray[i]);
			
		}
	
		
		/**##############################################################################      FILTER     ############################################################################ */
		
		
//		Filter nos permite obtener de una lista los datos que cumplan con cierto criterio, dicho criterio es una función que devuelve un booleano. Ejemplo:
//
//		Biblioteca de clases que nos permitirá realizar distintas operaciones funcionales sobre streams . ¿Cuándo va a ser útil utilizar un objeto de este tipo? 
//				Lo vemos con un ejemplo: Obtener cuántas veces aparece el número 5 en una lista de números:
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(44);
		listaNumeros.add(66);
		listaNumeros.add(55);
		listaNumeros.add(5);
		listaNumeros.add(55);
		listaNumeros.add(67);
		listaNumeros.add(89);
		listaNumeros.add(5);
		listaNumeros.add(5);
		
		Stream st  = listaNumeros.stream();
		
		//CONTAMOS CUANTAS VECES APARECE EL NUMERO 5 en la lista de numeros
		System.out.println("hallazgoz del numero buscado :");
		System.out.println(st.filter(Predicate.isEqual(5)).count());
		
		
		
//		En este caso estamos aplicando una función lambda como criterio, un lambda es una función anónima que solo la usaremos como parámetro de entrada a la función filter, s -> s.length() > 4 queremos solo las cadenas que tienen 4 o mas letras.

		/**##############################################################################      REDUCE     ############################################################################*/
//		Reduce consiste en reducir una colección de datos a un solo valor, por ejemplo, si queremos tomar una lista de números y calcularles la suma, el promedio o funciones más complejas:
//
		int myArray[] = { 1, 5, 8 };
		
		int sum = Arrays.stream(myArray).sum();
		
		System.out.println("LA SUMA ES : " + sum );
		
//		Los parámetros que toma reduce difieren de los de map y filter, un identificador y una función lambda.
//		El identificador se puede pensar como un elemento que pertenece al conjunto de datos pero que no altera el resultado final de la operación, por ejemplo, si estamos calculando una productoria el identificador será 1,
//		si estamos concatenando caracteres '', etc.
//
		String[] myArray2 = { "Soy", "Una", "Sentencia", "De", "Codigo", "Uso" , "Stream", "Reduce" };
		for (String aux : myArray2) {
			System.out.println(aux );
		}
		
		String result = Arrays.stream(myArray2)
		                .reduce("", (a,b) -> a + b);
		
		System.out.println("RESULTADO DE REDUCE :" + result);
		
		for (String aux : myArray2) {
			System.out.println(aux );
		}
		
//		En este caso la función lambda (a,b) -> a + b recibe el identificador "" y lo concatena con el primer elemento de la lista "this", luego toma el resultado y lo concatena con el siguiente elemento hasta que no hayan más elementos por evaluar.
//
//		Hemos visto como reducir y mejorar la calidad de nuestro código con estas 3 nuevas funciones, es posible hacer composiciones de estas 3 funciones para crear criterios mas complejos.
	}

}
