/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class JuegoMetodos {
    private static TresEnRaya jugador1Objeto; 
    private static TresEnRaya jugador2Objeto;
    private static boolean jugador1[][];
    private static boolean jugador2[][]; 
    private boolean ganador;
    private int empate;
    
    //inicia todos los objetos y los atributos.
    public void iniciar(String j1,String j2)
    {
        jugador1 = new boolean[3][3];
        jugador2 = new boolean[3][3];
        jugador1Objeto = new TresEnRaya();
        jugador2Objeto = new TresEnRaya();
        jugador1Objeto.setNombre(j1);
        jugador2Objeto.setNombre(j2);
        
        
    }
    
    // metodo donde ponemos en true la casilla correspodiente de cada jugador.
    public String insertarPosicionJugador(int i,int j)
    {
        empate++; // cada vez que se añade una casilla se suma 1 a empate si empate llega a 9 es true;
        if(jugador1Objeto.isTurno())
        {
        jugador1[i][j]=true;
        jugador1Objeto.setJugador(jugador1);
        jugador1Objeto.setTurno(false);
        comprobarGanador(jugador1Objeto.getJugador());
        return "X";
        }
        else
        {
        jugador2[i][j]=true;
        jugador2Objeto.setJugador(jugador2);
        jugador2Objeto.setTurno(true);
        comprobarGanador(jugador2Objeto.getJugador());
        return "O";
        }
        
    }
    
    // metodo con la logica para comprobar si alguien ha ganado
    public void comprobarGanador(boolean jugador[][])
    {

        ganador = true;
        if(jugador[0][0] && jugador[0][1] && jugador[0][2])   // primer linea horizontal
        {
            
            
        }else if(jugador[1][0] && jugador[1][1] && jugador[1][2]) // segunda linea horizontal
        {
           
        }
        else if(jugador[2][0] && jugador[2][1] && jugador[2][2]) //tercera linea horizontal
        {
           
        }
        else if(jugador[0][0] && jugador[1][1] && jugador[2][2]) // transversal de izquuierda a derecha1
        {
           
        }
        else if(jugador[0][2] && jugador[1][1] && jugador[2][0]) //transversal de derecha a izquierda
        {
           
        }
        else if(jugador[0][0] && jugador[1][0] && jugador[2][0]) // vertizal Izquierda
        {
           
        }
        else if(jugador[0][2] && jugador[1][2] && jugador[2][2]) //vertical Derecha
        {
           
        }
         else if(jugador[0][1] && jugador[1][1] && jugador[2][1]) //vertical centro
        {
           
        }
        else
         {
            
            ganador = false;
         }
    }
    //devuelve el nombre del jugador que esta en su turno.
    public String turnoDe()
    {
        if(jugador1Objeto.isTurno())
        {
            return jugador1Objeto.getNombre();
        }
        else
            return jugador2Objeto.getNombre();
    }
    //devuelve true si alguien ha ganado.
    public boolean ganador()
    {
        return ganador;
    }
    //devuelve un numero para comprobar si es mayor de 8 han empatado
    public int empate()
    {
        return empate;
    }
}
