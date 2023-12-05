package org.velazquez.U3.LIGERO_PICON_EXAMENU3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Dimensión de la fila: ");
        int filas = sc.nextInt();
        System.out.println("Dimensión de la columna: ");
        int columnas = sc.nextInt();
        /*Definimos los dos arrays para llevarlos a la función*/
        String[][] matriz = new String[filas][columnas];

        String[] fila = new String[columnas];


        /*Establecemos la posición donde queremos que se instale la fila en la matriz*/
        System.out.println("Establezca la posición de la matriz donde quiere posicionar la fila: ");
        int pos = sc.nextInt();

        String[][] matrizResultante = insertarFilaEnMatriz(matriz, fila, pos);

        System.out.println();
        System.out.println();
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                contador++;

                if (contador == columnas) {
                    System.out.println(matrizResultante[i][j]);
                    contador = 0;
                } else {
                    System.out.print(matrizResultante[i][j]+", ");
                }
            }
        }
    }
    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        /*Pedimos las dimensiones de las filas y columnas de la matriz de caracteres*/
        System.out.println("Establece la dimensión de las filas nuevamente: ");
        int filas = sc.nextInt();

        System.out.println("Establece la dimensión de las columnas nuevamente: ");
        int columnas = sc.nextInt();

        /*Primero tendremos un for donde iremos poniendo los caracteres que queramos*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                System.out.println("Caracter de la matriz: ");
                matriz[i][j] = sc.next();
            }
        }

        /*Luego, mostramos esa misma matriz en pantalla con los caracteres introducidos por el usuario*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                contador++;

                if (contador == columnas) {
                    System.out.println(matriz[i][j]);
                    contador = 0;
                } else {
                    System.out.print(matriz[i][j]+", ");
                }
            }
        }

        /*Declaramos un array unidimensional que será la fila la cual meteremos en la matriz*/
        fila = new String[columnas];

        System.out.println("Introduce la fila de caracteres de longitud: "+columnas);

        /*En este for pondremos los caracteres que queramos de la fila. DEBE ser de la misma longitud que el valor de las columans de la matriz, sino. no entra*/
        for (int i = 0; i<columnas; i++) {
            fila[i] = sc.next();
        }

        for (int i = 0; i<columnas; i++) {
            System.out.print(fila[i]+", ");
        }

        /*Declaramos una nueva matriz de caracteres la cual será de las mismas dimensiones que la anterior matriz, pero añadiéndole una fila más*/
        String[][] matrizSumada = new String[filas][columnas];


        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                /*Dentro del for, si la fila llega a la posición de la fila donde queremos añadir la fila, indicamos que en esa posición se introduce
                el caracter del array fila*/
                if (i == pos) {
                    matrizSumada[i][j] = fila[j];
                }
                /*Si no lo cumple, se iría imprimiendo cada caracter de la anterior matriz*/
                else {
                    matrizSumada[i][j] = matriz[i][j];
                }
            }
        }

        return matrizSumada;
    }
}
