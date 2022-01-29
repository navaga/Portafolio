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
public class consultarBD {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        //Paso 2: Cargar el driver para las versiones modernas de MYSQL Y Java
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Paso 3: Establecer la conexion con la BD : URL, USUARIO y CONTRASEÑA
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/gestionempleados2122","root","");
        
        conexion.setAutoCommit(true);
        
        //Paso 4: Preparar la sentencia
        Statement sentencia = conexion.createStatement();
        
        //Paso 5: Lanzar una consulta SQL con ExecuteQuery
        ResultSet resultado = sentencia.executeQuery("SELECT * FROM empleados");
      
        //Paso 6: recorremos la colección para visualizar cada fila
        //Hacemos un bucle mientras que haya registros y sacamos los datos por nombre de columna
        while(resultado.next()){
            System.out.println(resultado.getInt("codEmpleado")+"\t\t"+
                    resultado.getString("Nombre")+"\t\t"+
                    resultado.getString("Apellidos")+"\t\t"+
                    resultado.getString("Puesto")+"\t\t"+
                    resultado.getFloat("Salario")+"\n");
        }
        
        //Paso 7: Liberar los recursos
        sentencia.close();
        conexion.close();   
    }
   
    
}
