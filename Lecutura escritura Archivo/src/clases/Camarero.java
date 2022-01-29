
package clases;

import javax.swing.JOptionPane;

public class Camarero extends Persona {
    
    double sueldo;
    private static int contador=0; // atributo estatico que contabiliza el numero de camareros
    
    public Camarero(){ contador++;}
    
    public Camarero(String nombre,int edad,double sueldo)
    {   
        super(nombre,edad);
        this.sueldo=sueldo;
        contador++;
    }
    public double getSueldo()
    {
        return this.sueldo;
    }
    public void setSueldo(double sueldo)
    {
        
        this.sueldo=sueldo;
        
    }
    
    public static void Contador()
    {
        System.out.println("hemos creado "+contador+" Camareros");
        JOptionPane.showMessageDialog(null,"hemos creado "+contador+" Camareros");
        
    }

    public static void setContador(int contador) {
        Camarero.contador = contador;
    }
    @Override
     public String PersonaHumanas()
    {
        return "TuMae";
    } 
}
