/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesignaciovalerogarcia;
import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class NombreApellidos {
    
    private String nombre="";
    private int edad=0;
    int prueba=0;
    
    public NombreApellidos(){
        
    this.nombre="";
    this.edad=0;
    
    };
    public NombreApellidos(String nombre,int edad)
    {
        try{
        if(edad<=100 && edad>=0) //edad tiene que ser igual o mayor de 0 y menor o igual de 100
        {
        
        this.edad=edad;
        this.nombre=nombre;
        }else{this.nombre="Persona erronea";this.edad=0;}// la edad ya esta inicializada a 0
        }catch(Exception exception){System.out.print("error mi amigo");this.edad=0;JOptionPane.showMessageDialog(null,"has introducido mal "+exception);}
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
          
        
      }else{this.nombre="Persona erronea";}
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
       // System.out.println("Esta clase permite crear personas con un nombre y una edad");
        JOptionPane.showMessageDialog(null, "Esta clase permite crear personas con un nombre y una edad");
    }
    
}
