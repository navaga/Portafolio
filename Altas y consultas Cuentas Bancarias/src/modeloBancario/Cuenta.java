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
public abstract class Cuenta {
    
    // ATRIBUTOS DE LA CLASE
    protected int numeroDeCuenta;
    protected double saldo;
    protected Cliente titular;
    public Cuenta()
    {
        numeroDeCuenta =0;
        saldo =0;
        titular = null;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + ", titular=" + titular + '}';
    }
    //CONSTRUCTOR CON PARAMETROS 
    public Cuenta(int numeroDeCuenta, double saldo,Cliente titular)
    {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
        
    }
    // GETTER Y SETTER
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
        
    }
    // METODO DE INGRESAR
    public void ingresar(int ingreso)
    {
        if(ingreso>0)
        {
        this.saldo +=ingreso;
        }else
            JOptionPane.showMessageDialog(null, "DINERO POSITVO", "ERROR", JOptionPane.WARNING_MESSAGE);  
        
    }
    
// METODOS ABSTRACTOS PARA IMPLEMENTAR EN CLASES HIJAS
    abstract public double retirar(double dinero);
    abstract public void actualizarSaldo();
    
}
