package org.velazquez.U1.ExamenU1U2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Introduzca una altura mínimo de 3 y que sea impar: ");
        n = sc.nextInt();
        int ancho = (n+1)/2;

        while (n < 3 || n%2==0) {
            System.out.println("La altura es incorrecta. Por favor,");
            System.out.println("seleccione un número impar y mínimo de 3 de altura; ");
            n = sc.nextInt();
        }

        //Dibujo de la M

        for (int i = 1; i<=ancho;i++) {
            for (int j = i; j <= ancho;j++) {
                if (j == 1) {
                    System.out.print("* ");
                    for (int k = 1; k<=n-2;k++) {
                        System.out.print("_ ");
                    }
                    System.out.print("* ");
                }
            }
        }
    }
}
