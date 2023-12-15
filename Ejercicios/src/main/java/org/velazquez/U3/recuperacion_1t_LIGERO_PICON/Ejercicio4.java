package org.velazquez.U3.recuperacion_1t_LIGERO_PICON;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Drfinimos una tabla bidimensional*/
        int[][] n = new int[1][1];

        /*Introducimos la posición donde queremos encontrar el número escondido en ella*/
        System.out.println("Introduzca la posición para encontrar el número en ella: ");
        int posicion = sc.nextInt();

        /*Hacemos un llamamiento a la función nEsima donde guardamos el resultado*/
        int resultado = nEsimo(n, posicion);
        /*Mostramos el resultado en pantalla*/
        System.out.println("El número escondido es: "+resultado);
    }
    /*Definición de la función nEsimo*/
    public static int nEsimo(int[][] n, int posicion) {
        Scanner sc = new Scanner(System.in);

        int contador = -1;

        int min = 10;
        int max = 100;

        /*Introducimos la longitud de las filas de la tabla*/
        System.out.println("Introduzca la longitud de las filas: ");
        int filas = sc.nextInt();

        /*Introducimos la longitud de las columnas de la tabla*/
        System.out.println("Introduzca la longitud de las columnas: ");
        int columnas = sc.nextInt();

        /*Creamos una tabla auxiliar con las dimensiones proporcionadas*/
        int[][] aux = new int[filas][columnas];

        /*Si la posición se pasa de las que tiene la tabla, devolvemos -1*/
        if (posicion > filas*columnas) {
            return -1;
        }
        /*Si no se cumple, comenzamos a buscar el número escondido*/
        else {
            /*Teniendo la tabla auxiliar, introducimos en la tabla n originl las dimeniones correctas de la auxiliar*/
            n = aux;

            /*Introducimos en la tabla elementos aleatorios introducidos por la máquina*/
            for (int i = 0; i<filas; i++) {
                for (int j = 0; j<columnas; j++) {
                    n[i][j] = (int) (Math.random()*((max+1)-min))+min;
                }
            }
            /*Mostramos la tabla en pantalla*/
            for (int i = 0; i<filas; i++) {
                for ( int j = 0; j<columnas; j++) {
                    if (j == columnas-1) {
                        System.out.println(n[i][j]);
                    } else {
                        System.out.print(n[i][j]+", ");
                    }
                }
            }
            int resultado = 0;
            /*Recorremos la tabla usando un contador como posiciones unidimensionales. Cada elementos sumará +1 al contdor de posiciones
            En el caso de que el contador llegue a la posición donde queremos saber el número que esconde, lo guardamos en una variable*/
            for (int i = 0; i<filas; i++) {
                for (int j = 0; j<columnas; j++) {
                    contador++;

                    if (contador == posicion) {
                        resultado = n[i][j];
                        break;
                    }
                }
            }

            /*Returnamos el valor escondido como resultado final*/
            return resultado;
        }
    }
}
