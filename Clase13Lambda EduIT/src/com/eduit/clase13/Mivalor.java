package com.eduit.clase13;

//na interfaz funcional es una interfaz que especifica sólo un método abstracto. Antes de continuar, 
//recuerde que no todos los métodos de interfaz son abstractos. A partir de JDK 8, es posible que una interfaz tenga uno o más 
//métodos default (predeterminados). Los métodos default no son abstractos. Tampoco lo son los métodos de interfaz estáticos o privados. 
//Por lo tanto, un método de interfaz es abstracto sólo si no especifica una implementación. Esto significa que una interfaz funcional puede 
//incluir métodos por defecto, estáticos o privados, pero en todos los casos debe tener un solo y único método abstracto. 
//Debido a que los métodos de interfaz no predeterminados, no estáticos y no privados son implícitamente abstractos, 
//no hay necesidad de usar el modificador abstract (aunque puede especificarlo, si lo desea).

//Aquí hay un ejemplo de una interfaz funcional:
public interface Mivalor {
	double getValor();

//	  En este caso, el método getValor() es implícitamente abstracto, y es el único método definido por MiValor. 
//	  Por lo tanto, MiValor es una interfaz funcional, y su función está definida por getValor().
//
//	  Como se mencionó anteriormente, una expresión lambda no se ejecuta por sí misma. M
//	  ás bien, forma la implementación del método abstracto definido por la interfaz funcional que especifica su tipo de objetivo.
//	  Como resultado, una expresión lambda solo se puede especificar en un contexto en el que se define un tipo de objetivo.
//	  Uno de estos contextos se crea cuando una expresión lambda se asigna a una referencia de interfaz funcional.
//	  Otros contextos de tipo de objetivo incluyen inicialización de variable, declaraciones de return y argumentos de método, por nombrar algunos.

}
