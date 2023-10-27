package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduzca un número que sea impar y mínimo de 3 de altura: ");
        n = sc.nextInt();

        while (n < 3 || n%2==0) {
            System.out.println("La altura es incorrecta. Por favor,");
            System.out.println("seleccione un número impar y mínimo de 3 de altura; ");
            n = sc.nextInt();
        }

        //Dibujo de la A
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

                if (i == n-1) {
                    for (int k = 1; k <= n*2-4;k++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.print("*");

            for (int l = 1; l <= 2*i-3; l++) {
                if (i != n-1) {
                    System.out.print(" ");
                }
            }

            if (i > 1 && i != n-1) {
                System.out.print("*");
            }

            System.out.print("   ");

            //Dibujo de la B
            int mitad = (n+1) >> 1;

            for (int j = 1; j<=i; j++) {
                if (i == 1 || i == n || i == mitad && j == 1) {
                    for (int k = 1; k <= n-1; k++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            if (i > 1 && i < mitad  ||  i > mitad && i < n) {
                System.out.print("*");
                for (int l = 1; l <= n-2; l++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
