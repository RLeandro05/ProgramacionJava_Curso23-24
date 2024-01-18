package org.velazquez.U4.Tarea1.Ejercicio9.Personal;

public class Jefes_Estacion {

    private String nombre;
    private String DNI;

    /*Creación de constructor para añadir los datos provenientes del principal*/
    public Jefes_Estacion(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    /*Imprimimos los datos para mostrarlos en pantalla*/
    @Override
    public String toString() {
        return "Jefes_Estacion{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
