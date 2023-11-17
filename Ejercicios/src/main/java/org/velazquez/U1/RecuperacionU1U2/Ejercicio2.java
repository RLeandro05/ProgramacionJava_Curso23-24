package org.velazquez.U1.RecuperacionU1U2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long n0 = 0;

        System.out.println("Por favor, introduzca un número: ");
        n = sc.nextLong();
        long n_aux = n;

        while (n_aux != 0) {
            long resto = n_aux%10;
            n_aux /= 10;

            n0 = n0*10 + resto;
        }
        System.out.println();

        if (n0 == n) {
            System.out.print("El número "+n+" es capicúa.");
        } else {
            System.out.println("El número "+n+" no es capicúa.");
        }
        System.out.println();
        System.out.println("FINALIZADO");


    }
}
