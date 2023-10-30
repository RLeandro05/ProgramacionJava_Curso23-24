package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n;
        long n0 = 0;
        long contador_primo = 0;
        long contador_noprimo = 0;

        System.out.println("Introduzca un número: ");
        n = sc.nextLong();

        while (n > 0) {
            long resto = n%10;
            n0 = n0*10+resto;


            int contador = 0;
            for (int i = 1; i <=resto; i++) {
                long auxiliar = resto%i;

                if (auxiliar == 0) {
                    contador++;
                }
            }
            if (contador == 2 && resto != 2) {
                System.out.println("El "+resto+" es primo");
                contador_primo++;
            } else {
                System.out.println("El "+resto+" no es primo");
                contador_noprimo++;
            }
            n/=10;

        }
        System.out.println("Hay "+contador_noprimo+" cifras no primas");
        System.out.println("Hay "+contador_primo+" cifras primas");
    }
}
