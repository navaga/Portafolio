/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionxml2021;
import org.xmldb.api.*;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.*; 

/**
 *
 * @author navag
 */
public class CrearColeccion {
    
    public static void main(String[] args) throws Exception {

 //1.- Cargar el driver
 Class driverClass = Class.forName("org.exist.xmldb.DatabaseImpl");
 Database db = (Database) driverClass.newInstance();
 DatabaseManager.registerDatabase(db);

 //2.- Cargar la coleccion
 String URL = "xmldb:exist://localhost:8080/exist/xmlrpc/db"; //Url de conexión con la colección
 String user = "admin"; //Usuario
 String pass = "admin"; //Contraseña
 Collection colec = DatabaseManager.getCollection(URL,user,pass); //Conectando con la BD
 
 
 //3.- Abrir el servicio de gestión de colecciones
 if(colec!=null){
 CollectionManagementService mSer = (CollectionManagementService)
 colec.getService("CollectionManagementService", "1.0");
 mSer.createCollection("empleados"); //--> Creación de la colección
 //mSer.removeCollection("nuevaColeccion"); //--> Borrado de la colección
 colec.close();
 }
 else{
 System.out.println("La colección no existe");
 }
 }
} 
    

