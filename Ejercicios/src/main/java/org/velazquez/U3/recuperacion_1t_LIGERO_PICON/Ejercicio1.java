package org.velazquez.U3.recuperacion_1t_LIGERO_PICON;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Introducimos la longitud del array unidimensional*/
        System.out.println("Introduzca la longitud del array unidimensional: ");
        int longitud = sc.nextInt();

        /*Creamos el array unidimensional con la longitud proporcionada*/
        int[] a = new int[longitud];

        /*Introducimos elementos aleatorios por teclado en el array*/
        System.out.println("Introduzca los elementos en el array: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }

        /*Mostramos el array en pantalla*/
        for (int i = 0; i<a.length; i++) {
            if (i == a.length-1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i]+", ");
            }
        }

        System.out.println();

        /*Hacemos un llamamiento del resultado de la función aleatorioDeArray*/
        int resultado = aleatorioDeArray(a);

        /*Mostramos el resultado en pantalla*/
        System.out.println("El resultado es: "+resultado);

    }
    /*Definición de la función aleatorioDeArray*/
    public static int aleatorioDeArray(int[] a) {
        /*Ponemos como mínimo la posición 0 y como máximo la longitud máxima a la que llega el array*/
        int min = 0;
        int max = a.length-1;

        /*Poneos un número aleatorio entre 0 y la longitud del array*/
        int aleatorio = (int) (Math.random()*((max+1)-min))+min;

        /*Devolvemos el vqlor resultante en la posición aleatoria reusltante del array*/
        return a[aleatorio];
    }
}
