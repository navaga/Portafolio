/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author navag
 */
public class Departamento {
    //atributos
    private String nombre;
    private int codigo;
    private int id_localizacion;
    private int id_manager;

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_localizacion() {
        return id_localizacion;
    }

    public void setId_localizacion(int id_localizacion) {
        this.id_localizacion = id_localizacion;
    }

    public int getId_manager() {
        return id_manager;
    }

    public void setId_manager(int id_manager) {
        this.id_manager = id_manager;
    }

    //Constructor
    public Departamento() {
    }

    public Departamento(String nombre, int codigo, int id_localizacion, int id_manager) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.id_localizacion = id_localizacion;
        this.id_manager = id_manager;
    }

    
  
    
}
