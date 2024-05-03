package org.velazquez.U7.Entregable2021Tarde;

import java.util.ArrayList;
import java.util.List;

public class Unidad {
    private String nombreUnidad;
    private List<Alumno> listaAlumnos = new ArrayList<>();

    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return nombreUnidad;
    }
}
