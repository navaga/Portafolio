package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Alumnos implements Comparable<Alumnos> {

    //dni, siglas del módulo en el que está matriculado, la nota obtenida en dicho módulo (será de tipo double), y la provincia a la que pertenece.
    private String dni, provincia, modulo;
    private double nota;

    public Alumnos(String dni, String provincia, String modulo, double nota) {
        this.dni = dni;
        this.provincia = provincia;
        this.modulo = modulo;
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Alumnos a) {
        return modulo.compareTo(a.getModulo());
    }

}
