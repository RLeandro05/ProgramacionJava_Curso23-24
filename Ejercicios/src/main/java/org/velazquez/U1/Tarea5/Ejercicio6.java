package org.velazquez.U1.Tarea5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce una cantidad de tiempo en segundos");
        double tiempo = teclado.nextDouble();
        double gravedad = 9.8;

        if (tiempo<=0) {
            System.out.println("Tiempo incorrecto, debe ser mayor que 0");
        }
        else {
            System.out.println("Sabiendo que la v = g*t, ");

            double resultado = (double) (gravedad*tiempo);

            System.out.println("El resultado es  v = "+resultado+" m/s");
        }


    }
}
