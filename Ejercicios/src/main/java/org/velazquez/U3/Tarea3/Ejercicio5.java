package org.velazquez.U3.Tarea3;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;

        /*Establecemos los números a ordenar de cada tabla de las cadenas*/
        int[] prueba = new int[n];

        System.out.println("TABLA 1: ");
        for (int i = 0; i<n; i++) {
            prueba[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("TABLA 2: ");
        int[] prueba2 = new int[n];

        for (int i = 0; i<n; i++) {
            prueba2[i] = sc.nextInt();
        }

        /*En este Arrays.sort nos encargamos de ordenar la primera tabla
        de array en orden ascendente
         */
        Arrays.sort(prueba);
        //Luego, mostramos la ordenación hecha
        System.out.println("TABLA 1: ");
        for (int i = 0; i<n; i++) {
            System.out.print(prueba[i]+", ");
        }
        System.out.println();


        /*En este segundo Arrays.sort ordenamos la segunda tabla de array
        en orden ascendente también
         */
        Arrays.sort(prueba2);
        //Luego, mostramos tabién la ordenación hecha
        System.out.println("TABLA 2: ");
        for (int i = 0; i<n; i++) {
            System.out.print(prueba2[i]+", ");
        }

        /*Dentro de este enorme for ordenaremos de manera manual ambas tablas
        haciendo comparaciones entre cada posición para así sacarla de manera
        ordenada sin tener que hacero con alguna función
         */
        System.out.println();
        System.out.println("TABLA MEZCLADA: ");
        //Sacamos dos variables que indicarán la posición por separado de cada tabla
        int j = 0;
        int k = 0;
        for (int i = 0;i<n*2; i++) {
            /*En esta condición es importante que ambas posiciones
            * sean menores a la longitud para que no de error de compìlación*/
            if (j<prueba.length && k<prueba.length) {
                /*Si se cumple, indicamos que si una posición es menor que otra
                * se imprima dicha posición y vaya a la siguiente posición de la tabla
                * correspondiente después de imprimir el número*/
                if (prueba[j]<prueba2[k]) {
                    System.out.print(prueba[j]+", ");
                    j++;
                } else {
                    System.out.print(prueba2[k]+", ");
                    k++;
                }
            }
            /*Si no se llega a cumplir la condición, ya sabemos que una de las dos
            tablas llegó a su fin, por tanto, hay que ser cuidadosos en esta parte
            para que no de error*/
            else {
                /*Indicamos que si fue la tabla j la que llegó a su fin, que siga imprimiendo
                * la tabla j hasta llegar a su fin para romper el for principal*/
                if (j>=n) {
                    if (k<prueba.length) {
                        System.out.print(prueba2[k]+", ");
                        k++;
                    } else {
                        break;
                    }
                }
                /*Si no fue la tabla j y fue la tabla k, repetimos el mismo proceso que antes
                * pero esta vez con la tabla j imprimiéndose, para luego romper el for
                * principal*/
                if (k>=n) {
                    if (j<prueba.length) {
                        System.out.print(prueba[j]+", ");
                        j++;
                    } else {
                        break;
                    }
                }
            }
        }


    }
}
