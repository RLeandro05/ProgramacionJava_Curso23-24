package org.velazquez.U3.LIGERO_PICON_EXAMENU3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        int pos;

        /*Pedimos la longitud del primer vector*/
        System.out.println("Inserte la longitud del primer vector: ");
        int vector1 = sc.nextInt();

        /*Creamos el vector*/
        int[] v1 = new int[vector1];

        /*Introducimos valores enteros aleatorios*/
        System.out.println("Introduce valores en el primer vector: ");
        for (int i = 0; i<v1.length; i++) {
            v1[i] = sc.nextInt();
        }

        /*Pedimos la longitud del segundo vector*/
        System.out.println("Inserte la longitud del segundo vector: ");
        int vector2 = sc.nextInt();

        /*Creamos el vector*/
        int[] v2 = new int[vector2];

        /*Introducimos valores enteros aleatorios*/
        System.out.println("Introduce valores en el primer vector: ");
        for (int i = 0; i<v2.length; i++) {
            v2[i] = sc.nextInt();
        }

        /*Mostramos en pantalla el primer vector*/
        System.out.print("Vector 1: ");
        for (int i = 0; i<v1.length; i++) {
            contador++;
            if (contador == vector1) {
                System.out.println(v1[i]);
                contador = 0;
            } else {
                System.out.print(v1[i]+", ");
            }
        }

        System.out.println();

        /*Hacemos lo mismo con el segundo vector*/
        System.out.print("Vector 2: ");
        for (int i = 0; i<v2.length; i++) {
            contador++;
            if (contador == vector2) {
                System.out.println(v2[i]);
                contador = 0;
            } else {
                System.out.print(v2[i]+", ");
            }
        }

        System.out.println();

        /*Introducimos la posición donde queremos añadir el segundo vector al primero*/
        System.out.println("Introduce la posición: ");
        pos = sc.nextInt();

        /*Dependiendo del resultado que salga, nos devolverá un resultado u otro*/
        int[] resultado = insertarEnVector(v1, v2, pos);

        contador = 0;
        /*Mostramos el resultado en pantalla*/
        for (int i = 0; i<resultado.length; i++) {
            contador++;
            if (contador == resultado.length) {
                System.out.println(resultado[i]);
                contador = 0;
            } else {
                System.out.print(resultado[i]+", ");
            }
        }
    }
    /*Declaración de la función insertarEnVector*/
    public static int[] insertarEnVector(int[] v1, int [] v2, int pos) {
        int j = 0;
        /*La primera condición indica que si la posición es menor a 0, returnamos solo el primer vector como resultado*/
        if (pos < 0) {
            return v1;
        }
        /*La segunda condición indica que si la posición es mayor a la longitud del primr vector, returnamos solo el segundo vector como resultado*/
        if (pos > v1.length) {
            return v2;
        }
        /*La tercera condición indica que si la posición es igual  la longitud del primer vector, returnamos el primer y segundo vector en orden. Primero el primer vector, y luegop el segundo*/
        if (pos == v1.length) {
            int[] v3 = new int[v1.length+v2.length];

            for (int i = 0; i<v1.length+v2.length; i++) {
                if (i < v1.length) {
                    v3[i] = v1[i];
                } else {
                    v3[i] = v2[j];
                    j++;
                }
            }

            return v3;
        }

        /*En caso de que no se cumplan, pasamos a la principal*/
        int k = 0;
        /*Creamos un nuevo vector que tendrá de longitud la suma de ambos vectores iniciales*/
        int[] v4 = new int[v1.length+v2.length];

        for (int i = 0; i<v4.length; i++) {
            /*Si la posición es la indicada, empezamos a añadir los números del segundo vector, para luego seguir con los del primer vector*/
            if (i == pos) {
                for (int z = 0; z<v2.length; z++) {
                    v4[i] = v2[z];
                    i++;
                }
                i--;
            } else {
                v4[i] = v1[k];
                k++;
            }
        }

        /*Returnamos el vector como resultado*/
        return v4;
    }
}
