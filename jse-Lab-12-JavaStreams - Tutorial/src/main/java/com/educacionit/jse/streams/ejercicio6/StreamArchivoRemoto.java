/*
 * StreamArchivoRemoto.java
 *
 *
 */
package com.educacionit.jse.streams.ejercicio6;

import java.net.*;
import java.io.*;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class StreamArchivoRemoto {

    /**
     * Creates a new instance of StreamArchivoRemoto
     */
    public StreamArchivoRemoto() {
    }

    public static void main(String[] args) {
        try {

            // Setea los datos del proxy (Comentar las siguientes lineas en caso de no haber proxy)
            /*
             Properties systemSettings = System.getProperties();
             systemSettings.put("proxySet", "true");
             systemSettings.put("http.proxyHost","192.168.0.1") ;
             systemSettings.put("http.proxyPort", "80") ;
             */
            // Construye un objeto URL
            URL url = new URL("http://www.clarin.com");

            // Construye un stream contra la url
            BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

            // Variables
            boolean eof = false;
            String unaLinea;

            // Lee el contenido del archivo y lo imprime en pantalla
            while (!eof) {
                // Lee una linea
                unaLinea = elBuffer.readLine();

                // Imprime la linea en pantalla
                if (unaLinea != null) {
                    System.out.println(unaLinea);
                } // Termina la ejecución
                else {
                    eof = true;
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("La url no es válida:" + e.toString());
        } catch (IOException e) {
            System.out.println("No se puede leer de Internet: " + e.toString());
        }
    }
}
