package org.velazquez.U3.Pruebas;

import java.util.Scanner;

public class Unir_Vectores_No_Repetidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Pedimos primero la longitud del vector*/
        System.out.println("Introduce el tamaño del primer vector:");
        /*Creamos el array con las dimensiones dadas*/
        int[] v1 = new int[sc.nextInt()];
        /*Vamos añadiendo los elementos que queramos*/
        System.out.println("Introduce los elementos del primer vector:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = sc.nextInt();
        }

        /*Realizamos los mismos pasos con el segundo vector*/
        System.out.println("Introduce el tamaño del segundo vector:");
        int[] v2 = new int[sc.nextInt()];
        System.out.println("Introduce los elementos del segundo vector:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = sc.nextInt();
        }

        /*Haremos un llamamiento a la función unirSinRepetidos y lo metemos en un array de resultado*/
        int[] resultado = unirSinRepetidos(v1, v2);

        /*Mostraremos el resultado en pantalla del vector sin números repetidos*/
        System.out.println("El vector resultante es:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
    /*Definición de la función esta*/
    public static boolean esta(int[] vector, int num) {
        /*Creamos un for donde nos aseguramos que exista el elemento en el array unidimensional*/
        for (int i : vector) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
    /*Definición de la función unirSinRepetidos*/
    public static int[] unirSinRepetidos(int[] v1, int[] v2) {
        /*Creamos un tecer vector en el cual uniremos ambos vectores*/
        int[] v3 = new int[v1.length + v2.length];
        int contador = 0;

        /*En este for indicamos que si el elemento no está en v3, se añade y aumenta el contador */
        for (int i : v1) {
            if (!esta(v3, i)) {
                v3[contador++] = i;
            }
        }

        /*Este for funciona igual, pero en el segundo vector*/
        for (int i : v2) {
            if (!esta(v3, i)) {
                v3[contador++] = i;
            }
        }

        /*Por último, creamos un vector con los elementos correctos y los copiamos*/
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = v3[i];
        }
        /*Returnamos el resultado*/
        return resultado;
    }
}
