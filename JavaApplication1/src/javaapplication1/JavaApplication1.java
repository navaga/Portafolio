/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    static int nl=50;
    public static void main(String[] args) {
        // TODO code application logic here
      // TODO code application logic here
      Scanner in = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      
      
System.out.println("introduzca su nombre:");
String name = in.next();
System.out.println("introduzca su edad (en numero):");
int answer = in.nextInt();
System.out.println(name + ", tu edad es: " + answer);

      int cuadradol=3,
      lado=5,
      base=10,
      altura=5,
      radio=12;
      final double pi=3.14;
      
      int cuadrado=lado*lado;
      System.out.println("area cuadrado "+cuadrado);
      double circulo = Math.PI * Math.pow(radio,2);
      System.out.println("area circulo  "+String.format("%.2f",+circulo));
      
      int velocidad=9,
              distancia=25;
              double tiempo=0;
      tiempo = (double)distancia/velocidad;
      sb.append("hola").append("el corredor hizo una distancia de ").append(distancia).append(" kilometros a uno velocidad de ");
      System.out.println(sb.toString());
      int n3=30,suma =nl+n3;
      System.out.println("la suma es: "+suma);
      
      int n1=2, n2=0;
      for(int i=0;i<5;i++)
      {
          switch (i) {
              case 0:
                  n2= n1 * n1;
                  break;
              case 1:
                  n2 = n2 -n1;
                  break;
              case 2:
                  n2 = n2 + n1 + 15;
                  break;
              case 3:
                  n2 = n2/n1;
                  break;
              case 4:
                  n2= n2%n1;
                  break;
              default:
                  
                  break;
          }
        
        System.out.println ("El resultado de n2 es: " + n2);
      }
      
      
              
        

        
    }
    
    
}
