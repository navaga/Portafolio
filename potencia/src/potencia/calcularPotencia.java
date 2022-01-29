/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author navag
 */
public class calcularPotencia {

    public static void main(String[] args) {
        pruebasale pa = new pruebasale();
        int[] prueba = {3,2,1};
        System.out.println(pruebasale.getMax(prueba));
        
        

       double base = 0, exponente = 0, resultado;
       try{ // comienzo del bloque try que captura cualquier error (excepcion)
           
        base = Double.parseDouble(JOptionPane.showInputDialog("introduce numero base")); // introducimos el numero base y con la funcion parse double lo convertimos en double.
        System.out.println("base: "+base);
        exponente = Double.parseDouble(JOptionPane.showInputDialog("introduce numero exponente"));// introducimos el exponente y con la funcion parse double lo convertimos en double.
        System.out.println("exponente: "+exponente);
      
        if (exponente == 0 || base == 1) { // primera condicion: Si el exponente es igual a 0 o base igual a 1 entra en el bloque
            resultado = 1;
            System.out.println("El resultado es: " + resultado); // si se da alguna de las 2 condiciones el resultado es 1
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        } else if (exponente > 0 && base > 1) { //si el exponente es mayor de 0 y la base mayor de 1 entra en el bloque
            resultado = 1;

            for (int i = 0; i < exponente; i++) { // bluque for: mientras que la variable i sea menor que el exponente entrara en el bucle
                System.out.print(resultado + " * " + base + " = ");
                resultado *= base;
                System.out.println(resultado);
                

            }
            JOptionPane.showMessageDialog(null,"El resultado es: "+String.format("%.2f", resultado));
        }else{
            
            if(base<1){ System.out.println("La base es menor de 1");JOptionPane.showMessageDialog(null,"base menor de 1");}
            else if(exponente<0){System.out.println("El exponente es menor de 0");JOptionPane.showMessageDialog(null,"exponente menor de 0");}
            }
       
      }
       catch(NumberFormatException ne){ //si introducimos un valor que no sea numerico entrara en esta excepcion
            
                System.out.println("debes intruducir un numero");
                JOptionPane.showMessageDialog(null,"Debes introducir un numero");
                
       } 
       catch(Exception ex) //Si ocurre cualquier excepcion entrara en este bloque
       {
           System.out.println("ha ocurrido otro error");
           JOptionPane.showMessageDialog(null,"ha ocurrido otro error");
           
       }
      
        

    }

}
