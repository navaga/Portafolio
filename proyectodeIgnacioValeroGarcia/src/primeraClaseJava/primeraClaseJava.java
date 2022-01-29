/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraClaseJava;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class primeraClaseJava {
    
    public static void main(String args[])
    {
        /* double expre;
        int a=4,b=6,c=2;
        boolean Booleana=true;
        String nombre = "Ignacio Valero Garcia";
        
        System.out.println("muestro todas las variables: "+a+","+b+","+c+","+Booleana+","+nombre+".");//expre debe estar inicializada para ser mostrada.
        
        expre=a+b/c+1;
        System.out.println(expre);
        expre = a+b/(c+1); //los parentesis dan prioridad.
        System.out.println(expre);
        
        nombre = "14630673m";
        System.out.println(nombre);
        */
        char letras='a';
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
      
        
       
        String morten ="hueles peste";
        System.out.println("caracteres "+morten.charAt(0));
        System.out.println(morten.replace("e", "u"));
        System.out.println(charArray[1]);
        
        
        //char[] morten2 = 1;
        Scanner sc = new Scanner(System.in);
        char[] morten2={'a','b'}; 
        morten2[0]= 'c';
        //morten2[0]='b';
        //morten2[1]='u';
        for(int i=0;i<1;i++)
        {
            System.out.println(morten2[i]);
            
        }
        
      }
    }
        
       
        
        
    
    

