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
public class MisPruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String nombreInverso = "";
        int numeroCara;

        System.out.print("Introduce Nombre a invertir: ");
        nombre = sc.nextLine();
        numeroCara = nombre.length();
        /*int numeroCara2 = numeroCara;
        
        for (int i = 0; i < numeroCara; i++) {
            nombreInverso += nombre.charAt(numeroCara2 - 1);   // tambien funciona otra manera
            System.out.println(nombreInverso);
            numeroCara2--;
            System.out.println("valor: " + numeroCara);

        }
        System.out.println(nombreInverso);*/

        while (numeroCara != 0) {

            nombreInverso += nombre.substring(numeroCara - 1, numeroCara);
            numeroCara--;

        }
        System.out.println(nombreInverso);

        int i = 1, j = 99;
        for (i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else{System.out.print(i+","+j);}
            //else{System.out.print(j); i=11;}
            j--;
        }

    }

}
