package com.eduit.clase13;

public class Main {

	// https://javadesdecero.es/avanzado/expresiones-lambda-java/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea una referencia a una instancia de MiValor.
		Mivalor miVal;

//		A continuación, se asigna una expresión lambda a esa referencia de interfaz:
		// Usa una lambda en un contexto de asignación.
		miVal = () -> 28.6;

//		Esta expresión lambda es compatible con getValor() porque, al igual que getValor(), no tiene parámetros y devuelve un resultado double.
//		En general, el tipo de método abstracto definido por la interfaz funcional y 
//		el tipo de expresión lambda debe ser compatible. Si no lo son, se producirá un error en tiempo de compilación.

//	   los dos pasos que se muestran pueden combinarse en una sola declaración, si lo desea:
		Mivalor miVal2 = () -> 3.8; // Aquí, miVal se inicializa con la expresión lambda.

//		Cuando se produce una expresión lambda en un determinado contexto ,
//		se crea automáticamente una instancia de una clase que implementa la interfaz funcional, 
//		definiendo la expresión lambda el comportamiento del método abstracto declarado por la interfaz funcional. 
//		Cuando se llama a ese método a través del objetivo, se ejecuta la expresión lambda. Por lo tanto, 
//		una expresión lambda nos da una forma de transformar un segmento de código en un objeto.

//		En el ejemplo anterior, la expresión lambda se convierte en la implementación del método getValor(). 
//		Como resultado, lo siguiente muestra el valor 28.6:

		// Llama a getValor(), que se implementa mediante la expresión lambda
		// asignada previamente.
		System.out.println("Un valor constante: " + miVal2.getValor());
		System.out.println("Un valor constante: " + miVal.getValor());
//		Debido a que la expresión lambda asignada a miVal devuelve el valor 28.6, ese es el valor obtenido cuando se llama a getValor().

		// MiValPAram demo
		// usar esta interfaz para implementar la lambda recíproca. Por ejemplo:

		MiValParam miValor = (n) -> 1.0 / n;
		System.out.println("El recíproco de 4.0 es: " + miValor.getValor(4.0));

//		Hay algo más de interés en el ejemplo anterior. Tenga en cuenta que el tipo de n no está especificado. 
//		Más bien, su tipo se deduce del contexto. En este caso, su tipo se deduce del tipo de parámetro de getValor() tal 
//		como lo define la interfaz MiValParam, es double. También es posible especificar explícitamente el tipo de un parámetro en una expresión lambda.
//		Por ejemplo, esta es también una forma válida de escribir lo anterior:

		MiValParam miValor2 = (double n) -> 1.0 / n;
//			Aquí, n se especifica explícitamente como double. Por lo general, no es necesario especificar explícitamente el tipo.
		System.out.println("El recíproco de 4.0 es: " + miValor2.getValor(4.0));

//			Antes de continuar, es importante destacar un punto clave:
//		para que una expresión lambda se use en un contexto de tipo de objetivo,
//		el tipo de método abstracto y el tipo de expresión lambda deben ser compatibles. 
//		Por ejemplo, si el método abstracto especifica dos parámetros int, entonces la lambda debe especificar dos parámetros cuyo tipo sea explícitamente
//		int o inferirse implícitamente como int por el contexto. En general, el tipo y el número de los parámetros de la expresión lambda deben ser 
//		compatibles con los parámetros del método y su tipo de retorno.		

	}

}
