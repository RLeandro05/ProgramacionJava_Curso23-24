package org.velazquez.U4.Tarea1.Ejercicio9.Personal;

public class Maquinistas {
    private String nombre;
    private String DNI;
    private final int sueldo_mensual;
    private String rango;

    /*Creación de constructor para añadir los datos provenientes del principal*/
    public Maquinistas(String nombre, String DNI, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo_mensual = 1870;
        this.rango = rango;
    }

    /*Imprimimos los datos para mostrarlos en pantalla*/
    @Override
    public String toString() {
        return "Maquinistas{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo_mensual=" + sueldo_mensual +
                ", rango='" + rango + '\'' +
                '}';
    }
}
