/*
 * Escritor.java
 *
 */
package com.educacionit.jse.streams.ejercicio2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class Escritor {

    /**
     * Creates a new instance of Escritor
     */
    public Escritor() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // Instancia un objeto File de salida
        File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

        // Instancia un FileWriter que se encargara de escribir
        FileWriter out = new FileWriter(outputFile);

        // Construye una cadena de caracteres a ser guardada en el archivo
        String info = "Soy la informacion!";

        // Escribe el archivo con la informacion
        for (int i = 0; i < info.length(); i++) {
            out.write(info.charAt(i));
        }

        // Cierra el stream
        out.close();

        // Informa que el archivo ha sido escrito
        System.out.println("El archivo ha sido escrito...");

    }

}
