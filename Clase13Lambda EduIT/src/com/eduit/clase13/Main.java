package com.eduit.clase13;

public class Main {

	// https://javadesdecero.es/avanzado/expresiones-lambda-java/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea una referencia a una instancia de MiValor.
		Mivalor miVal;

//		A continuaci�n, se asigna una expresi�n lambda a esa referencia de interfaz:
		// Usa una lambda en un contexto de asignaci�n.
		miVal = () -> 28.6;

//		Esta expresi�n lambda es compatible con getValor() porque, al igual que getValor(), no tiene par�metros y devuelve un resultado double.
//		En general, el tipo de m�todo abstracto definido por la interfaz funcional y 
//		el tipo de expresi�n lambda debe ser compatible. Si no lo son, se producir� un error en tiempo de compilaci�n.

//	   los dos pasos que se muestran pueden combinarse en una sola declaraci�n, si lo desea:
		Mivalor miVal2 = () -> 3.8; // Aqu�, miVal se inicializa con la expresi�n lambda.

//		Cuando se produce una expresi�n lambda en un determinado contexto ,
//		se crea autom�ticamente una instancia de una clase que implementa la interfaz funcional, 
//		definiendo la expresi�n lambda el comportamiento del m�todo abstracto declarado por la interfaz funcional. 
//		Cuando se llama a ese m�todo a trav�s del objetivo, se ejecuta la expresi�n lambda. Por lo tanto, 
//		una expresi�n lambda nos da una forma de transformar un segmento de c�digo en un objeto.

//		En el ejemplo anterior, la expresi�n lambda se convierte en la implementaci�n del m�todo getValor(). 
//		Como resultado, lo siguiente muestra el valor 28.6:

		// Llama a getValor(), que se implementa mediante la expresi�n lambda
		// asignada previamente.
		System.out.println("Un valor constante: " + miVal2.getValor());
		System.out.println("Un valor constante: " + miVal.getValor());
//		Debido a que la expresi�n lambda asignada a miVal devuelve el valor 28.6, ese es el valor obtenido cuando se llama a getValor().

		// MiValPAram demo
		// usar esta interfaz para implementar la lambda rec�proca. Por ejemplo:

		MiValParam miValor = (n) -> 1.0 / n;
		System.out.println("El rec�proco de 4.0 es: " + miValor.getValor(4.0));

//		Hay algo m�s de inter�s en el ejemplo anterior. Tenga en cuenta que el tipo de n no est� especificado. 
//		M�s bien, su tipo se deduce del contexto. En este caso, su tipo se deduce del tipo de par�metro de getValor() tal 
//		como lo define la interfaz MiValParam, es double. Tambi�n es posible especificar expl�citamente el tipo de un par�metro en una expresi�n lambda.
//		Por ejemplo, esta es tambi�n una forma v�lida de escribir lo anterior:

		MiValParam miValor2 = (double n) -> 1.0 / n;
//			Aqu�, n se especifica expl�citamente como double. Por lo general, no es necesario especificar expl�citamente el tipo.
		System.out.println("El rec�proco de 4.0 es: " + miValor2.getValor(4.0));

//			Antes de continuar, es importante destacar un punto clave:
//		para que una expresi�n lambda se use en un contexto de tipo de objetivo,
//		el tipo de m�todo abstracto y el tipo de expresi�n lambda deben ser compatibles. 
//		Por ejemplo, si el m�todo abstracto especifica dos par�metros int, entonces la lambda debe especificar dos par�metros cuyo tipo sea expl�citamente
//		int o inferirse impl�citamente como int por el contexto. En general, el tipo y el n�mero de los par�metros de la expresi�n lambda deben ser 
//		compatibles con los par�metros del m�todo y su tipo de retorno.		

	}

}
