/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navag
 */
public class NewClass {
    
    public static void main(String[] args) {
            System.out.println(calificaciones(4, 2, true));
	}
    
    
public static float calificaciones(float examenTeorico, float examenPracticas, boolean practicaConvalidada){

     if(examenTeorico <= 3.5F){
           if(practicaConvalidada){
                 return examenTeorico+1.5F;
           }
           else{
                 return examenTeorico+examenPracticas;
          }
     }
     else{
           return examenTeorico;
     }

}
    
}
