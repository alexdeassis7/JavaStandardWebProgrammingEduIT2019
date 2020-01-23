package clase7CommitAndRollBack.eduit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class JRollback {
	static int dni = 0 ;
	public static void main(String[] args) {
			
		// Obtenemos conexion a la base de datos
		Connection connection = Database.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
			// se deshabilita el modo de confirmaci�n autom�tica
			connection.setAutoCommit(false);
			// Se preparan las sentencias SQL
			stmt1 = connection.prepareStatement("INSERT INTO miTabla VALUES( ?, ? );");
			stmt2 = connection.prepareStatement("INSERT INTO miOtraTabla VALUES( ?, ?, ? );");

			
			System.out.println("Primer INSERT tabla [miTabla] ");
			stmt1.setString(1, "000001");
			stmt1.setString(2, "micorreo@mail.com");
			stmt1.executeUpdate();

			System.out.println("Segundo INSERT tabla [miTabla] ");
			stmt1.setString(1, "000002");
			stmt1.setString(2, "amayuya@mail.com");
			stmt1.executeUpdate();

			System.out.println("Tercer INSERT tabla [miTabla] ");
			stmt1.setString(1, "000003");
			stmt1.setString(2, "diosdado@mail.com");
			stmt1.executeUpdate();

			System.out.println("Primer INSERT tabla [miOtraTabla]");
			stmt2.setString(1, "pipo");
			stmt2.setString(2, "Perez");
			// stmt2.setInt(3, 99); //Tipo de dato CORRECTO INT
			stmt2.setString(3, "Hola soy un error");// Tipo de dato INCORRECTO
			stmt2.executeUpdate();

			// se indica que se deben aplicar los cambios en la base de datos
			connection.commit();

		} catch (SQLException ex) {
			System.err.println("ERROR: " + ex.getMessage());
			if (connection != null) {
				System.out.println("Rollback");
				try {
					// deshace todos los cambios realizados en los datos
					connection.rollback();
				} catch (SQLException ex1) {
					System.err.println("No se pudo deshacer" + ex1.getMessage());
				}
			}
		} finally {
			System.out.println("cierra conexion a la base de datos");
			try {
				if (stmt1 != null)
					stmt1.close();
				if (stmt2 != null)
					stmt2.close();
				if (connection != null)
					connection.close();
			} catch (SQLException ex) {
				System.err.println(ex.getMessage());
			}
		}

	}// end:main
}

/**
 *  * Clase JRollback.java
Este clase contiene el mismo c�digo de JNOROllBack pero se le agrego algunas lineas de c�digo extra


Explicaci�n: linea a linea
22 : Se deshabilita el modo de confirmaci�n autom�tica, es decir todas las instrucciones SQL a partir de ese punto se agrupan en una sola
 transacci�n que finalizara con una llamada al m�todo commit o al m�todo rollback.
45 : Este es el tipo de dato correcto que acepta la instrucci�n SQL, para usarlo des-comenta y comenta la linea de c�digo 46
46 : El error de tipo de dato es el mismo que de la clase anterior
50 :  Aqu� hacemos uso del m�todo commit(), es decir si se llega hasta este punto quiere decir que no se encontr� ning�n error y por tanto 
todas las instrucciones SQL (en este caso INSERT) ser�n confirmadas.
59 : Si se produce alguna excepci�n, se har� un llamado al m�todo rollback() este m�todo deshace todos los cambios realizados en la transacci�n 
actual y libera cualquier bloque en la base de datos que contenga en esos momentos este objeto
 64 : Para terminar se cierra la conexi�n actual a la base de datos

 * Como en el caso anterior provocamos una excepci�n, sin embargo en esta oportunidad  la transacci�n no llega a ser confirmada (commit) y 
 * es anulada por el m�todo rollback. Si nos fijamos en nuestra base de datos, veremos que
 *  tanto en la tabla �miTabla� y �miOtraTabla� no se registro nada.
 * 
 * 
 * 
 * 
 * */

