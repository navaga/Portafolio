/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.dos;

/**
 *
 * @author navag
 */
public class meses {
    
    public static void main(String[] args) {
        System.out.print("ENERO\t\tFEBRERO\t\tMARZO\t\tABRIL\t\tMAYO\t\tJUNIO\t\tJULIO\t\tAGOSTO\t\tSEPTIEMBRE\tOCTUBRE\t\tNOVIEMBRE\tDICIEMBRE"+"\n");
        for(int i=1;i<=30;i++)
        {
            for(int z=1;z <=12;z++)
            {
              switch(i)
              {
                  case 28: 
                  default:System.out.print(i+"\t\t");
              }
                
            }
            System.out.println("");
        }
    }
    
}
