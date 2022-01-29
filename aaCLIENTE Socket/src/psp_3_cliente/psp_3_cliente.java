/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_3_cliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author navag
 */
public class psp_3_cliente extends Thread {

    private javax.swing.JTextArea txtmensajes;
    private String server;
    private int puerto;
    private boolean salir =false;
    private Socket cliente;
    private BufferedReader recibir;
    private PrintWriter enviar;
   
    public psp_3_cliente (javax.swing.JTextArea txtmensajes,String server,int puerto){
        
        //inicialicamos variables del puerto y servidor.
        this.server = server;
        this.puerto = puerto;
       try{
        this.txtmensajes=txtmensajes;
        //añadimos al socket la ip y el puerto
        cliente = new Socket (this.server,this.puerto);
        this.txtmensajes.append("Conexion establecida con el servidor .... " + System.lineSeparator());
        
       }
       catch (Exception ex ){
       
        this.txtmensajes.append("Error al conectar con el servidor.... " + ex.getMessage()+ System.lineSeparator());
        salir = true;
       }
        
    }
    
    public void enviar (String mensaje){
        //enviamos al servidor la informacion.
        enviar.println (mensaje);
        enviar.flush();
    
    }
   
    public void run (){
      if (!salir){
          try {
              recibir = new BufferedReader (new InputStreamReader (cliente.getInputStream()));
              enviar = new PrintWriter (cliente.getOutputStream(),true);
          
              while (!salir){
                  String comando =recibir.readLine();
                  txtmensajes.append("SERVIDOR: " + comando + System.lineSeparator());
                  
              }
          }
          catch(Exception ex){
          
          
          }
      
      }  
    }
    
}
