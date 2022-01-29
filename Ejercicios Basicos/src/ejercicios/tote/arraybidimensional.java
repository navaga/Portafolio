/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tote;
import java.util.Arrays;

/**
 *
 * @author navag
 */
public class arraybidimensional {
    
    public static void main(String[] args)
    {
        
        int[][] arraydos =  new int[4][5];
       
        
        
        for(int i=0;i<arraydos.length;i++)
        {
          for(int j=0;j<arraydos[i].length;j++)
          {
              arraydos[i][j]=(int)(Math.random()*100);
              
          }
        }
        
      // Arrays.sort(arraydos);

         for(int i=0;i<arraydos.length;i++)
        {
            Arrays.sort(arraydos[i]);
         
        }
          for(int i=0;i<arraydos.length;i++)
        {
          for(int j=0;j<arraydos[i].length;j++)
          {
              
              System.out.print(arraydos[i][j]+",");
             
              
          }
        }
        
       
        
    }
    
}
