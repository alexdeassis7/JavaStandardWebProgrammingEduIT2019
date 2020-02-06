/*
 * ReaderMejorado.java
 *
 *
 */
package com.educacionit.jse.streams.ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public class LectorMejorado {

    /**
     * Creates a new instance of ReaderMejorado
     */
    public LectorMejorado() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /* 
         Para que funcione correctamente deber�:
         � tener un archivo fuente.txt en el directorio archivosES\entrada
         */

        // Instancia un objeto File de entrada
        File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

        // Construye un BufferedReader
        BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));

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
            } // Si llego al final del archivo, termina la ejecuci�n
            else {
                eof = true;
            }
        }

        // Cierra el FileReader
        readerMejorado.close();

    }

}
