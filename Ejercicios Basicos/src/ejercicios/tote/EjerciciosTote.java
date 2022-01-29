  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tote;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class EjerciciosTote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for(int i=0;i<6;i++)
        {
            String b="*";
            /*
            int contador=0;
            do
            {
            System.out.print(a);
            contador++;
            }while(contador < i);
            System.out.print("\n");
            */
            for(int a=0;a<=i;a++)
           {
               System.out.print(b);
           }
            System.out.print("\n");
           
            
        }
        System.out.print("\n");
         for(int i=6;i>0;i--)
        {
            String b="*";
           
            for(int a=0;a<i;a++)
           {
               System.out.print(b);
           }
            System.out.print("\n");
           
            
        }
          System.out.print("\n");
          for(int i=7;i>0;i--)
          {
              
              for(int b=0;b<i;b++)
              {
                  System.out.print(" ");
                  
                  
              }
                 for( int c=7;c>=i;c--)
                  {
                      System.out.print("*");
                  }
            System.out.print("\n");   
              
          
          
          }
          System.out.print("\n");
          int aux=1;
          for(int i=0;i<7;i++)
          {
              
              for(int a=6;a>i;a--)
              {
                  System.out.print(" ");
              }
              for(int b=aux;b>i;b--)
              {
                  System.out.print("*");
                 
              }
               aux+=3;
              //System.out.print("*");
              System.out.print("\n");
          }
          System.out.print("\n");
          
          int aux2=13;
          int aux3=0;
          for(int i=0;i<7;i++)
          {
              
              for(int a=aux3;a>i;a--)
              {
                  System.out.print(" ");
              }
              for(int b=aux2;b>0;b--)
              {
                  System.out.print("*");
                 
              }
              aux3+=2;
               aux2-=2;
              //System.out.print("*");
              System.out.print("\n");
          }
          
          System.out.print("\n");
          
          // piramide 7 altura
          
          for(int i=1;i<8;i++)
          {
              
              for(int a=7;a>i;a--)
              {
                  System.out.print(" ");
              }
              for(int b=1;b<=(i*2)-1;b++)
              {
                  System.out.print("*");
                 
              }
              
              //System.out.print("*");
              System.out.print("\n");
          }
          
           System.out.print("\n");
          
          
          
         /* Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        
         
        
        
        // TODO code application logic here
    }
    */
      //piramide iversa   
          for(int altura=1;altura<8;altura++)
          {
              //espacios
              for(int a=1;a!=altura;a++)
              {
                  System.out.print(" ");
              }
              //asteriscos
              for(int b=13;b>=(altura*2)-1;b--)
              {
                  System.out.print("*");
                 
              }
             
              //System.out.print("*");
              System.out.print("\n");
          }
          int r=10;
          int w=0;
          for(int i=0;i<=r;i++)
          {
              for(int b=0;b<=r;b++)
              {
                  if(i==0 || i==r|| b==0 || b==r )
                  {System.out.print("*");}
                  else{System.out.print(w+=1);
                  if(w==9){w=0;}
                  }
                  
              }
              System.out.println("");
              
          }
    
    }
}
