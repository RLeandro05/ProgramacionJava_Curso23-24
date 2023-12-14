package org.velazquez.U3.Pruebas;

import java.util.Scanner;

public class Unir_Matrices_Iguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Definimos las dimensiones de ambas matrices a usar*/
        int filas1;
        int columnas1;
        int filas2;
        int columnas2;

        /*Pedimos las dimensiones de la primera matriz*/
        System.out.println("Introduzca las filas de la primera matriz: ");
        filas1 = sc.nextInt();
        System.out.println("Introduzca las columnas de la primera matriz: ");
        columnas1 = sc.nextInt();

        /*Según sus dimensiones, creamos la matriz*/
        String[][] matriz1 = new String[filas1][columnas1];

        /*Incluímos elementos aleatorios*/
        System.out.println("Introduzca los elementos de la primera matriz: ");
        for (int i = 0; i<filas1; i++) {
            for (int j = 0; j<columnas1; j++) {
                matriz1[i][j] = sc.next();
            }
        }

        /*Pedimos las dimensiones de la segunda matriz*/
        System.out.println("Introduzca las filas de la segunda matriz: ");
        filas2 = sc.nextInt();
        System.out.println("Introduzca las columnas de la segunda matriz: ");
        columnas2 = sc.nextInt();

        /*Creamos la segunda matriz con las dimensiones proporcionadas*/
        String[][] matriz2 = new String[filas2][columnas2];

        /*Introducimos elementos aleatorios en la segunda matriz*/
        System.out.println("Introduzca los elementos de la segunda matriz: ");
        for (int i = 0; i<filas2; i++) {
            for (int j = 0; j<columnas2; j++) {
                matriz2[i][j] = sc.next();
            }
        }

        System.out.println();

        System.out.println("Matriz 1: ");
        /*Mostramos en pantalla la matriz completa*/
        int contador = 0;
        for (int i = 0; i<filas1; i++) {
            for (int j = 0; j<columnas1; j++) {
                contador++;

                if (contador == columnas1) {
                    System.out.println(matriz1[i][j]);
                    contador = 0;
                } else {
                    System.out.print(matriz1[i][j]+", ");
                }
            }
        }

        System.out.println();

        System.out.println("Matriz 2: ");

        /*Mostramos la segunda matriz en pantalla*/
        for (int i = 0; i<filas2; i++) {
            for (int j = 0; j<columnas2; j++) {
                contador++;

                if (contador == columnas2) {
                    System.out.println(matriz2[i][j]);
                    contador = 0;
                } else {
                    System.out.print(matriz2[i][j]+", ");
                }
            }
        }

        /*Hacemos un llamamiento a la función unirMatrices y creamos una matriz resultante*/
        String[][] resultado = unirMatrices(matriz1, matriz2, filas1, filas2, columnas1, columnas2);

        /*Si no coincidían las condiciones, no devolvíamos nada*/
        System.out.println();
        if (resultado.length == 1) {
            System.out.println("{ }");
        }
        /*Si coincidían en condiciones, se muestra en pantalla la matriz bidimensional resultante*/
        else {
            for (int i = 0; i<filas1; i++) {
                for (int j = 0; j<columnas1+columnas2; j++) {
                    contador++;

                    if (contador == columnas1+columnas2) {
                        System.out.println(resultado[i][j]);
                        contador = 0;
                    } else {
                        System.out.print(resultado[i][j]+", ");
                    }
                }
            }
        }
    }
    /*Definición de la función unirMatrices*/
    public static String[][] unirMatrices(String[][] matriz1, String[][] matriz2, int filas1, int filas2, int columnas1, int columnas2) {
        /*Creamos una nueva matriz que se le añadirá el doble de columnas para añadir la segunda matriz*/
        String[][] matriz3 = new String[filas1][columnas1 + columnas2];
        String[][] vacio = {{" "}};

        if (filas1 != filas2 || columnas1 != columnas2) {
            return vacio;
        }
        /*Cuando coinciden en filas y columnas, comenzamos a añadir los elementos de ambas matrices*/
        else {
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1 + columnas2; j++) {
                    /*Indicamos una condición que establece que si j es menor que el valor de las columnas
                    de la primera matriz, iremos añadiendo los elementos de la primera matriz*/
                    if (j < columnas1) {
                        matriz3[i][j] = matriz1[i][j];
                    }
                    /*Si llega al valor de las columnas de la primera matriz, añadiremos ahora los elementos
                    de la segunda matriz. se resta j - columnas1 para no romper el límite y no dar error*/
                    else {
                        matriz3[i][j] = matriz2[i][j - columnas1];
                    }
                }
            }
        }

        /*Returnamos la matriz resultante*/
        return matriz3;
    }
}
