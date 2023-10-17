package org.velazquez.U1.Tarea8b;

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura (mínimo 3): ");
        int altura = scanner.nextInt();

        if (altura < 3) {
            System.out.println("La altura debe ser como mínimo 3.");
        }

        else {


            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    if (j == i || j == altura - 1 - i) {
                        System.out.print(" ");
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
