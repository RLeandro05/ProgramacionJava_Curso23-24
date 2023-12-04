package org.velazquez.U3.Pruebas;

public class Subcorteza {
    public static void main(String[] args) {
        // Ejemplo de uso de la función subcorteza
        int filas = 5;
        int columnas = 6;
        int contador = 0;

        int[][] tabla = {
                {45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {97, 65, 83, 71, 36, 12},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}
        };

        int[] resultado = subcorteza(tabla, filas, columnas);

        for (int i = 0; i<filas+columnas-1; i++) {
            contador++;

            if (contador == filas+columnas-1) {
                System.out.println(resultado[i]);
                contador = 0;
            } else {
                System.out.print(resultado[i]+", ");
            }
        }
    }

    public static int[] subcorteza(int[][] tabla, int filas, int columnas) {
        int contador = 0;
        int[] uni = new int[filas+columnas-1];
        int z = 0;

        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                contador++;
                if (contador == columnas) {
                    System.out.println(tabla[i][j]);
                    contador = 0;
                } else {
                    System.out.print(tabla[i][j]+", ");
                }
            }
        }

        System.out.println();

        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                if ((i == 1 || i == filas-2) && j > 0 && j < columnas-1) {
                   uni[z] = tabla[i][j];
                   z++;
                } else if (i == (filas-1)/2 && (j == 1 || j == columnas-2)) {
                    uni[z] = tabla[i][j];
                    z++;
                }

            }
        }

        return uni;
    }
}
