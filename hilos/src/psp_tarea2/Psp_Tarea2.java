/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_tarea2;

/**
 *
 * Esta aplicacion pretende generar las tablas de multiplicar del 1 al 10 y
 * guardarlas en un archivo de texto
 *
 * @author navag
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navag
 */
public class Psp_Tarea2 {

    public static void main(String[] args) throws IOException {
        Psp_Tarea2 p1 = new Psp_Tarea2();
        p1.iniciar();

    }

    /**
     * 
     * Metodo para inciciar los hilos
     * y poner la cabecera del documento txt
     */
    public void iniciar() {

        RandomAccessFile stream;
        try {
            stream = new RandomAccessFile("DATOS1.txt", "rw");
            stream.skipBytes((int) stream.length());
            stream.writeBytes("******************************************\n"
                    + "\n"
                    + "* PSP - Tarea Individual 2            *\n"
                    + "\n"
                    + "******************************************\n"
                    + "\n"
                    + "* Ignacio Valero Garcia *\n"
                    + "\n"
                    + "******************************************\n"
                    + "\n"
                    + "* 14630673M                          *\n"
                    + "\n"
                    + "******************************************\n"
                    + "\n"
                    + "Resultado de las operaciones: \n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Psp_Tarea2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Psp_Tarea2.class.getName()).log(Level.SEVERE, null, ex);
        }

        hilo1 uno = new hilo1(Thread.MIN_PRIORITY, 1);
        hilo1 dos = new hilo1(Thread.MIN_PRIORITY, 2);
        hilo1 tres = new hilo1(Thread.NORM_PRIORITY, 3);
        hilo1 cuatro = new hilo1(Thread.NORM_PRIORITY, 4);
        hilo1 cinco = new hilo1(Thread.NORM_PRIORITY, 5);
        hilo1 seis = new hilo1(Thread.NORM_PRIORITY, 6);
        hilo1 siete = new hilo1(Thread.MAX_PRIORITY, 7);
        hilo1 ocho = new hilo1(Thread.MAX_PRIORITY, 8);
        hilo1 nueve = new hilo1(Thread.MAX_PRIORITY, 9);
        hilo1 diez = new hilo1(Thread.MIN_PRIORITY, 10);

    }

    public class hilo1 implements Runnable {

        Thread controladorHilo;
        multiplicar multi;
        int numero = 0;
        guardar save;
        
        /**
         * 
         * @param prioridad parametro de tipo entero
         * @param numero  parametro de tipo entero
         */

        public hilo1(int prioridad, int numero) {
            //this.multi = multi;
            this.numero = numero;
            controladorHilo = new Thread(this, "Hilo tabla: " + numero);
            controladorHilo.setPriority(prioridad);
            controladorHilo.start();

        }

        @Override
        public void run() {
            //enviamos a la clase guardar la tabla de multiplicar y el nombre del hilo
            save = new guardar(multi = new multiplicar(numero), controladorHilo.getName().toString());

        }

    }

    public class multiplicar {

        public String cadena = "";
        public int tabla;

        /**
         * 
         * @param tabla parametro de tipo entero
         */
        public multiplicar(int tabla) {
            this.tabla = tabla;
            multiplicarTabla(tabla);

        }
        /**
         * 
         * @return  devuelve un parametro de tipo string con la tabla de multiplicar generada
         */
        public String getCadena() {
            return cadena;
        }
        
        /**
         * 
         * @param numero parametro de tipo entero
         * el metodo genera una tabla de multiplicar
         */
        public synchronized void multiplicarTabla(int numero) {
            cadena += "TABLA DEL: " + numero + System.lineSeparator();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", numero, i,
                        numero * i);
                cadena += numero + " X " + i + " =" + numero * i + System.lineSeparator();

            }
            System.out.println("Tabla: " + tabla + " guardada en String");

        }
    }

    public class guardar {

        /**
         * 
         * @param multi parametro de tipo multiplicar
         * @param controladorHilo  parametro de tipo string
         */
        String controladorHilo;
        multiplicar multi;
        public guardar(multiplicar multi, String controladorHilo) {
            this.multi = multi;
            this.controladorHilo = controladorHilo;
            guardarArchivo(this.multi, this.controladorHilo);
        }

        /**
         * 
         * @param multi parametro de tipo multiplicar
         * @param controladorHilo parametro de tipo String
         * este metodo guarda las tablas de multiplicar en un archivo txt llamado DATOS1.txt
         */
        public synchronized void guardarArchivo(multiplicar multi, String controladorHilo) {

            try {

                RandomAccessFile stream = new RandomAccessFile("DATOS1.txt", "rw");

                stream.skipBytes((int) stream.length());

                stream.writeBytes(multi.getCadena().toString());

                System.out.println(controladorHilo + " Terminado");
                stream.writeBytes(System.lineSeparator());

                stream.close();

            } catch (Exception e) {
                System.out.println("error en el hilo: " + controladorHilo);

            }

        }

    }

}
