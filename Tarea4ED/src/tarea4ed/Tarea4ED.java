/**
 * Esta clase sirve hacer descuentos a productos
 * <ul>
 * <li>aplicarDescuento</li>
 * <li>enviarProductoCliente</li>
 * </ul>
 * @author navag
 */
package tarea4ed;

public class Tarea4ED {      

 /**
 * Este método realiza un descuento a un producto
 * @param precioProducto primero operando double
 * @param numProductos segundo operando entero
 */ 
    public void aplicarDescuento(double precioProducto, int numProductos){
        double total;        
        if(numProductos>3)            
            precioProducto-=5;       
        if (numProductos!=0){           
            total = precioProducto*0.8;           
            enviarProductoCliente();       
        }else {           
            total = precioProducto*0.95;           
            enviarProductoCliente();       
        }   

    }       

/** 
  * Este método muestra por consola un mensaje de enviado
 * @deprecated
 */
    public void enviarProductoCliente(){       
        System.out.println("Enviado");   
    }
}
