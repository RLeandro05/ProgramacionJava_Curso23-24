package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int contador = 0;

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        divisible(n, contador);
        System.out.println();

        int primos = divisible(n, contador);

        System.out.println("Hay "+primos+" números divisibles y primos");
    }
    public static int divisible(int n, int contador) {

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                boolean esPrimo = true;

                if (i == 2) {
                    contador++;
                }else if (i == 1) {
                    esPrimo = false;
                } else {
                    for (int j = 2; j < i; j++) {
                        if (i%j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

}
