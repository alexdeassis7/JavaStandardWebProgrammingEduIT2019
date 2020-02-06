/*
 * CopiadorDeArchivosDeTexto.java
 *
 *
 */
package com.educacionit.jse.streams.ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public class Copiador {

    public static void main(String[] args) throws IOException {
        /* 
         Para que funcione correctamente deber�:
         � tener un archivo fuente.txt en el directorio archivosES\entrada
         � tener creado el directorio archivosES\salida
         */

        // Instancia un objeto File de entrada y otro de salida
        File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");
        File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

        // Instancia un FileReader y un FileWriter que se encargaran de leer y escribir archivos respectivamente
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);

        // Instancia una variable que contendr� el caracter a leer
        int unCaracter;

        // Informa que se est� copiando el archivo
        System.out.println("\n\tEl archivo est� siendo copiado....");

        // Lee el archivo in y guarda la informacion en el archivo out
        while ((unCaracter = in.read()) != -1) {
            out.write(unCaracter);
        }

        // Cierra los archivos
        in.close();
        out.close();

        // Informa que se ha copiado el archivo
        System.out.println("\tEl archivo ha sido copiado con �xito....\n");
    }
}
