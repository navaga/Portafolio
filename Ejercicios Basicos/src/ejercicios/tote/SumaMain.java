/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tote;

import java.util.Scanner;

/**
 *
 * @author navag
 */
public class SumaMain {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un el primer numero valor:");
        int valorUno = sc.nextInt();
        System.out.println("dame un el segundo numero valor:");
        int valorDos = sc.nextInt();
        Suma suma = new Suma(valorUno,valorDos);
        suma.imprime();
        
    
    }
    
}
