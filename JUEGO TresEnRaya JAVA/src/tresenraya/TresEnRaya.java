/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

/**
 *
 * @author navag
 */
public class TresEnRaya {

       private boolean jugador[][] = new boolean[3][3];
       private String nombre;
       private static boolean  turno=true;  //true = jugador1 false=jugador2;

    public boolean[][] getJugador() {
        return jugador;
    }

    public void setJugador(boolean[][] jugador1) {
        this.jugador = jugador1;
    }
 public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TresEnRaya() {
        
    }
       
    
    
}
