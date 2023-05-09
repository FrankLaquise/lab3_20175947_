package com.example.a20175947_lab3;

public class Mascota {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    private String dueño;
    private int dni;
    private String genero;
    private String descripcion;
    private String ruta;

    public Mascota(String nombre, String genero, String dueño,int dni, String descripcion, String ruta) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.dni = dni;
        this.genero = genero;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }
}
