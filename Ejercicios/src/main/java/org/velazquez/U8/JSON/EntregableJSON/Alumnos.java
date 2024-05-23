package org.velazquez.U8.JSON.EntregableJSON;


import java.util.ArrayList;
import java.util.List;

public class Alumnos {
    private Integer id;
    private String nombre;
    private String apellidos;
    private int edad;
    private ArrayList<Asignaturas> ListaAsignaturas;

    public Alumnos(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Asignaturas> getListaAsignaturas() {
        return ListaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignaturas> listaAsignaturas) {
        ListaAsignaturas = listaAsignaturas;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", ListaAsignaturas=" + ListaAsignaturas +
                '}';
    }
}
