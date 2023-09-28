package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, con este programa puede resolver");
        System.out.println("ecuaciones de primer grado tipo ax + b = 0");
        System.out.print("Por favor, introduce un valor al parámetro a: ");
        double a = teclado.nextShort();

        System.out.print("Por favor, introduce un valor al parámetro b: ");
        double b = teclado.nextShort();

        if (a == 0) {
            System.out.println("No existe una solución real");
        }
        else {
            double b_cambiada = (double) (b*(-1));
            double resultado = (double) (b_cambiada/a);

            System.out.println("x = "+resultado);
        }
    }
}
