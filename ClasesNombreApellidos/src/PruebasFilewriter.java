/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navag
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebasFilewriter {

    public static void main(String[] args) throws IOException {
        escribir();
        leer();

    }

    public static void escribir() throws FileNotFoundException, IOException {

        File fl = new File("prueba.txt");
        FileOutputStream fo = new FileOutputStream(fl, true);
        DataOutputStream dop = new DataOutputStream(fo);
        String cadena = "nueva cadena el morten yeah 1235";
        int i = 0;
        while (i < 10) {
            dop.writeUTF(cadena+"\n");
            cadena += "0";
            i++;

        }
        dop.close();

    }

    public static void leer() throws FileNotFoundException, IOException {

        File fl = new File("prueba.txt");
        FileInputStream fo = new FileInputStream(fl);
        DataInputStream dop = new DataInputStream(fo);
        String cadena = "";
        try{

            while (true) {
                System.out.println(cadena);
                cadena = dop.readUTF();
            }
        } catch (Exception ex) {
            dop.close();
        }

    }
}
//FileWriter fw = new FileWriter(fl,true);
//FileWriter fw2 = new FileWriter(f2,true);
        //FileReader fr = new FileReader(fl);
