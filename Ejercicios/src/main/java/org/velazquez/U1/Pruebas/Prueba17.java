package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        for (int i = n; i <= n+4;i++) {
            boolean esPrimo = true;

            if (i == 2 || i == 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i%j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(i+" es primo.");
            } else {
                System.out.println(i+" no es primo.");
            }
        }
    }
}
