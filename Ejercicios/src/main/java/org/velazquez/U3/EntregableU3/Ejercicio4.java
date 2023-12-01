package org.velazquez.U3.EntregableU3;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Escribimos la frase*/
        String frase = "Hola que tal estás hoy martes?";

        /*Indicamos un array de caracteres el cual se usará como carnada para llamar a la función matriLetras*/
        char[][] frasef = matrizLetras(frase);

    }
    /*Declaración de la función matrizLetras*/
    static char[][] matrizLetras(String frase) {
        /*Declaramos la variable de longitud y la incorporamos a las dimensiones del array bidimensional*/
        int n = 5;
        char[][] matrizCaracteres = new char[n][n];

        /*En este for quitamos los espacios en blanco de la frase original e indicamos que
        cada posición de la matriz contendrá el siguiente caracter de la frase*/
        for (int i = 0; i < matrizCaracteres.length; i++) {
            for (int j = 0; j < matrizCaracteres[i].length; j++) {
                String frase_aux = frase.replaceAll(" ","");
                matrizCaracteres[i][j] = frase_aux.charAt(i * matrizCaracteres[i].length + j);
            }
        }

        /*En este for, una vez guardada la frase en la matriz, se imprime y se muestra en pantalla*/
        for (int i = 0; i < matrizCaracteres.length; i++) {
            for (int j = 0; j < matrizCaracteres[i].length; j++) {
                System.out.print(matrizCaracteres[i][j]);
            }
            System.out.println();
        }

        /*Se devuelve la matriz de caracteres*/
        return matrizCaracteres;
    }
}
