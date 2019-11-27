package com.eduit.files;

import java.io.File;//importar java io
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

public class ManejodeArchivos {

	public static void main(String[] args) {

		String nombreArchivo = JOptionPane.showInputDialog("ingrese el nombre del archivo que desea crear ");

		nombreArchivo += ".txt";
//		FIle nos sirve para leer u obtener un archivo especifico

		// File tiene 4 constructores para acceder a un archivo

		// constructor 1 :
//		forma de ruta relativa o nombre corto para acceder al archivo , esto 
//		busca el archivo dentro del direcctorio donde se esta ejecutando el proyecto 

		File file = new File(nombreArchivo);// si no existe no hace nada
		System.out.println("existe el archivo ??? " + ((file.exists() == true) ? "si" : "no"));

		// intentamos leer un archivo si no existe creamos el archivo

		if (!file.exists()) {
			try {
				file.createNewFile();// esto puede generar una exceptions
				System.out.println("se creo el archivo :" + file.getName() + "el mismo se encuentra vacio ");
			} catch (IOException e) {// importamos la exception
				System.out.println("No se creo el archivo");
				e.printStackTrace();
			}
		}

		// constructor 2 : Pasamos la ruta absoluta

		File file2 = new File("C:\\Users\\u44617\\Desktop\\repoEduIt\\archivo2.txt");

		if (!file2.exists()) {
			try {
				file2.createNewFile();// esto puede generar una exceptions
				System.out.println("se creo el archivo :" + file2.getName() + " el mismo se encuentra vacio ");
			} catch (IOException e) {// importamos la exception
				System.out.println("No se creo el archivo");
				e.printStackTrace();
			}
		}

		// constructor 3 : Pasamosobjeto file y el nombre del archivo
		File ruta = new File("C:\\Users\\u44617\\Desktop\\repoEduIt");
		File file3 = new File(ruta, "archivo3.txt");

		if (!file3.exists()) {
			try {
				file3.createNewFile();// esto puede generar una exceptions
				System.out.println("se creo el archivo :" + file3.getName() + " el mismo se encuentra vacio ");
			} catch (IOException e) {// importamos la exception
				System.out.println("No se creo el archivo");
				e.printStackTrace();
			}
		}

		// constructor 4 : Pasamos la ruta absoluta y el nombre del archivo

		File file4 = new File("C:\\Users\\u44617\\Desktop\\repoEduIt", "archivo4.txt");

		if (!file4.exists()) {
			try {
				file4.createNewFile();// esto puede generar una exceptions
				System.out.println("se creo el archivo :" + file4.getName() + " el mismo se encuentra vacio ");
			} catch (IOException e) {// importamos la exception
				System.out.println("No se creo el archivo");
				e.printStackTrace();
			}
		}

		// CUARTA FORMA MEDIANTE URI
		File file5 = null;
		try {

			URI uri = new URI("file:///C:/Users/u44617/Desktop/repoEduIt/nombreArchivo.txt");
			file5 = new File(uri);

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (!file5.exists()) {
			try {

				file5.createNewFile();// esto puede generar una exceptions
				System.out.println("se creo el archivo :" + file5.getName() + " el mismo se encuentra vacio ");

			} catch (IOException e) {// importamos la exception
				System.out.println("No se creo el archivo");
				e.printStackTrace();
			}
		}

		System.out.println("Nombre :  " + file4.getName());
		System.out.println("Ruta Absoluta : " + file4.getAbsolutePath());
		System.out.println("Ruta : " + file4.getPath());
		System.out.println("se puede leer :  " + file4.canRead());
		System.out.println("se puede escribir : " + file4.canWrite());
		System.out.println("se puede ejecutar : " + file4.canExecute());
		System.out.println("es un directorio :  " + file4.isDirectory());

		System.out.println("ultima modificacion del archivo  :  " + file4.lastModified());

		System.out.println("tamaño:  " + file4.length());

	}

}
