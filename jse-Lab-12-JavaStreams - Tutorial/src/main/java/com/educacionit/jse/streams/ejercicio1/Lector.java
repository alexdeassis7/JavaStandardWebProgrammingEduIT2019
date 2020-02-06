/*
 * Lector.java
 *
 */
package com.educacionit.jse.streams.ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class Lector {

    /**
     * Creates a new instance of Lector
     */
    public Lector() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /* 
         Para que funcione correctamente deberá:
         · tener un archivo fuente.txt en el directorio archivosES\entrada
         */

        // Instancia un objeto File de entrada
        File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

        // Instancia un FileReader que se encargara de leer del archivo
        FileReader in = new FileReader(inputFile);

        // Declara una variable que contendrá el caracter a leer
        int unCaracter;

        // Lee el archivo e informa
        while ((unCaracter = in.read()) != -1) {
            System.out.print((char) unCaracter);
        }

        // Cierra el archivo
        in.close();

    }

}
