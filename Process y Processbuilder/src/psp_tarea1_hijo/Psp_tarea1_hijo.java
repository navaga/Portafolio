/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_tarea1_hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navag
 */
public class Psp_tarea1_hijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // OBJETO PARA RECIBIR NUMERO.
        try {

            String cadena = "";
            String enviar = "";
            for (int i = 1; i <= 10; i++) {
                cadena = reader.readLine(); // RECIBE EL NUMERO DE LA TABLA
                enviar = "";
                for (int x = 1; x <= 10; x++) {

                    enviar += Integer.parseInt(cadena) + " x " + x + " = " + Integer.parseInt(cadena) * x + "\n";
                    

                }

                System.out.println(enviar);

            }

        } catch (IOException ex) {
            Logger.getLogger(Psp_tarea1_hijo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
