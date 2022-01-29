/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempleados2122;

import java.sql.*;

/**
 *
 * @author navag
 */
public class CrearBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws ClassNotFoundException, SQLException {
        
 //Paso 2: Cargar el driver para las versiones modernas de MySQL y Java
 Class.forName("com.mysql.cj.jdbc.Driver");
 //Paso 3: Establecer conexión con la BD: URL, USUARIO, CONTRASEÑA
 Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/gestionempleados2122", "root", "");
 conexion.setAutoCommit(true);

 //Paso 4: Preparar la sentencia
 Statement sentencia = conexion.createStatement();

 //Paso 5: lanzar la sentencia de modificación de la BD con executeUpdate
 sentencia.executeUpdate("CREATE TABLE empleados (\n" +
 "codEmpleado INT PRIMARY KEY,\n" +
 "Nombre VARCHAR(60),\n" +
 "Apellidos VARCHAR(120),\n" +
 "Puesto VARCHAR(60),\n" +         
 "Salario FLOAT (6,2));");
 //Paso 6: Liberar los recursos
 sentencia.close();
 conexion.close(); 
        
    }
    
}
