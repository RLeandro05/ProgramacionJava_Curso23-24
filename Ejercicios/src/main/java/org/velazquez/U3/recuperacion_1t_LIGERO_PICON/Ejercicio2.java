package org.velazquez.U3.recuperacion_1t_LIGERO_PICON;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Introducimos la longitud del vector*/
        System.out.println("Introduzca la longitud del vector: ");
        int longitud = sc.nextInt();

        /*Creamos el vector con la longitud antes proporcionada*/
        int[] a = new int[longitud];

        /*Implementamos en él valores aleatorios por teclado*/
        System.out.println("Introduzca elementos aleatorios en el vector: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        /*Mostramos el vector en pantalla*/
        for (int i = 0; i<a.length; i++) {
            if (i == a.length-1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i]+", ");
            }
        }

        /*Introducimos qué valor queremos implementar en el vector*/
        System.out.println("Introduzca un valor que quieras implementar en el vector: ");
        int valor = sc.nextInt();

        /*Introducimos la posición donde queremos añadir el valor. Si se pasa, devuelve el mismo vector tras pasar por la función*/
        System.out.println("Introduzca la posición donde quieres añadirlo: ");
        int pos = sc.nextInt();

        /*Hacemos un llamamiento a la función insertarValor y creamos un array con el resultado*/
        int[] resultado = insertarValor(a, valor, pos);
        /*Mostramos el resultado en pantalla*/
        for (int i = 0; i<resultado.length; i++) {
            if (i == resultado.length-1) {
                System.out.println(resultado[i]);
            } else {
                System.out.print(resultado[i]+", ");
            }
        }
    }
    /*Definición de la función insertarValor*/
    public static int[] insertarValor(int[] a, int valor, int pos) {
        /*Creamos un nuevo vector con uno más de longitud para añdir el valor*/
        int[] b = new int[a.length+1];

        /*Si la posición donde queremos añadir el valor se pasa de la longitud del vector original, devolvemos el mismo vector original sin cambio alguno*/
        if (pos >= a.length) {
            System.out.println("ERROR");
            return a;
        }
        /*En caso contrario, comenzamos a añdir el valor*/
        else {
            /*Añadimos los elementos del vector a al vector b y añadimos una posición más con un cero*/
            for (int i = 0; i<b.length; i++) {
                if (i == a.length) {
                    b[i] = 0;
                } else {
                    b[i] = a[i];
                }
            }

            /*Creamos un auxiliar para poder intercambiar el número de la posición donde queremos añadir el valor por el cero y luego añadimos el valor*/
            int aux = 0;
            for (int i = 0; i<b.length; i++) {
                if (i == pos) {
                    aux = b[i];
                    b[i] = valor;
                }
                if (i == b.length-1) {
                    b[i] = aux;
                }
            }
        }

        /*Returnamos el vector resultado con el valor implementado en la posición correcta*/
        return b;
    }
}
