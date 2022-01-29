/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosbdoo;

/**
 *
 * @author navag
 */
public class Empleados {
    //codEmpleado: número entero.Nombre: String.Apellidos: String.Departamento: String.Salario: número en coma flotante.

    private int codEmpleado;
    private String nombre;
    private String apellidos;
    private String Departamento;
    private float salario;

    public Empleados(int codEmpleado, String nombre, String apellidos, String Departamento, float salario) {
        this.codEmpleado = codEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Departamento = Departamento;
        this.salario = salario;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
