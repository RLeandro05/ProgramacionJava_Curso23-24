package org.velazquez.U3.EntregableU3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Introduzca la longitud de la cadena de números: ");
        n = sc.nextInt();

        int[] cadena = new int[n];

        for (int i = 0; i<n; i++) {
            System.out.println("Número: ");
            cadena[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++) {
            if (cadena[i] == n-1) {
                System.out.print(cadena[i]);
            } else {
                System.out.print(cadena[i]+", ");
            }

        }

        boolean booleano = duplicados(cadena, n);

        System.out.println();
        if (booleano) {
            System.out.println(true);
            System.out.println();

        }
        System.out.println(booleano);

        int[] resultado = eliminaDuplicados(cadena, n);

        System.out.println(resultado);
    }
    static boolean duplicados(int[] cadena, int n) {

        for (int i = 0; i<n; i++) {
            int aux = cadena[i];
            for (int j = i+1; j<n; j++) {
                if (cadena[j] == aux) {
                    return true;
                }
            }
        }

        return false;
    }
    static int[] eliminaDuplicados(int[] cadena, int n) {
        for (int i = 0; i<n; i++) {
            int aux = cadena[i];
            for (int j = i+1; j<n; j++) {
                if (cadena[i] == cadena[j]) {
                    cadena[j] = 0;
                }
            }
        }

        return cadena;
    }

}
