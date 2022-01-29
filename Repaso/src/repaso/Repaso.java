/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author navag
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        System.out.print("ENERO\t\tFEBRERO\t\tMARZO\t\tABRIL\t\tMAYO\t\tJUNIO\t\tJULIO\t\tAGOSTO\t\tSEPTIEMBRE\tOCTUBRE\t\tNOVIEMBRE\tDICIEMBRE"+"\n");
        for(int i=1;i<=31;i++)
        {
            for(int z=1;z <=12;z++)
            {
              if(i<=28)
              {System.out.print(i+"\t\t");}
              else if(i>28)
              {
                  if(z==2){System.out.print("\t\t");}
                  else if((z==4 ||z==6 || z==9 || z==11) && i>30){System.out.print("\t\t");}
                  else
                  System.out.print(i+"\t\t");
              }
                
            }
            System.out.println("");
        }
    }
    
}
