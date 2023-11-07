package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        System.out.println();
        divisible(n);
    }
    public static void divisible(int n) {
        System.out.print("Números divisibles y primos: ");

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                boolean esPrimo = true;

                if (i == 2) {
                    System.out.print(i+", ");
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
                        System.out.print(i+", ");
                    }
                }
            }
        }
    }

}
