/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navag
 */
public class Taller {
    
    private String nombre;
    private int codigo;
    private int cantidad;
    private String descripcion;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Taller(){}
    public Taller(int codigo,String nombre,int cantidad,String descripcion)
    {
        this.codigo=codigo;
        this.nombre = nombre;
        this.cantidad=cantidad;
        this.descripcion=descripcion;
        
    }
    public int GetCodigo()
    {
        return this.codigo;
    }
    public void SetCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    
    public String GetNombre()
    {
        return this.nombre;
    }
    public void SetNombre(String nombre)
    {
        this.nombre=nombre;
    }
  
     @Override
    public String toString()
    {
        return +codigo+";"+nombre+";"+this.cantidad+ ";"+this.descripcion;
    }
    
}
