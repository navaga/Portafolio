/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.tarea1.padre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navag
 */
public class PspTarea1Padre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Process hijo = new ProcessBuilder("java", "-jar", "Psp_tarea1_hijo.jar").start(); // iniciliza el .jar
            BufferedReader entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));  // Lo que recibe del hijo
            PrintStream salidaHijo = new PrintStream(hijo.getOutputStream()); // lo que se le envia al hijo
            String linea;
            int i = 1;
            while (i <= 10) {

                salidaHijo.println(i);
                salidaHijo.flush();
                System.out.println("Tabla del: " + i);
                for (int x = 1; x <= 11; x++) {
                    linea = entradaHijo.readLine(); // RECIBE LA TABLA
                    System.out.println(linea);      // LA MUESTRA POR PANTALLA
                }
                i++;
            }
            hijo.destroy();
            
            String[] texto= {"PSP - Tarea Individual 1","Ignacio Valero Garcia","14630673M"};
            
            for(int x=0;x<3;x++)
            {
                System.out.println("*************************************");
                for(int z =0;z<1;z++)
                {
                    System.out.println("* "+texto[x]+" *");
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PspTarea1Padre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
