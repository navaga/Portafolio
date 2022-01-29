/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilospruebas;

import java.util.Random;

/**
 *
 * @author navag
 */
public class Psp_u02_s01_uso_de_objetos {
 Random randomGenerator = new Random();

 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 Psp_u02_s01_uso_de_objetos programa =
 new Psp_u02_s01_uso_de_objetos ();
 programa.ejecutarPrograma();
 }

 public void ejecutarPrograma() {
 Contador contador = new Contador();
 Contador contador2 = new Contador();
 new Hilo(contador2);
 try {
 for (int i = 0; i < 10; i++) {
 contador.setContador(contador.getContador()+1);
 System.out.println("Padre: Contador = " +
 contador.getContador());
 Thread.sleep(randomGenerator.nextInt(500));
 }
 } catch (InterruptedException e) {
 System.out.println("Ejecución de padre interrumpida.");
 }
 System.out.println("Saliendo del padre.");

 }

 public class Contador {
 private int contador = 0;

 public void setContador(int contador) {
 this.contador = contador;
 }

 public int getContador() {
 return contador;
 }
 }

 public class Hilo implements Runnable{
 Thread controladorHilo;
 Contador contador;

 Hilo(Contador contador) {
 controladorHilo = new Thread(this, "Hilo hijo");
 this.contador = contador;
 System.out.println("Hilo hijo" + controladorHilo);
 controladorHilo.start();
 }

 public void run() {
 try {
 for (int i = 0; i < 10; i++) {
 contador.setContador(contador.getContador() + 1);
 System.out.println("Hijo: Contador = " +
 contador.getContador());
 Thread.sleep(randomGenerator.nextInt(500));
 }
 } catch (InterruptedException e) {
 System.out.println("Ejecución de hilo interrumpida.");
 }
 System.out.println("Saliendo del hilo hijo.");
 }
 }

} 