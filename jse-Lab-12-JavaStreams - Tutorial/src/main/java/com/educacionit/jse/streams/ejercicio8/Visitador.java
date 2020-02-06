package com.educacionit.jse.streams.ejercicio8;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Visitador implements FileVisitor<Path>{
	
	  @Override
      public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
          System.out.println("pre visit dir:" + dir);
          return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
          System.out.println("visit file: " + file);
          return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
          System.out.println("visit file failed: " + file);
          return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
          System.out.println("post visit directory: " + dir);
          return FileVisitResult.CONTINUE;
      }

}
