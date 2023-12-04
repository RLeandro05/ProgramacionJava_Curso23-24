package org.velazquez.U3.Pruebas;

import java.util.Scanner;
import java.util.Random;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Primero, pedimos al usuario la dimensión del tablero del buscaminas*/
        System.out.println("Ingrese la dimensión N para el tablero:");
        int dimension = scanner.nextInt();

        /*Creamos un tablero de las dimensiones antes mencionadas e inicializarlo con '-'*/
        char[][] tablero = crearTablero(dimension);

        /*Haremos un llamamiento a la función colocarBombas, para crear las bombas*/
        colocarBombas(tablero);

        /*Invocaremos a una función que mostrará la tabla*/
        mostrarTablero(tablero);

        /*Luego, introduciremos la posición de la fila y la columna donde queramos posicionarnos
        para saber las minas que hay alrededor*/
        System.out.println("Ingrese la posición para verificar bombas (fila, columna):");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        /*A partir de ese establecimiento de coordenadas, invocamos a la funci´pn verificarBombas
        para ver cuántas hay*/
        verificarBombas(tablero, fila, columna);

        scanner.close();
    }

    /*Declaramos la función crearTablero*/
    private static char[][] crearTablero(int dimension) {
        char[][] tablero = new char[dimension][dimension];
        /*Creamos el tablero a partir de las dimensiones proporcionadas y poniendo de momento
        el caracter "-"*/
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                tablero[i][j] = '-';
            }
        }
        /*Devolvemos el tablero de guiones*/
        return tablero;
    }

    /*Declaramos la función colocarBombas*/
    private static void colocarBombas(char[][] tablero) {
        Random random = new Random();
        int dimension = tablero.length;
        int bombas = dimension * dimension / 4; // Ajusta según la dificultad

        /*En este for, se pondrán bombas aleatorias en distintas posiciones del tablero*/
        for (int i = 0; i < bombas; i++) {
            int fila = random.nextInt(dimension);
            int columna = random.nextInt(dimension);

            /*Establecemos un while donde decimos que debe poner la bomba en lugares
            no ocupados*/
            while (tablero[fila][columna] == 'X') {
                fila = random.nextInt(dimension);
                columna = random.nextInt(dimension);
            }

            /*Luego, se introduce la mina en el tablero*/
            tablero[fila][columna] = 'X';
        }
    }

    /*Declaramos la función mostrarTablero*/
    private static void mostrarTablero(char[][] tablero) {
        int dimension = tablero.length;

        /*En este for, mostraremos el tablero tras poner las bombas y los guiones, pudiendo dar
        inicio a la partida*/
        System.out.println("Tablero Actual:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*Declaramos la función verificarBombas*/
    private static void verificarBombas(char[][] tablero, int fila, int columna) {
        int dimension = tablero.length;

        /*Por si acaso, establecer una condición la cual si la posición introducida por el usuario
        es inválida, volver a preguntar la posición donde colocarse*/
        if (fila < 0 || fila >= dimension || columna < 0 || columna >= dimension) {
            System.out.println("Posición inválida.");
            return;
        }

        /*Aquí empezaremos a contar el número de bombas que haya según dónde nos posicionemos en el tablero*/
        int bombasAlrededor = contarBombas(tablero, fila, columna);
        System.out.println("En la posición " + fila + "," + columna + " hay " + bombasAlrededor + " bombas en los alrededores.");
    }

    /*Declaramos la función contarBombas*/
    private static int contarBombas(char[][] tablero, int fila, int columna) {
        int dimension = tablero.length;
        int bombasAlrededor = 0;

        for (int i = Math.max(0, fila - 1); i <= Math.min(dimension - 1, fila + 1); i++) {
            for (int j = Math.max(0, columna - 1); j <= Math.min(dimension - 1, columna + 1); j++) {
                /*Aquí contaremos las bombas que hayan*/
                if (tablero[i][j] == 'X') {
                    bombasAlrededor++;
                }
            }
        }

        /*Returnamos el número de bombas alrededor nuestra a la anterior función*/
        return bombasAlrededor;
    }
}
