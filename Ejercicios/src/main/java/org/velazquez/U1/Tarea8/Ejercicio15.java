package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Ingresa el valor máximo del rango: ");
        int max = scanner.nextInt();

        int contadorPrimos = 0;

        for (num = 1; num <= max; num++) {
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
                if (divisores > 2) {
                    break;
                }
            }

            if (divisores == 2) {
                contadorPrimos++;
            }
        }

        System.out.println("El número de números primos en el rango es: " + contadorPrimos);
    }
}
