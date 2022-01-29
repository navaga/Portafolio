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
public class CuentaAhorro extends Cuenta {
    

   //ATRIBUTOS DE LA CLASE
    protected double interesVariable;
    protected double saldoMinimo;
    //CONSTRUCTOR
    public CuentaAhorro(int numeroDeCuenta, double saldo,Cliente titular,double interesVariable,double saldoMinimo )
    {
        super(numeroDeCuenta,saldo,titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }
    
    // SI EL SALDO MENOS EL DINERO QUE SE DESEA RETIRAR ES MENOR QUE EL SALDO MINIMO, NO SE RETIRA EL DINERO
    @Override
   public double retirar(double dinero)
   {
       if((saldo - dinero) < saldoMinimo)
       {
           JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE, SU MINIMO DEBE SER: "+saldoMinimo, "ERROR", JOptionPane.WARNING_MESSAGE);
       }
       else if (dinero>0)
       {
           saldo -=dinero;
           
           JOptionPane.showMessageDialog(null, "SALDO RETIRADO CON EXITO");
       }
       else
       {
           JOptionPane.showMessageDialog(null, "LA RETIRADA DEBE SER POSITVA", "ERROR", JOptionPane.WARNING_MESSAGE);
       }
       return saldo;
   }
     @Override
    public void actualizarSaldo() 
    {
        if(saldo>0)
        {
        saldo += saldo*(interesVariable/100);   
        }
    }

    public CuentaAhorro() {
    }

    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

  

   
   
    
}
