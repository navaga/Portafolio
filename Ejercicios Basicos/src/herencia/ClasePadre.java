/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author navag
 */
public class ClasePadre {
    
    protected int valorUno,valorDos,resultado;
    protected static int contador;
    Scanner sc =  new Scanner(System.in);
    public void IntroduceDatos()
    {
        System.out.println("introduce valor uno: ");
        valorUno = sc.nextInt();
        System.out.println("introduce valor dos: ");
        valorDos = sc.nextInt();
    }
    public void Resultado()
    {
        System.out.println(resultado);
    }
    
    
}
