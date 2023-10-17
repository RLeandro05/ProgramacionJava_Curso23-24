package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i;
        int j;
        int k;

        System.out.println("Introduzca la altura: ");
        n = sc.nextInt();

        for (i = 1;i <= n - 1;i++) {
            System.out.print("*");
            for (j = 1;j <= n/2;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        System.out.print(" ");

        for (k = 1;k <= n/2;k++) {
            System.out.print("*");
        }
        System.out.print(" ");
    }
}
