package org.velazquez.U3.Tarea3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*En toda esta definición de valores mencionamos todas las variables
        que usaremos de cada temática además de estar separada de cada una para
        poder diferenciar bien de qué va cada una*/
        int n = 5;

        int suma = 0;
        int media;

        int contador = 1;

        int pos;
        int suma_al = 0;
        int media_al;

        int[] clase = new int[n];

        /*Se pide la posición del alumno a calcular antes de entrar al bucle*/
        System.out.println("¿De cuál alumno de los 5 quiere calcular la media global de curso?: ");
        pos = sc.nextInt();

        /*Dentro de este bucle el (cual contará los trimestres para no repetirlo 3 veces manualmente),
        tendremos el cálculo de medias de clase de los tres trimestres*/
        for (int z = 1; z<=3; z++) {
            /*Dentro de este pequeño for, se pasa posición por posición preguntando
            la nota de cada alumno para luego ir a la suma de notas y posteriormente a la media total*/
            for (int i = 0; i<n; i++) {
                System.out.println("Introduzca la nota del siguiente alumno del trimestre "+contador+": ");
                clase[i] = sc.nextInt();

                /*Indicamos en este if que si la posición es justamente el alumno del cual
                queremos saber su media global, calcularemos además de la media de clase,
                su nota personal de curso*/
                if (i == pos) {
                    suma_al = suma_al + clase[i];
                }
                suma = suma+clase[i];
            }
            /*Al final del segundo for, indicamos la media y la mostramos por pantalla*/
            media = suma/n;

            System.out.println();
            System.out.println("La media de clase del trimestre "+contador+" es: ");
            System.out.println(media);
            /*No olvidarse de poner de nuevo la suma en 0, ya que seguirá sumando desde donde lo dejó*/
            suma = 0;

            /*Este contador es por estética para indicar el número de trimestre*/
            contador++;
        }

        /*Al final del for principal, se mostrará por pantalla la media global del alumno escogido*/
        System.out.println();
        media_al = suma_al/3;
        System.out.println("La media global del alumno "+pos+" es: "+media_al);


    }
}
