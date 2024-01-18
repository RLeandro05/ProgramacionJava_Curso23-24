package org.velazquez.U4.Tarea1.Ejercicio9.Personal;

public class Mecanicos {

    private String nombre;
    private int telefono;
    private String especialidad;

    /*Creación de constructor para añadir los datos provenientes del principal*/
    public Mecanicos(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    /*Imprimimos los datos para mostrarlos en pantalla*/
    @Override
    public String toString() {
        return "Mecanicos{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
