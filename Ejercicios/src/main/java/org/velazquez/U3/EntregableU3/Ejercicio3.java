package org.velazquez.U3.EntregableU3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Declaraciónd de las variables*/
        int n = 5;
        int contador = 0;

        int[][] cuadrado = new int[n][n];

        /*Metemos los números en el array bidimensional*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                cuadrado[i][j] = sc.nextInt();
            }
        }

        /*Mostramos la matriz completa*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                contador++;
                if (contador == 5) {
                    System.out.print(cuadrado[i][j]);
                    System.out.println();
                    contador = 0;
                } else {
                    System.out.print(cuadrado[i][j]+", ");
                }
            }
        }

        /*Invocamos a la función booleana del cuadrado mágico*/
        System.out.println();
        boolean resultado = cuadradoMagico(cuadrado, n);
        if (resultado) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    /*Declaración de la función booleana cuadradoMágico*/
    static boolean cuadradoMagico(int[][] cuadrado, int n) {

        int suma = 0;

        /*Primero sacamos la suma de la primera fila de la matriz*/
        for (int j = 0; j<n; j++) {
            suma += cuadrado[0][j];
        }
        int sumaf = 0;
        /*Luego, hacemos una suma a todas las filas y columnas de la matriz*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                sumaf += cuadrado[i][j];
            }
            /*Declaramos una función que establece que si la sumaf es distinta a la que todas las filas y columnas deberían tener,
            no es un cuadrado mágico*/
            if (sumaf != suma) {
                return false;
            }
            sumaf = 0;
        }
        /*Returnamos el valor de la booleana*/
        return true;
    }
}
