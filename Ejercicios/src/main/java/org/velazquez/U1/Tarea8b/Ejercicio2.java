package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int contador = 0;

        System.out.println("Por favor, introduzca el número a calcular: ");
        n = sc.nextInt();

        while (true) {
            System.out.print(n);
            System.out.print("    ");

            int cuadrado = n*n;
            System.out.print(cuadrado);
            System.out.print("    ");

            int cubo = cuadrado*n;
            System.out.print(cubo);
            System.out.println();

            n++;

            contador++;

            if (contador == 5) {
                break;
            }
        }




    }
}
