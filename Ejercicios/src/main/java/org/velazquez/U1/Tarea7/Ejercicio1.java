package org.velazquez.U1.Tarea7;


import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        Random a = new Random();
        int valor;

        int valora = a.nextInt(10)+1;

        System.out.println("a = "+valora);

        Random b = new Random();
        int valorb = b.nextInt(10)+1;

        System.out.println("b = "+valorb);

        System.out.println("Intercambiando valores: ");
        valor = valora;
        valora = valorb;
        valorb = valor;

        System.out.println("a = "+valora);
        System.out.println("b = "+valorb);
    }
}
