/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtarea1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Coche> coches = new ArrayList<>();
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.print("Cuantos coches quieres insertar:");
        int numCoches = Integer.parseInt(entradaEscaner.nextLine());
        for(int i =0; i<numCoches;i++)
        {
            System.out.println("Coche numero "+(i+1));
            Coche co = new Coche();
            System.out.print("Marca: ");
            co.setMarca(entradaEscaner.nextLine());
             System.out.print("Modelo: ");
            co.setModelo(entradaEscaner.nextLine());
             System.out.print("Año: ");
            co.setAño(Integer.parseInt(entradaEscaner.nextLine()));
             System.out.print("Matricula: ");
            co.setMatricula(entradaEscaner.nextLine());
            
            
            coches.add(co);
        }
        System.out.println("*********************************************");
        System.out.println("numero de coches introducidos: "+Coche.contador_de_coches);
        System.out.println("*********************************************");
        for(int i=0;i< coches.size();i++)
        {
            System.out.println("Coche numero "+(i+1));
            System.out.println("Marca: "+coches.get(i).getMarca());
            System.out.println("Modelo: "+coches.get(i).getModelo());
            System.out.println("Matricula: "+coches.get(i).getMatricula());
            System.out.println("Año: "+coches.get(i).getAño());
        }
        
        
    }
    
}
