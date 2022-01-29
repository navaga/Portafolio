/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad02;

import java.io.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

/**
 *
 * @author navag
 */
public class EscribirXml {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        //Contruimos el parser del documento XML a traves del objeto builder
        /*El patrón Builder o Constructor es otro de los patrones creacionales. 
        Este patrón permite separar la construcción de un objeto complejo de su representación, de modo
        que el mismo proceso de construcción pueda crear diferentes representaciones de este objeto*/

           
        DOMImplementation imp = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder(); //Para obtener el documento DOM
            
            imp = builder.getDOMImplementation();
            
        } catch (ParserConfigurationException ex) {
            System.out.println("Error en la creacion del DOM "+ ex);
        }
        
        //Creamos la representacion del documento XML con su nodo raiz
        Document doc = imp.createDocument(null, "Alumno", null);
        doc.setXmlVersion("1.0");
        
        Element etiqueta = doc.createElement("Nombre"); //Creamos la etiqueta
        
        Text texto = doc.createTextNode("Ignacio Valero Garcia"); //Creamo el texto de la etiqueta

        doc.getDocumentElement().appendChild(etiqueta); //Añadimos el element al padre
        
        etiqueta.appendChild(texto); // Añadimos el texto a la etiqueta
        
        
        //Trasformamaos de Document XML a Archivo XML final
        
        //Creamos la fueste con el Document 
        Source docFuente = new DOMSource(doc); 
        
        //Creamos el fichero de destino con FILE
        File fichXML = new File(System.getProperty("user.home") + File.separator + "Desktop","alumno.xml");
        
        //Creamos el flujo hasta el destino (trasformador)
        Result result = new StreamResult(fichXML);
        
        
        try {
            Transformer tran = TransformerFactory.newInstance().newTransformer(); //Creamos el transformador
            tran.transform(docFuente, result);
        } catch (TransformerException ex) {
            System.out.println("Error en la transformacion"+ex);
        }
        
        


    }
    
}
