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
    
    public Taller(){}
    public Taller(int codigo,String nombre)
    {
        this.codigo=codigo;
        this.nombre = nombre;
        
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
        return "codigo: "+codigo+" nombre: "+nombre;
    }
    
}
