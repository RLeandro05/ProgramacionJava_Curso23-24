package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n;
        int cont_par = 0;
        int cont_impar = 0;

        System.out.println("Introduzca un número: ");
        n = sc.nextLong();

        while (n != 0) {
            long resto = n%10;
            n/=10;

            if (resto%2 == 0) {
                cont_par++;
            } else {
                cont_impar++;
            }
        }
        System.out.println();
        System.out.println("Hay en total: "+cont_par+" números pares y "+cont_impar+" números impares.");
    }
}
