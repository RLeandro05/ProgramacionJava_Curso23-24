package org.velazquez.U1.RecuperacionU1U2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero y positivo: ");
        int n = sc.nextInt();
        int n0 = 0;

        System.out.println("Este sería el número binario visto al revés: ");
        while (n != 0) {
            int binarior = n%2;
            n /= 2;

            n0 = n0*10+binarior;
            System.out.print(binarior);
        }
        System.out.println();
        System.out.println("FINALIZADO");

    }
}
