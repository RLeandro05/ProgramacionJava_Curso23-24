package org.velazquez.U3.Tarea2;

public class Ejercicio9b {
    public static void main(String[] args) {
        StringBuffer cadena = new StringBuffer("Alabí Alixar");
        System.out.println(cadena);
        System.out.println("Capacidad: "+cadena.capacity());
        System.out.println("Longitud: "+cadena.length());

        System.out.println();

        cadena.replace(0,cadena.length(),"Chicharrones de Chiclana");
        System.out.println(cadena);

        System.out.println();

        int n = 5000;
        cadena.replace(0,cadena.length(),"Hay "+n+" Chicharrones");
        System.out.println(cadena);

        System.out.println();
        cadena.replace(0,cadena.length(),"Hay "+n+" Chicharrones en Chiclana");
        System.out.println(cadena);

        System.out.println();

        String cadenaf = cadena.substring(cadena.length()-4,cadena.length());
        System.out.println(cadenaf);

        System.out.println();

        System.out.println("Capacidad final: "+cadena.capacity());
        System.out.println("Longitud final: "+cadena.length());
    }
}
