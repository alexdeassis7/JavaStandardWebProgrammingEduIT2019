package com.eduit.leerfichero;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class EscribeFichero {

	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
//			Si queremos añadir al final de un fichero ya existente, simplemente debemos poner un flag a true como segundo parámetro del constructor de FileWriter.

//			fichero = new FileWriter("C:\\Users\\Alex\\Documents\\archivo.txt");

			fichero = new FileWriter("C:\\Users\\Alex\\Documents\\archivo.txt", true);

			pw = new PrintWriter(fichero);

			String textoIngresado = null;

			textoIngresado = JOptionPane.showInputDialog("ingrese el mensaje a guardar en el archivo ");
			for (int i = 0; i < 10; i++)
				pw.println(textoIngresado);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
