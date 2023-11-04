package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int n0 = 0;
        int j = 0;

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();
        System.out.print("Cifras que aparecen: ");

        while (n > 0) {
            int resto = n%10;
            n/=10;
            n0 = n0*10 + resto;
        }

        int n_aux = n0;

        while (n0 > 0) {
            int resto_f = n0%10;
            n0/=10;

            for (int i = 0; i <= 9;i++) {
                if (i == resto_f) {
                    System.out.print(resto_f+", ");
                }
            }
        }
        System.out.println();

        n0 = n_aux;
        System.out.print("Dígitos que no aparecen: ");
        int resto_f = n0%10;
        n0/=10;
        while (n0 > 0) {

            if (j != resto_f) {
                resto_f = n0%10;
                n0/=10;
            } else {
                j++;
                n0 = n_aux;
            }
            if (n0==0) {
                System.out.print(j+", ");
                j++;
                n0 = n_aux;
            }
            if (j == 10) {
                break;
            }
        }
        System.out.println();

        System.out.println("FINALIZADO");
    }
}
