package com.eduit.clase13;

//na interfaz funcional es una interfaz que especifica s�lo un m�todo abstracto. Antes de continuar, 
//recuerde que no todos los m�todos de interfaz son abstractos. A partir de JDK 8, es posible que una interfaz tenga uno o m�s 
//m�todos default (predeterminados). Los m�todos default no son abstractos. Tampoco lo son los m�todos de interfaz est�ticos o privados. 
//Por lo tanto, un m�todo de interfaz es abstracto s�lo si no especifica una implementaci�n. Esto significa que una interfaz funcional puede 
//incluir m�todos por defecto, est�ticos o privados, pero en todos los casos debe tener un solo y �nico m�todo abstracto. 
//Debido a que los m�todos de interfaz no predeterminados, no est�ticos y no privados son impl�citamente abstractos, 
//no hay necesidad de usar el modificador abstract (aunque puede especificarlo, si lo desea).

//Aqu� hay un ejemplo de una interfaz funcional:
public interface Mivalor {
	double getValor();

//	  En este caso, el m�todo getValor() es impl�citamente abstracto, y es el �nico m�todo definido por MiValor. 
//	  Por lo tanto, MiValor es una interfaz funcional, y su funci�n est� definida por getValor().
//
//	  Como se mencion� anteriormente, una expresi�n lambda no se ejecuta por s� misma. M
//	  �s bien, forma la implementaci�n del m�todo abstracto definido por la interfaz funcional que especifica su tipo de objetivo.
//	  Como resultado, una expresi�n lambda solo se puede especificar en un contexto en el que se define un tipo de objetivo.
//	  Uno de estos contextos se crea cuando una expresi�n lambda se asigna a una referencia de interfaz funcional.
//	  Otros contextos de tipo de objetivo incluyen inicializaci�n de variable, declaraciones de return y argumentos de m�todo, por nombrar algunos.

}
