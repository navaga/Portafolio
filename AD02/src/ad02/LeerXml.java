/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad02;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 *
 * @author navag
 */
public class LeerXml {
    public static void main(String[] args) {
        
        //Construimos el parser o builder del documento XML a traves de un objeto builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            System.out.println("Error en creación del documentBuilder "+ ex);
        }
        
        File fichXML = new File(System.getProperty("user.home") + File.separator + "Desktop" , "alumno.xml");

        //parseamos el documento
        Document doc = null;
        try {
            doc = builder.parse(fichXML);
        } catch (SAXException ex) {
            System.out.println("Error en el parseo del fichero");
        } catch (IOException ex) {
            System.out.println("Error en el fichero XML");
        }
        //NOrmalizamos el documento
        doc.getDocumentElement().normalize();
        
        //Cremoa una lista de nodos con todos los nodos de la raiz
        NodeList raiz = doc.getElementsByTagName("Alumno");
        
        //Abrimos la etiqueta raiz
        System.out.println("<"+doc.getDocumentElement().getNodeName()+">");
        
        //Cogemos la lista de nodos hijos de la raiz
        NodeList lista = raiz.item(0).getChildNodes();
        
        for(int i= 0 ; i< lista.getLength(); i++){
    
            //Tomamos cada nodo departamento
            Node d = lista.item(i);
            //Mostramos la etiqueta de apertura de ese nodo
            System.out.print("\t<"+d.getNodeName()+">");
    
            //Comprobamos que es una etiqueta para sacarle el texto
            if(d.getNodeType()==Node.ELEMENT_NODE){
                //Mostramos el texto de la etiqueta 
                System.out.print(d.getFirstChild().getNodeValue());
                
            }
            
            //Mostramos la etiqueta de cierre de ese nodo
            System.out.println("</"+d.getNodeName()+">");
    
        }
        
        //Cerra la etiqueta raiz
        System.out.println("</"+doc.getDocumentElement().getNodeName()+">");
        
    }
    
}
