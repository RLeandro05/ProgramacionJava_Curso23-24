package org.velazquez.U3.Tarea3;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*Inicializamos los valores de las filas y las columnas de nuestra matriz*/
        int n = 5;
        int m = 5;

        /*Esta matriz especial menciona ser una matriz grande que dentro contiene otra cantidad de matrices
        O también dicho, un array con arrays dentro*/
        int[][] matriz = new int[n][m];

        /*En este for con otro dentro se dedica a sumar las filas por las columnas como si
        fuese una matriz*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                matriz[i][j] = i+j;
            }
        }

        /*Al final, usando Arrays.deepToString, podemos imprimir bien el array completo sin fallos*/
        System.out.println(Arrays.deepToString(matriz));
    }
}
