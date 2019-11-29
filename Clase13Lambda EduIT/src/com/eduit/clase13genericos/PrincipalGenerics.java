package com.eduit.clase13genericos;

public class PrincipalGenerics {

//	De esta manera cuando construyamos un objeto de esta clase será el momento de especificar el tipo de Bolsa que deseamos .
//	En el siguiente ejemplo hemos elegido “Chocolatina” como tipo para la Bolsa .
//	De esta manera la bolsa solo admitirá este tipo de objetos

	public static void main(String[] args) {

		Bolsa2Generica<Chocolatina> bolsa = new Bolsa2Generica<Chocolatina>(5);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka2");
		Chocolatina c2 = new Chocolatina("ferrero");
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);

		for (Chocolatina chocolatina : bolsa) {
			System.out.println(chocolatina.getMarca());
		}

//		Acabamos de construir nuestra primera clase Generica y hemos usado un bucle forEach para recorrerla de una forma sencilla.
	}

}
