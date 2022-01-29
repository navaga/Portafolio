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
public class InsertarBD {
    
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
 //Paso 2: Cargar el driver
 Class.forName("com.mysql.cj.jdbc.Driver");

 //Paso 3: Establecer conexion con la BD: URL, USUARIO, CONTRASEÑA
 Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/gestionempleados2122", "root", "");
 conexion.setAutoCommit(true);

 //Paso 4: Preparar la sentencia
 Statement sentencia = conexion.createStatement();

 //Paso 5: lanzar la sentencia
 int filas = 0;
        filas = filas + sentencia.executeUpdate("INSERT INTO empleados (codEmpleado, Nombre, Apellidos, Puesto, Salario) VALUES (1, 'Ignacio', 'Valero Garcia', 'Desarrollador',1750)");
        filas = filas + sentencia.executeUpdate("INSERT INTO empleados (codEmpleado, Nombre, Apellidos, Puesto, Salario) VALUES (2, 'Manuel', 'Martinez', 'Contable',1200)");
        filas = filas + sentencia.executeUpdate("INSERT INTO empleados (codEmpleado, Nombre, Apellidos, Puesto, Salario) VALUES (3, 'Silvia', 'Marzo', 'Desarrollador',1600)");
        filas = filas + sentencia.executeUpdate("INSERT INTO empleados (codEmpleado, Nombre, Apellidos, Puesto, Salario) VALUES (4, 'Miguel', 'Cerezo', 'Analista',1500)");
        filas = filas + sentencia.executeUpdate("INSERT INTO empleados (codEmpleado, Nombre, Apellidos, Puesto, Salario) VALUES (5, 'Sara', 'Toro', 'Gerente',1800)");
          

 //Paso 6: Comprobamos cuantas filas se han insertado
 System.out.println("Al realizar la inserción se han insertado "+ filas+" filas");

 //Paso 7: Liberar los recursos
 sentencia.close();
 conexion.close();
 } 
    
}

