package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escoge un número de lunes a viernes:");
        System.out.println("1. L");
        System.out.println("2. M");
        System.out.println("3. X");
        System.out.println("4. J");
        System.out.println("5. V");

        int eleccion = teclado.nextInt();

        if (eleccion == 1) {
            System.out.println("A primera hora de Lunes tienes Mates");
        }
        if (eleccion == 2) {
            System.out.println("A primera hora de Martes tienes Lengua");
        }
        if (eleccion == 3) {
            System.out.println("A primera hora de Miércoles tienes Inglés");
        }
        if (eleccion == 4) {
            System.out.println("A primera hora de Jueves tienes Programación");
        }
        if (eleccion == 5) {
            System.out.println("A primera hora de Viernes tienes Francés");
        }
    }
}
