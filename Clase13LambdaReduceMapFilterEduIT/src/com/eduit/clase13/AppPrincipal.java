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
//		Para comprender mejor, Map toma como par�metros una funci�n unaria, es decir que recibe un solo par�metro, y como segundo argumento recibe una colecci�n de datos (una lista, un set),
//		en Java la condici�n es que dicha colecci�n proveea un Iterator. Ejemplo en pseudoc�digo:
//
//		map(sqrt, [1, 4, 9, 16])        # ==> [1.0, 2.0, 3.0, 4.0]
		
		String[] myVector = new String[]{"bob", "alice", "paul", "ellie"};
		
		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}
		
		
//		Comienza convirtiendo la matriz en un Stream:
		Stream<String> myStream = Arrays.stream(myVector);
		
//		Luego llama al mapm�todo, pasando una expresi�n lambda, una que puede convertir una cadena a may�sculas, como �nico argumento:
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());
		
//		El Streamobjeto devuelto contiene las cadenas modificadas. Para convertirlo en una matriz, usa su toArraym�todo:		
		String[] myNewArray =   myNewStream.toArray(String[]::new);
		
//		String[]::new
//		Esta es lambda para el siguiente m�todo:
//
//		public String[] create(int size) {
//		    return new String[size];
//		}
		
		for (int i = 0; i < myNewArray.length; i++) {
			
			System.out.println(myNewArray[i]);
			
		}
	
		
		/**##############################################################################      FILTER     ############################################################################ */
		
		
//		Filter nos permite obtener de una lista los datos que cumplan con cierto criterio, dicho criterio es una funci�n que devuelve un booleano. Ejemplo:
//
//		Biblioteca de clases que nos permitir� realizar distintas operaciones funcionales sobre streams . �Cu�ndo va a ser �til utilizar un objeto de este tipo? 
//				Lo vemos con un ejemplo: Obtener cu�ntas veces aparece el n�mero 5 en una lista de n�meros:
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
		
		
		
//		En este caso estamos aplicando una funci�n lambda como criterio, un lambda es una funci�n an�nima que solo la usaremos como par�metro de entrada a la funci�n filter, s -> s.length() > 4 queremos solo las cadenas que tienen 4 o mas letras.

		/**##############################################################################      REDUCE     ############################################################################*/
//		Reduce consiste en reducir una colecci�n de datos a un solo valor, por ejemplo, si queremos tomar una lista de n�meros y calcularles la suma, el promedio o funciones m�s complejas:
//
		int myArray[] = { 1, 5, 8 };
		
		int sum = Arrays.stream(myArray).sum();
		
		System.out.println("LA SUMA ES : " + sum );
		
//		Los par�metros que toma reduce difieren de los de map y filter, un identificador y una funci�n lambda.
//		El identificador se puede pensar como un elemento que pertenece al conjunto de datos pero que no altera el resultado final de la operaci�n, por ejemplo, si estamos calculando una productoria el identificador ser� 1,
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
		
//		En este caso la funci�n lambda (a,b) -> a + b recibe el identificador "" y lo concatena con el primer elemento de la lista "this", luego toma el resultado y lo concatena con el siguiente elemento hasta que no hayan m�s elementos por evaluar.
//
//		Hemos visto como reducir y mejorar la calidad de nuestro c�digo con estas 3 nuevas funciones, es posible hacer composiciones de estas 3 funciones para crear criterios mas complejos.
	}

}
