/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tote;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class Ordenar {

    public static void main(String[] args) {
    Random r = new Random();
    
    int a = r.nextInt(27)+8;  // de 8 a 34 numeros aleatorios
   System.out.println(a+",");
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros vas a ordenar?: ");
        int cantidad = sc.nextInt();
        int numeros[] = new int[cantidad];
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println("Escribar su numero: ");
            numeros[i] = sc.nextInt();

        }

        /*numeros[0] = 560;
        numeros[1] = 1;
        numeros[2] = 378;
        numeros[3] = 444;
        numeros[4] = 61;
         */
        int aux = 0;

        for (int c = numeros.length-1; c > 0; c--) {

            for (int d = numeros.length - 1; d > 0; d--) {

                if (numeros[d] < numeros[d - 1]) {

                    aux = numeros[d - 1];
                    numeros[d - 1] = numeros[d];
                    numeros[d] = aux;
                    
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }

    }

}
