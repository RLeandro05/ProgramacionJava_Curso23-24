package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMin;
        int numMax;
        int numero;

        System.out.println("Introduce el valor mínimo: ");
        numMin = sc.nextInt();

        System.out.println("Introduce el valor máximo: ");
        numMax = sc.nextInt();

        System.out.println("Introduce un valor dentro de ese rango: ");
        numero = sc.nextInt();

        while (numero < numMin || numero > numMax) {
            System.out.println("Parece que pasaste el límite del rango, por favor, ");
            System.out.println("introduzca un número dentro del rango dado: ");
            numero = sc.nextInt();
        }
    }
}
