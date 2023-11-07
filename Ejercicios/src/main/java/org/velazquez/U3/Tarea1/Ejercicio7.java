package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;

        if (n == 1) {
            esPrimo = false;
            return esPrimo;
        }
        if (n == 2) {
            esPrimo = false;
            return esPrimo;
        }

        for (int i = 2; i<n;i++) {
            if (n%2 == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
