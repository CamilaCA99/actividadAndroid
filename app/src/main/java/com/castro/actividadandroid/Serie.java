package com.castro.actividadandroid;

public class Serie {

    String nombre;
    String genero;
    String valoracion;

    public Serie(String nombre, String genero, String valoracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
}
