package hilospruebas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author navag
 */
public class PrimerosHilos {

    public static void main(String[] args) throws IOException {
        PrimerosHilos p1 = new PrimerosHilos();
        p1.iniciar();

    }

    public void iniciar() throws IOException {

        RandomAccessFile stream = new RandomAccessFile("DATOS.txt", "rw");

        //FileChannel channel = stream.getChannel();
        //FileLock lock=null;
        //lock =channel.tryLock();
        stream.skipBytes((int) stream.length());
        stream.writeBytes("******************************************\n" +
"\n" +
"* PSP - Tarea Individual 2            *\n" +
"\n" +
"******************************************\n" +
"\n" +
"* Ignacio Valero Garcia *\n" +
"\n" +
"******************************************\n" +
"\n" +
"* 14630673M                          *\n" +
"\n" +
"******************************************\n" +
"\n" +
"Resultado de las operaciones: \n");
        //lock.release();
        //stream.close ();
        //channel.close();

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
        uno.start();
        dos.start();
        tres.start();
        cuatro.start();
        cinco.start();
        seis.start();
        siete.start();
        ocho.start();
        nueve.start();
        diez.start();

    }

    private class hilo1 extends Thread {

        multiplicar multi;
        int numero = 0;

        public hilo1(int prioridad, int numero) {
            
            super("tabla numero "+numero);
            this.numero = numero;
            this.setPriority(prioridad);
           

        }


        @Override
        public void run() {
           
           multi = new multiplicar(numero);

            synchronized (this) {
                try {

                    RandomAccessFile stream = new RandomAccessFile("DATOS.txt", "rw");

                    stream.skipBytes((int) stream.length());

                    stream.writeBytes(multi.getCadena().toString());
                    System.out.println(this.getName().toString() + " Terminado");

                    stream.writeBytes(System.lineSeparator());

                    stream.close();

                } catch (Exception e) {
                    System.out.println("En espera el hilo: " + this.getName().toString());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PrimerosHilos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
       
                
                
            
             
        }
       
    }
    public class multiplicar {

        public String cadena = "";
        public int tabla;

        public multiplicar(int tabla) {
            this.tabla = tabla;
            multiplicarTabla(tabla);

        }

        public String getCadena() {
            return cadena;
        }

        public void multiplicarTabla(int numero) {
            cadena += "Tabla del " + numero + System.lineSeparator();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", numero, i,
                        numero * i);
                cadena += numero + " X " + i + " =" + numero * i + System.lineSeparator();

            }
            System.out.println("Tabla: " + tabla + " guardada en String");

        }
    }
}
//  private class hilo2 implements Runnable
//  {
//      int contador =0;
//      Thread hilo2 = new Thread(this,"hilo2");
//      public hilo2(int contador)
//      {
//          this.contador = contador;
//          hilo2.start();
//      }
//        @Override
//        public void run() {
//            
//           for(int i =0;i<10;i++)
//         {
//             System.out.println("hilo2 numero: "+i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException ex) {
//                 Logger.getLogger(PrimerosHilos.class.getName()).log(Level.SEVERE, null, ex);
//             }
//         }
//        }
//      
//  }

