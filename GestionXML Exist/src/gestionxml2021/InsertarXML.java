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

public class InsertarXML {

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
        
        //Datos de la insercion
        String codEmpleado[]={"1","2","3","4","5"};
        String nombre[]={"Ignacio","Francisco","Maria","Melchor","Cristina"};
        String apellido[]={"Valero Garcia","Frailes","Mendez","Fuentes","Jimenez"};
        String puesto[]={"Desarrollador","Administrativo","Desarrollador","analista","Gerente"};
        float salario[] ={1350,1000,1500,1300,1700};
        
        if(colec!=null){
           String sentenciaInsercion = null;
             XPathQueryService servicio = (XPathQueryService) colec.getService("XPathQueryService", "1.0");
            //Sentecia XQUERY con nodo a insertar
           for(int i=0;i<codEmpleado.length;i++){
               
             sentenciaInsercion =
                    "update insert "
                    + "<empleado>"
                    +"<codEmpleado>"+codEmpleado[i]+"</codEmpleado>"
                    + "<nombre>"+nombre[i]+ "</nombre>"
                    + "<apellido>"+apellido[i]+"</apellido>"
                    + "<puesto>"+puesto[i]+"</puesto>"
                    + "<salario>"+salario[i]+"</salario>"
                    
                    +"</empleado> "
                    + "into /empleados";
            //Lanzamos la sentencia de insercion
            servicio.query(sentenciaInsercion);
            System.out.println("La operacion de insercion es: \n"+sentenciaInsercion);
            }
            
            
            
            colec.close(); 
            
        }else{
            System.out.println("La coleccion no existe");
        }

    }

   
    
}
