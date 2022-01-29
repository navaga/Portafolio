/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class CuentaCorriente extends Cuenta{
    

    // ATRIBUTO ESTATICO DE INTERES FIJO
    protected static final double interesFijo=0.15;
    
    public CuentaCorriente(int numeroDeCuenta, double saldo,Cliente titular)
    {
     super(numeroDeCuenta,saldo,titular);   
    }

    //IMPLEMENTO METODO RETIRAR
    @Override
    public double retirar(double dinero) {
        
        // SI EL SALDO ES MAYOR O IGUAL AL DINERO QUE SE VA A RETIRAR Y EL DINERO NO ES UN NUMERO NEGATICO, SE RETIRA EL SALDO
        if(saldo>=dinero && dinero>0)
        {
            saldo-=dinero;
            JOptionPane.showMessageDialog(null, "HA RETIRADO: "+dinero+" EUROS");
        }
        else if(dinero > saldo && dinero>0 )
        {
          JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE: "+saldo, "ERROR", JOptionPane.WARNING_MESSAGE);  
        }
         if(dinero <=0)
       {
           JOptionPane.showMessageDialog(null, "LA RETIRADA DEBE SER POSITVA", "ERROR", JOptionPane.WARNING_MESSAGE);
       }
        return saldo;
        
    }
    //IMPLEMENTO METODO ACTUALIZAR SALDO
    @Override
    public void actualizarSaldo() {
        
        if(saldo>0)
        {
        saldo += saldo*interesFijo;
        }
    }
    
}
