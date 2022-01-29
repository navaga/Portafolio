/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesnombreapellidos;

/**
 *
 * @author navag
 */
public class NombreApellidos {
    
    private String nombre="";
    private int edad=0;
    private static int numeroalu=0;
    
    public NombreApellidos(){};
    public NombreApellidos(String nombre,int edad)
    {
      if(edad<=100 && edad>=0)
      {
        this.edad=edad;
        this.nombre=nombre;
        numeroalu++;
      }else{this.edad=0;this.nombre="Persona erronea";}
        
    }
    
    public void SetNombre(String nombre)
    {
        this.nombre=nombre;
    
    }
    public void SetEdad(int edad)
    {
        
         if(edad<=100 && edad>=0)
      {
        this.edad=edad;
        numeroalu++;
      }else{this.edad=0;this.nombre="Persona erronea";}
    }
    public String GetNombre()
    {
        return this.nombre;
    }
    public int GetEdad()
    {
        return this.edad;
    }
    
    public static void ayuda()
    {
        System.out.println("Esta clase permite crear personas con un nombre y una edad");
    }
    public static void Numeroalu()
    {
        System.out.println("numero total de alumnos añadidos: "+numeroalu);
        
        
    }
    
    
        
    
}