/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesnombreapellidos;

/**
 *
 * @author navag
 */
import java.util.Scanner;
public class alumno
{
	private int edad=0;
	private String nombre="";
	public alumno(){};
	public alumno(int edad,String nombre){
		if(edad>=0 && edad<=100)
		{
		this.edad=edad;
		this.nombre=nombre;
		}else{this.nombre="nombre erroneo";}
	
	}
	public void SetEdad(int edad)
	{
		if(edad>=0 && edad<=100)
		{
		this.edad=edad;
		}else{this.nombre="nombre erroneo";}
	}
	public void SetNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public int GetEdad(){return this.edad;}
	public String GetNombre(){return this.nombre;}
	public static void ayuda()
	{
		System.out.println("este programa mete nombres y edades");
	}

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		alumno alu1 = new alumno(sc1.nextInt(),sc1.next());
		alumno alu2 = new alumno();
		System.out.println(alu1.GetNombre()+alu1.GetEdad());	
	}
}