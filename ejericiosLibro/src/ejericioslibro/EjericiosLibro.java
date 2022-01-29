/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericioslibro;
import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class EjericiosLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"ordenar de menor a mayor");
        int totalNum = Integer.parseInt(JOptionPane.showInputDialog("Cuandos numeros vas a introducir?"));
        int[] numeroMenor = new int[totalNum];
        int aux;
        
        for(int i=0;i<totalNum;i++)
        {
            numeroMenor[i] = Integer.parseInt(JOptionPane.showInputDialog("intrduce numero "+(i+1)));
            
        }
        for(int i=0;i<totalNum;i++)
        {
            
            for(int x=0;x<totalNum;x++)
            {
                if(numeroMenor[i]<numeroMenor[x])
                {
                    aux= numeroMenor[i];
                    numeroMenor[i] = numeroMenor[x];
                    numeroMenor[x]=aux;
                 }
            }
            
        }
         for(int i=0;i<numeroMenor.length;i++)
        {
            System.out.println(numeroMenor[i]);
            
        }
         JOptionPane.showMessageDialog(null,"cual es el menor?");
         int totalNum2 = Integer.parseInt(JOptionPane.showInputDialog("Cuandos numeros vas a introducir?"));
         int aux2 = Integer.parseInt(JOptionPane.showInputDialog("introduce numero 1: "));
         int aux3;
         for(int i=0;i<totalNum2;i++)
         {
            aux3 = Integer.parseInt(JOptionPane.showInputDialog("introduce numero "+(i+1)+":"));
            if(aux3<aux2)
            {
                aux2=aux3;
            }
             
             
         }
         JOptionPane.showMessageDialog(null,"El numero menor es: "+aux2);
         System.out.println("El numero menor es: "+aux2);
       
    }
    
}
