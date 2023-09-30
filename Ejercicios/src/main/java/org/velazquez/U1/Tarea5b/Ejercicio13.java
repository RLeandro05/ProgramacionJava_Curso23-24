package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un número entero aleatorio: ");

        int n = teclado.nextInt();

        if (n%5 == 0) {
            if (n%2 == 0) {
                System.out.println("Es par y divisible entre 5");
            }
            else {
                System.out.println("No es par pero es divisible entre 5");
            }
        }
        else {
            System.out.println("No es ni par ni divisible entre 5");
        }
    }
}
