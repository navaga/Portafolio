/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tote;

/**
 *
 * @author navag
 */
public class Suma {
    private int valorUno,valorDos,Resultado;
    
    public Suma(int valorUno, int valorDos)
    {
        
        this.valorUno=valorUno;
        this.valorDos=valorDos;
        
    }
    
    public void SetUno(int valorUno)
    {
        this.valorUno=valorUno;
    }
    public void SetDos(int valorDos)
    {
        this.valorDos=valorDos;
    }
    
    public int GetUno()
    {
        return this.valorUno;
    }
    public int GetDos()
    {
        return this.valorDos;
    }
    
    public void Resuelve()
    {
        Resultado=valorDos+valorUno;
    }
    public void imprime()
    {
        Resuelve();
        System.out.println("El resultado de la suma es: "+Resultado);
    
    }
    
}
