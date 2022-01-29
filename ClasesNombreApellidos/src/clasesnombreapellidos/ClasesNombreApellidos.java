/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesnombreapellidos;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class ClasesNombreApellidos {
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NombreApellidos persona= new NombreApellidos();
        NombreApellidos persona2 = new NombreApellidos(sc.next(),sc.nextInt());
        System.out.println("edad: "+persona2.GetEdad()+" Nombre: "+persona2.GetNombre());
        NombreApellidos.Numeroalu();
        
        
        
        persona.SetNombre("antonio");
        persona.SetEdad(100);
         
        System.out.println(persona.GetEdad());
        System.out.println(persona.GetNombre());
        NombreApellidos.Numeroalu();
        
        
        
       
    }
    
}
