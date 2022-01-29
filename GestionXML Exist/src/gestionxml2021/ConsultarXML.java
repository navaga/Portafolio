package gestionxml2021;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navag
 */
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xmldb.api.*;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;

public class ConsultarXML {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, XMLDBException, ParserConfigurationException, TransformerException {
        //1.- Cargar el driver
        Class driverClass = Class.forName("org.exist.xmldb.DatabaseImpl");
        Database db = (Database)driverClass.newInstance();
        DatabaseManager.registerDatabase(db);
        
        //2.- Cargar la coleccion
        String URL="xmldb:exist://localhost:8080/exist/xmlrpc/empleados"; //URL de conexion 
        String user="admin"; //usuairo
        String pass="admin"; //contraseña 
        Collection colec = DatabaseManager.getCollection(URL,user,pass);
        
      
        if(colec!=null){
            XPathQueryService servicio = (XPathQueryService) colec.getService("XPathQueryService", "1.0");
   
            //Lanzamos la consulta XPATH que devuelve una coleccion ResourceSet
            ResourceSet resultado = servicio.query("//empleado");
            
            //Creamos un iterador de la coleccion
            ResourceIterator it = resultado.getIterator();
            
            //Recorremos la coleccion con el iterador
            while (it.hasMoreResources()){
           
                Resource r = it.nextResource();
                
                System.out.println(r.getContent()); //Mostramos el contenido de cada recurso
                System.out.println(" ");
            }
            
            colec.close(); 
            
        }else{
            System.out.println("La coleccion no existe");
        }

    }

   
    
}
