package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
