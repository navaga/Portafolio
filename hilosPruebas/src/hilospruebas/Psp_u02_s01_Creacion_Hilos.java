/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilospruebas;

/**
 *
 * @author navag
 */
public class Psp_u02_s01_Creacion_Hilos {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 Psp_u02_s01_Creacion_Hilos aplicacion =
 new Psp_u02_s01_Creacion_Hilos();
 aplicacion.iniciar();
 }

 /**
 * Método de ejecución de la aplicación fuera del ámbito
 * static
 */
 public void iniciar() {
 Ascendente hilo1 = new Ascendente(10000000);
 Descendente hilo2 = new Descendente(10000000);
 }

 /**
 * Clase encargada de realizar un procesamiento ascendente de
 * un bucle. Extiende la clase Thread.
 */
 private class Ascendente extends Thread {
 int contador;

 /**
 * Constructor de la clase
 * @param contador Contador hasta donde tiene que
 * realizar el bucle
 */
 public Ascendente(int contador) {
 this.contador = contador;
 this.start();
 }

 /**
 * Método de ejecución principal. Realiza un bucle
 * ascendente usando como límite superior la propiedad
 * contador
 */
 public void run() {
 int porcentajeActual = 0;

 for (int i = 0; i < contador; i ++) {

 if (i * 100 / contador > porcentajeActual) {
 System.out.printf(
 "Ascendente: Procesado un %d%%%n",
 porcentajeActual);
 porcentajeActual += 10;
 }
 }
 System.out.printf(
 "Ascendente: Procesado el 100%%%n");
 }
 }

 /**
 * Clase que implementa un procesamiento descendente.
 * Implementa la interfaz Runnable
 */
 private class Descendente implements Runnable {
 int contador;

 /**
 * Constructor de la clase
 * @param contador Número de veces que procesará el bucle
 */
 public Descendente(int contador) {
 Thread hilo = new Thread(this, "Descendente");
 this.contador = contador;
 hilo.start();
 }

 /**
 * Método de ejecución principal de la clase. Realiza un
 * bucle descendente desde la propiedad contador hasta 0
 */
 public void run() {
 int porcentajeActual = 0;

 for (int i = contador; i > 0; i --) {
 if ((contador - i) * 100 / contador >
 porcentajeActual) {
 System.out.printf(
 "Descendente: Procesado un %d%%%n",
 porcentajeActual);
 porcentajeActual += 10;
 }
 }
 System.out.printf(
 "Descendente: Procesado el 100%%%n");
 }
 }
}