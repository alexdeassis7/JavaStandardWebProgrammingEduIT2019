package com.EducacionIt.JSEweb.Clase2;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		 int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		 int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		 
		           int resultado = n1 / n2;
		           JOptionPane.showMessageDialog(null, "resultado de dividir " +n1 + "/ "+ n2 +"    ="+ resultado);
		            
		      

		           
		           
		           
		           
		 //solicitamos datos al usuario para dimensionar la matriz 
		int CantidadDeElementos = Integer
				.parseInt(JOptionPane.showInputDialog("cuantos numeros aleatorios deseas generar"));
		
		//creamos la matriz dinamicamente 
		int num_aleatorios[] = new int[CantidadDeElementos];

	
			//cargamos la matriz de numeros aleatorios 
		for (int i = 0; i < num_aleatorios.length; i++) {
			//ESTE ES EL ERROR A DEBUGEAR 
			//num_aleatorios[i] = (int) Math.random() * 100;
			//Solución
			//num_aleatorios[i] = (int) (Math.random() * 100);

			num_aleatorios[i] = (int) Math.random() * 100;//en esta linea agregar un break point 

		}

		System.out.println("mostramos el array ");
		for (int i = 0; i < num_aleatorios.length; i++) {
			System.out.println(num_aleatorios[i]); 
			 
		}	
		System.out.println("Fin del array ");
		
		
		
		
		
		
		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		array[1][1] = 0;

		
		for (int x=0; x < array.length; x++) {
		  for (int y=0; y < array[x].length; y++) {
		      System.out.println (array[x][y]);
		  }
		
		}
				
	}

}
