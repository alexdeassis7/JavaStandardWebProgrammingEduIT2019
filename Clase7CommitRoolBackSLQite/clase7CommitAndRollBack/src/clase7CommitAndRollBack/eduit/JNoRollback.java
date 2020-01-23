package clase7CommitAndRollBack.eduit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @web 
 * @author Alex
 Clase JNoRollback.java
En esta clase no se hace uso de los métodos Commit y RollBack por lo que las instrucciones INSERT se irán ejecutando una tras 
otra afectando directamente a la base de datos, si no se encontrara ningún error todo terminaría normalmente, sin embargo en la 
linea de código 46 intencionalmente se intercambia el tipo de dato INT por un STRING  esto para provocar una excepción, entonces 
las instrucciones INSERT de las lineas 30,35,40 se ejecutaran pero no así la linea 47.
 *
 *Ejecutando la clase Main JNoRollback obtenemos el siguiente resultado por consola:
mal
Como dijimos más arriba, al ejecutar este código se produce una excepción “ERROR: Incorrect integer value:
 ‘Hola soy un error’ for column ‘edad’ at row 1” y si revisamos la base de datos, podremos observar como en la tabla
  “miTabla” se registraron 3 nuevas filas pero si abrimos la tabla “miOtraTabla” no existen registros, es decir no se 
  esta cumpliendo con lo principio de ATOMICIDAD Y CONSISTENCIA
 *
 */
public class JNoRollback {

    /**
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        
         //Obtenemos conexion a la base de datos
        Connection connection = Database.getConnection();
         
        PreparedStatement stmt1=null;
        PreparedStatement stmt2=null;         
        
        try {            
            //Se preparan las sentencias SQL
            stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES( ?, ? );");            
            stmt2 = connection.prepareStatement("INSERT INTO miotratabla (nombre,apellido,edad) VALUES( ?, ?, ? );");
            
            System.out.println( "Primer INSERT tabla [miTabla] " ); 
            stmt1.setString(1, "000001");
            stmt1.setString(2, "micorreo@mail.com");
            stmt1.executeUpdate();
        
            System.out.println( "Segundo INSERT tabla [miTabla] " ); 
            stmt1.setString(1, "000002");
            stmt1.setString(2, "amayuya@mail.com");
            stmt1.executeUpdate();
            
            System.out.println( "Tercer INSERT tabla [miTabla] " ); 
            stmt1.setString(1, "000003");
            stmt1.setString(2, "diosdado@mail.com");
            stmt1.executeUpdate();
            
            System.out.println( "Primer INSERT tabla [miOtraTabla]" );
            stmt2.setString(1, "leo");
            stmt2.setString(2, "Piffer");            
            //stmt2.setInt(3, 99); //Tipo de dato CORRECTO INT
            stmt2.setString(3, "Hola soy un error");//Tipo de dato INCORRECTO 
            stmt2.executeUpdate();
      
        } catch (SQLException ex) {
            System.err.println("ERROR: " + ex.getMessage());                            
        }finally{
            System.out.println( "cierra conexion a la base de datos" );    
            try {
                if(stmt1!=null) stmt1.close();                
                if(stmt2!=null) stmt2.close();                
                if(connection!=null) connection.close();
            } catch (SQLException ex) {
                System.err.println( ex.getMessage() );    
            }
        }      
        
    }//end:main
}