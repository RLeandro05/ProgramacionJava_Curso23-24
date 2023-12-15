package org.velazquez.U3.recuperacion_1t_LIGERO_PICON;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Establecemos la posición del rey*/
        System.out.println("Introduzca la posición del rey: ");
        String posRey = sc.next();

        /*Establecemos la posición de la reina*/
        System.out.println("Introduzca la posición de la reina: ");
        String posReina = sc.next();

        /*Hacemos un llamamiento a la función jaque para saber si la reina hizo jaque o no al rey enemigo*/
        if (jaque(posRey, posReina)) {
            System.out.println("JAQUE");
        } else {
            System.out.println("NO JAQUE");
        }
    }
    /*Definición de la función jaque*/
    public static boolean jaque(String posRey,String posReina) {
        int filas = 8;
        int columnas = 8;

        /*Definimos el tablero*/
        String[][] tablero = {{"a8","b8","c8","d8","e8","f8","g8","h8"},
                              {"a7","b7","c7","d7","e7","f7","g7","h7"},
                              {"a6","b6","c6","d6","e6","f6","g6","h6"},
                              {"a5","b5","c5","d5","e5","f5","g5","h5"},
                              {"a4","b4","c4","d4","e4","f4","g4","h4"},
                              {"a3","b3","c3","d3","e3","f3","g3","h3"},
                              {"a2","b2","c2","d2","e2","f2","g2","h2"},
                              {"a1","b1","c1","d1","e1","f1","g1","h1"}};

        /*Buscamos las posiciones que según la condición, sea una posición a mover de la reina*/
        for (int i = filas-1; i>0; i--) {
            for (int j = 0; j<columnas; j++) {
                if ((i-j)%2 == 0 || (i+j)%2 == 0 || (i+j)%2 == 1 || i == j-2) {
                    System.out.print(tablero[i][j]+", ");
                }
            }
        }

        return true;
    }
}
