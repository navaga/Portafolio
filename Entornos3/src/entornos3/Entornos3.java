/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos3;

/**
 *
 * @author navag
 */
public class Entornos3 {

    private float examenTeorico;
    private float examenPracticas;
    private boolean practicaConvalidada;

    public Entornos3(float examenTeorico, float examenPracticas, boolean practicaConvalidada) {
        this.examenTeorico = examenTeorico;
        this.examenPracticas = examenPracticas;
        this.practicaConvalidada = practicaConvalidada;
    }
    

    public Entornos3() {
    }
    
 public float calificaciones(float examenTeorico, float examenPracticas, boolean practicaConvalidada){

     if(examenTeorico >= 3.5F){
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

    /**
     * @return the examenTeorico
     */
    public float getExamenTeorico() {
        return examenTeorico;
    }

    /**
     * @param examenTeorico the examenTeorico to set
     */
    public void setExamenTeorico(float examenTeorico) {
        this.examenTeorico = examenTeorico;
    }

    /**
     * @return the examenPracticas
     */
    public float getExamenPracticas() {
        return examenPracticas;
    }

    /**
     * @param examenPracticas the examenPracticas to set
     */
    public void setExamenPracticas(float examenPracticas) {
        this.examenPracticas = examenPracticas;
    }

    /**
     * @return the practicaConvalidada
     */
    public boolean isPracticaConvalidada() {
        return practicaConvalidada;
    }

    /**
     * @param practicaConvalidada the practicaConvalidada to set
     */
    public void setPracticaConvalidada(boolean practicaConvalidada) {
        this.practicaConvalidada = practicaConvalidada;
    }
    
}
