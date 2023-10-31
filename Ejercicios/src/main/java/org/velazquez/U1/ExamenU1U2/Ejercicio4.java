package org.velazquez.U1.ExamenU1U2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int n0 = 0;
        int contador = 0;
        int contador2 = 0;
        int n1 = 0;

        System.out.println("Introduzca un número positivo de 6 cifras: ");
        n = sc.nextInt();

        while (contador != 6) {
            int resto = n%10;
            n /= 10;

            for (int i = 1; i <= resto; i++ ) {
                if (i == resto) {
                    contador++;
                }
            }

            n0 = n0*10 + resto;
            if (n <= 0 && contador != 6) {
                System.out.println("Número no válido: ");
                n = sc.nextInt();
            }
        }

        while (n0 > 0) {
            int resto_final = n0%10;
            n0/=10;
            n1 = n1*10+resto_final;

            contador2++;
            if (contador2 == 3) {
                System.out.println();

                for (int i = 1; i <= n1; i++) {
                    int divisores = 0;

                    for (int j = 1; j <= i; j++) {
                        if (n1 % j == 0) {
                            divisores++;
                        }
                        if (divisores > 2) {
                            System.out.println(n1+" no es primo");
                            break;
                        }
                    }

                    if (divisores == 2) {
                        System.out.println(n1+" es primo");
                    }
                }


                n1 = 0;
                contador2 = 0;
            }

        }

    }
}
