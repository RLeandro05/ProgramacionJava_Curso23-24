package org.velazquez.U3.EntregableU3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Declaración de variables para su uso*/
        int n;

        int min = 18;
        int max = 65;


        /*Declaración de la longitud de la cadena array*/
        System.out.println("Introduzca el largo de la cadena de números: ");
        n = sc.nextInt();

        int[] cadena = new int[n];

        /*Invocamos a la función paresImpares*/
        int[] resultado = paresImpares(cadena, n, min, max);

        /*Después de traer el resultado, lo mostramos en pantalla*/
        for (int i = 0; i<n; i++) {
            System.out.print(resultado[i]+", ");
        }
    }
    /*Declaración de la función paresImpares*/
    static int[] paresImpares(int[] cadena, int n, int min, int max) {

        /*Primero decidimos mostrar los números de la cadena original*/
        for (int i = 0; i<n; i++) {
            cadena[i] = (int) (Math.random()*((max+1)-min))+min;
            System.out.print(cadena[i]+", ");
        }
        System.out.println();
        /*En este for se modificará la cadena*/
        for (int i = 0; i<n; i++) {
            /*Indicamos una condición que establece que si el número actual es impar entraremos a otro for
            para encontrar un número par que se cambie de posiciones con él*/
            if (cadena[i]%2 == 1) {
                /*En este for la j será igual a i para que no vuelva a utilizar las primeras posiciones*/
                for (int j = i; j<n; j++) {
                    /*Indicamos una condición la cual establece que si el número es par, lo intercambiamos por el número impar
                    que teníamos anteriormente escogido en la cadena del for anterior haciendo uso de una auxiliar para ello*/
                    if (cadena[j]%2 == 0) {
                        int aux = cadena[j];
                        cadena[j] = cadena[i];
                        cadena[i] = aux;
                        break;
                    }
                }
            }
        }

        /*Returnamos el valor de la cadena arreglada*/
        return cadena;
    }
}
