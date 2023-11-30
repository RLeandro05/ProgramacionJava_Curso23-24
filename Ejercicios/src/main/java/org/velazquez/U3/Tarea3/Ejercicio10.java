package org.velazquez.U3.Tarea3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        /*Declaración de variables*/
        int n = 5;

        int[] cadena = new int[n];

        /*Llamamos a la función con el retorno*/
        int resultado = rellenaPares(cadena, n);

        System.out.println("Has desechado "+resultado+" números impares");
    }
    /*Declaración de la función*/
    static int rellenaPares(int[] cadena, int n) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        /*Tecleamos los números en el array*/
        for (int i = 0; i<n; i++) {
            System.out.println("Introduce un número: ");
            cadena[i] = sc.nextInt();

            /*Establecemos una condición que establece que si llega a ser impar, se vuelva a poner uno nuevo
            y se cuente en el contador como número impar desechado*/
            if (cadena[i]%2 == 1) {
                contador++;
                i--;
            }
        }

        /*Returnamos el número de impares desechados*/
        return contador;
    }
}
