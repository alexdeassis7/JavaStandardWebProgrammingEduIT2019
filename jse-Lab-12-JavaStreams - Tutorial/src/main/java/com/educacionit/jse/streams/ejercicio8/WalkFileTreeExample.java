/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.jse.streams.ejercicio8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WalkFileTreeExample {

    /*
     El metodo Files.walkFileTree() se utiliza para recorrer un arbol de directorios recursivamente. 
     El metodo recibe como parametros una instancia de Path y un FileVisitor.
     La instancia de Path apunta al directorio a recorrer.
     El FileVisitor es llamado durante el recorrido.
     FileVisitor es una interface, por lo cual nosotros debemos codear nuestra propia implementacion.
     */
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src");
        Files.walkFileTree(path, new Visitador());

    }
}