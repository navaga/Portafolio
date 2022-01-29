/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class GestionClientes {
    
     // HASMAP PARA GUARDAR CLIENTES
     static HashMap<Integer, Cuenta> map = new HashMap<Integer, Cuenta>();
    

    public void insertar(int numeroDeCuenta, double saldo,Cliente titular) throws IOException {
        

        if (!map.values().contains(map.get(titular.getIdCliente()))) // COMPROVAMOS QUE EL CODIGO NO EXISTA PARA NO SOBREESCRIBIR
        {

            Cuenta t = new CuentaCorriente(numeroDeCuenta, saldo,titular); //USAMOS POLIMORFIMOS Y CREAMOS UN OBJETO CUENTA DE TIPO CUENTACORRIENTE
            map.put(t.titular.getIdCliente(), t);  // SI EL CODIGO NO EXISTE LO INSERTAMOS.
            
            

        }else
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE Y NO SE INSERTÓ", "ERROR", JOptionPane.WARNING_MESSAGE);
    }
     public void insertar(int numeroDeCuenta, double saldo,Cliente titular,double interesVariable,double saldoMinimo) throws IOException {
        

        if (!map.values().contains(map.get(titular.getIdCliente()))) // COMPROVAMOS QUE EL CODIGO NO EXISTA PARA NO SOBREESCRIBIR
        {

            Cuenta t = new CuentaAhorro(numeroDeCuenta, saldo,titular,interesVariable,saldoMinimo); //USAMOS POLIMORFIMOS Y CREAMOS UN OBJETO CUENTA DE TIPO CUENTAAHORRO
            map.put(t.titular.getIdCliente(), t);  // SI EL CODIGO NO EXISTE LO INSERTAMOS.
            
            

        }else
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE Y NO SE INSERTÓ", "ERROR", JOptionPane.WARNING_MESSAGE);
    }

   // METODO PARA BUSCAR CLIENTES
    public String[] buscar(int codigo) {

        
        String mensaje2[] = {"2","El codigo "+codigo+" no existe"};
        
        if (map.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES", "ERROR", JOptionPane.WARNING_MESSAGE);
           
        } else if (map.values().contains(map.get(codigo))) 
            {
                // NOS DEVUELVE LOS DATOS DEL CLIENTE Y SI ES DE TIPO CUENTAAHORRO O CUENTA CORRIENTE.
                mensaje2[1] = mostar(codigo);
                mensaje2[0] = "0";
                 if(map.get(codigo).getClass()== CuentaAhorro.class)
                        {
                            
                            mensaje2[1] = mostar(codigo);
                            mensaje2[0] = "1";
                        
                        }
            }
        
       
        
        return mensaje2;
    }

    public String ingresar(int dinero,int idCliente)
    {
       // METODO PARA INGRESAR 
       
        String mensaje = "el id del cliente no existe";
         if (map.isEmpty()) { // COMPROBAR SI EL HASMAP ESTA VACIO
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (map.values().contains(map.get(idCliente)))  // COMPROBAR SI EXISTE EL CLIENTE
        {
            map.get(idCliente).ingresar(dinero); // LLAMA AL METODO INGRESAR 
            mensaje = mostar(idCliente);     
        }
        return mensaje;
    }
    
        // METODO PARA RETIRAR DINERO 
    
       public String retirar(double dinero,int idCliente)
    {
        String mensaje = "el id del cliente no existe";
         if (map.isEmpty()) { // COMPROBAR SI EL HASMAP ESTA VACIO
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (map.values().contains(map.get(idCliente)))  // COMPROBAR SI EXISTE EL CLIENTE
        {
            map.get(idCliente).retirar(dinero);  // LLAMA AL METODO RETIRAR 
            mensaje = mostar(idCliente);
        }
        return mensaje;
    }
       
       // METODO PARA APLICAR INTERES 
       
     public String aplicarInteres(int codigo) {

        
        String mensaje2="El codigo no existe";
        if (map.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (map.values().contains(map.get(codigo))) 
            {
                
                map.get(codigo).actualizarSaldo();
                mensaje2= mostar(codigo);
            }
      
        return mensaje2;
    }
    
     // METODO PARA GUARDAR EN UN STRING LA INFORMACION DE LOS CLIENTES DIFERENCIANDO SI SON DE CUENTAAHORRO O CUENTA CORRIENTE.
    public String mostar(int codigo)
    {
        String mensaje= "id Cliente: "+map.get(codigo).getTitular().getIdCliente()+"\nNombre: "+map.get(codigo).getTitular().getNombre()+
                    "\ndireccion: "+map.get(codigo).getTitular().getDireccion()+"\ntelefono: "+map.get(codigo).getTitular().getTelefono()+
                    "\nnumero de cuenta: "+map.get(codigo).getNumeroDeCuenta()+"\nsaldo: "+map.get(codigo).getSaldo()+"\ninteres: "+CuentaCorriente.interesFijo*10;
          if(map.get(codigo).getClass()== CuentaAhorro.class)
            {
                CuentaAhorro a = (CuentaAhorro)map.get(codigo);
               
                mensaje ="id Cliente: "+map.get(codigo).getTitular().getIdCliente()+"\nNombre: "+map.get(codigo).getTitular().getNombre()+
                    "\ndireccion: "+map.get(codigo).getTitular().getDireccion()+"\ntelefono: "+map.get(codigo).getTitular().getTelefono()+
                    "\nnumero de cuenta: "+map.get(codigo).getNumeroDeCuenta()+"\nsaldo: "+map.get(codigo).getSaldo()+"\ninteres: "+a.getInteresVariable()+"\n Saldo Minimo: "+a.getSaldoMinimo();
            }
          return mensaje;
        
    }

    // METODO PARA EDITAR LA COMISION DE CUENTA DE AHORRO.
    
    public String editarComision(int codigo,double interes)
    {
         String mensaje2 = "error";
        
        if (map.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES", "ERROR", JOptionPane.WARNING_MESSAGE);
           
        } else if (map.values().contains(map.get(codigo)) && map.get(codigo).getClass()== CuentaAhorro.class ) 
            {
                CuentaAhorro a = (CuentaAhorro)map.get(codigo);
                a.setInteresVariable(interes);
                map.put(codigo, a);
                mensaje2=mostar(codigo);
                        
            }
        
       
        
        return mensaje2;
        
    }
 

   
    
}
