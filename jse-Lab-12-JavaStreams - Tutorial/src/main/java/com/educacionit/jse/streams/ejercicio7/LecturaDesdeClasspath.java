/*
 * LecturaDesdeClasspath.java
 *
 */
package com.educacionit.jse.streams.ejercicio7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@educacionit.com.ar>
 */
public class LecturaDesdeClasspath {

    /**
     * Creates a new instance of LecturaDesdeClasspath
     */
    public LecturaDesdeClasspath() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // Determina la ubicacion del arhivo a leer
        String archivoALeer = "/ar/com/educacionit/streams/recursos/noticias.txt";

        // Obtiene un stream al archivo a leer
        InputStreamReader isr = new InputStreamReader(LecturaDesdeClasspath.class.getResourceAsStream(archivoALeer));

        // Construye un BufferedReader
        BufferedReader readerMejorado = new BufferedReader(isr);

        // Define variables
        boolean eof = false;
        String lineaLeida = "";

        // Lee el archivo "in" de forma eficiente e imprime los datos en pantalla
        while (!eof) {
            // Lee una linea entera
            lineaLeida = readerMejorado.readLine();

            // Imprime la linea en pantalla
            if (lineaLeida != null) {
                System.out.println(lineaLeida);
            } // Si llego al final del archivo, termina la ejecución
            else {
                eof = true;
            }
        }

        // Cierra el FileReader
        readerMejorado.close();
    }

}
