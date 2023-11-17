package org.velazquez.U1.RecuperacionU1U2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int ancho;

        while (true) {
            System.out.println("Por favor, introduzca la altura de la flecha: ");
            n = sc.nextInt();

            if (n >= 3 && n%2 == 1) {
                break;
            }
        }
        ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=ancho; j++) {
                if (i+j == ancho+1 || i-j == ancho-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("     ");
            for (int j = 1; j<=ancho; j++) {
                if (i+j == ancho+1 || i-j == ancho-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("FINALIZADO");
    }
}
