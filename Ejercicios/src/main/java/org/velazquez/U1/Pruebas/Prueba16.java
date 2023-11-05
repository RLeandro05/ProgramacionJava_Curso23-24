package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n;
        int pos;
        int cambio;
        long n0 = 0;
        long n1= 0;
        int aux_pos = 0;

        System.out.println("Introduzca un número: ");
        n = sc.nextLong();

        System.out.println();

        System.out.println("Seleccione la posición para cambiar: ");
        pos = sc.nextInt();

        System.out.println();

        System.out.println("Seleccione el número que reemplazará a dicha posición: ");
        cambio = sc.nextInt();

        while (n != 0) {
            long resto = n%10;
            n/=10;

            n0 = n0*10+resto;
        }

        while (n0 != 0) {
            long resto_fin = n0%10;
            n0/=10;
            aux_pos++;

            if (aux_pos == pos) {
                resto_fin = cambio;
            }

            n1 = n1*10+resto_fin;
        }
        System.out.println(n1);
    }
}
