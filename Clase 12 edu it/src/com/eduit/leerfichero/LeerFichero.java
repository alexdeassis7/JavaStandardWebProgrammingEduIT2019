package com.eduit.leerfichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {
//	http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
	
//	Podemos abrir un fichero de texto para leer usando la clase FileReader.
//	Esta clase tiene m�todos que nos permiten leer caracteres. Sin embargo, suele ser habitual querer las l�neas completas, 
//	bien porque nos interesa la l�nea completa, bien para poder analizarla luego y extraer campos de ella. 
//	FileReader no contiene m�todos que nos permitan leer l�neas completas, pero s� BufferedReader.
//	Afortunadamente, podemos construir un BufferedReader a partir del FileReader de la siguiente forma:
	public static void main(String[] args) {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("C:\\Users\\Alex\\Documents\\archivo.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			La apertura del fichero y su posterior lectura pueden lanzar excepciones que debemos capturar. 
//			Por ello, la apertura del fichero y la lectura debe meterse en un bloque try-catch.
//
//			Adem�s, el fichero hay que cerrarlo cuando terminemos con �l, tanto si todo ha ido bien como si ha habido alg�n error en la lectura despu�s de haberlo abierto. 
//			Por ello, se suele poner al try-catch un bloque finally y dentro de �l, el close() del fichero.
//			
//			
//			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
