package org.velazquez.U4.Tarea1.Ejercicio8;

public class Bombilla {
    private boolean estado;
    private static boolean int_general=true;
    /*Función para mostrar estado de las bombillas en función del interruptor general de la casa*/
    public void mostrarEstado(boolean estado) {
        if (estado && !int_general) {
            System.out.println("A!");
        } else if (estado){
            System.out.println("E!");
        }

        if (!estado && !int_general) {
            System.out.println("A!");
        } else if (!estado){
            System.out.println("A!");
        }
    }
    /*Función para encender o apagar el interruptor general de la casa*/
    public static void apagon() {
        int_general=!int_general;
    }
}
