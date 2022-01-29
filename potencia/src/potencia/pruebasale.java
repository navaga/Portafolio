/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

/**
 *
 * @author navag
 */
public class pruebasale {
    
    
    
    
 public static int getMax(int [] lista){

 int indice, max=Integer.MAX_VALUE;

 for(indice=0; indice<lista.length-1; indice++){
 if(lista[indice]<max){
 max=lista[indice];
 }
 }

 return max;

}
    
}
