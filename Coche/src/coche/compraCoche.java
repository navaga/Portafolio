package coche;

import java.util.Scanner;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class compraCoche {

    private int dinero;
    private final String[] modelos = new String[]{"Seat", "Mercedes", "porche", "Ferrary"};
    private int modeloComprado;
    private final int[] precio = new int[]{10000, 20000, 30000, 40000};
    private int precioCocheComprado;
    private int seleccion = 0;
    private boolean comprobarCompra=false;

    public compraCoche() {
        this.dinero = 0;
        this.modeloComprado = -1;
    }

    public void SetModeloComprado(int modelos) {
        modeloComprado = modelos;
    }

    public void SetPrecioCocheComprado(int precio) {
        precioCocheComprado = precio;
    }

    public void SetDinero(int dinero) {
        this.dinero = dinero;
    }

    public String GetModelos(int i) {
        return modelos[i];
    }

    public int GetDinero() {
        return this.dinero;
    }

    public int GetmodeloComprado() {
        return modeloComprado;
    }

    public int precioCocheComprado() {
        return precioCocheComprado;
    }

    public void NombreCohes() {
        System.out.println("Nombre De los modelos de coches: ");
        for (int i = 0; i < this.modelos.length; i++) {
            System.out.println(this.modelos[i]);
        }

    }

    public void PrecioCoches() {
        System.out.println("Precio Coches: ");
        for (int i = 0; i < this.precio.length; i++) {
            System.out.println((i + 1) + " " + modelos[i] + ":" + precio[i] + "€");
        }
    }

    public void compraCoche(int i) {
        if (i < 4 && i >= 0) {
            if (this.dinero >= precio[i]) {
                this.modeloComprado = i;
                dinero -= precio[i];
                System.out.println("Has comprado el coche: " + this.modelos[modeloComprado]);
                System.out.println("Te ha sobrado: " + this.dinero);
                comprobarCompra = true;
            } else {
                System.out.println("no tienes dinero bro");
                ventaCoche();
            }
        } else {
            System.out.println("Ese Coche no Existe");
            ventaCoche();
        }
    }

    public void ventaCoche() {
        Scanner sc = new Scanner(System.in);

        int seleccion2 = 0;
        if (seleccion == 0) {
            System.out.println("MENU DE COMPRA DE COCHE");
            System.out.println("1.Si Deasea comprar un coche pulse 1 si desea salir pulse 2");
            seleccion = sc.nextInt();
        }

        if (seleccion != 1) {
            System.out.println("Adios con Dios");
        } else {
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("MENU COMPRA DE COCHE");
            System.out.println("SIGA LOS PASOS EN ORDEN");
            System.out.println("1.AÑADIR DINERO");
            System.out.println("2.VER COCHES EN VENTA Y SU PRECIO");
            System.out.println("3.COMPRAR COCHE");
            System.out.println("4.SALIR");
            System.out.println("-------------------------------------");
            seleccion2 = sc.nextInt();
        }
        if (seleccion2 == 1) {
            System.out.println("¿cual es tu presupuesto?");
            this.dinero = sc.nextInt();
                
            ventaCoche();
        } else if (seleccion2 == 2) {
            PrecioCoches();
            ventaCoche();
            
        } else if (seleccion2 == 3) {
            System.out.println("¿Que coche Desea comprar?: ");
            PrecioCoches();
            compraCoche(sc.nextInt() - 1);
            System.out.println("Gracias por su compra");

        } else if (seleccion2 == 4) {

            System.out.println("GRACIAS Y ADIOS");

        }

    }

}
