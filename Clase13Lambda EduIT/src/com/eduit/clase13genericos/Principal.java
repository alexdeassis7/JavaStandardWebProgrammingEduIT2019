package com.eduit.clase13genericos;

//Creaamos un programa que llene la Bolsa de Chocolatinas y Golosinas para luego recorrer los elementos que están en la bolsa y sacarlos por pantalla.
public class Principal {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(5);

		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		Golosina g1 = new Golosina("gominola");
		Golosina g2 = new Golosina("chicle");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g1);
		bolsa.add(g2);

//		El programa funcionará correctamente, pero nos podremos dar cuenta que resulta bastante poco amigable la estructura 
//		if /else en la cual se chequean cada uno de los tipos a la hora de presentarlo por pantalla.
//		
		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {

				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());

			} else {

				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());

			}
		}

	}

}
