package org.velazquez.U1.Entregable1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura = 0;


        while (altura % 2 == 0 || altura < 3) {
            System.out.print("Introduzca una altura impar y mayor que 3: ");
            altura = teclado.nextInt();
        }


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == altura - 1 || j == altura - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.print("   ");
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == altura - 1 || j == altura - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }


    }
}
