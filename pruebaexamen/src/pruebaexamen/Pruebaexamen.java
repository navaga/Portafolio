/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

/**
 *
 * @author navag
 */
public class Pruebaexamen extends Thread{

    public int veces = 0;

public Pruebaexamen(String str , int veces)

{

super (str);

this.veces = veces;

}

public void run()

{

for(int i =0; i< veces;i++){

System.out.println(i+" "+getName());

}

System.out.println("termina thread"+getName());

}

public static void main(String[] args)

{

new Pruebaexamen("pepe",1).start();

new Pruebaexamen("Juan",2).start();

System.out.println("Termina thread");

}
    
}
