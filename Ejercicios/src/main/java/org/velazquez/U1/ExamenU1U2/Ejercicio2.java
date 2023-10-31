package org.velazquez.U1.ExamenU1U2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int n2;
        int n0 = 0;
        int n1 = 0;
        int pos = -1;

        System.out.println("Introduzca un número largo: ");
        n = sc.nextInt();

        System.out.println("Introduzca un segundo número entre 0 y 2: ");
        n2 = sc.nextInt();

        while (n > 0) {
            int resto = n%10;
            n /= 10;

            n0 = n0*10 + resto;
        }

        while (n0 > 0) {
            if (n2 == 1) {
                int resto_final = n0 % 10;
                pos ++;

                while (true) {
                    if (pos%2 == 1) {
                        break;
                    }
                    if (pos%2 == 0) {
                        n1 = n1*10+resto_final;
                        break;
                    }
                }

                n0 /= 10;
            }
            if (n2 == 2) {
                int resto_final = n0 % 10;
                pos ++;

                while (true) {
                    if (pos == 1) {
                        break;
                    }
                    if (pos == 2) {
                        pos = -1;
                        break;
                    } else {
                        n1 = n1*10+resto_final;
                        break;
                    }
                }

                n0 /= 10;
            }
            if (n2 == 0) {
                int resto_final = n0 % 10;
                n0/= 10;
                n1=n1*10+resto_final;
            }

        }
        System.out.print(n1);
    }
}
