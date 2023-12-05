package org.velazquez.U3.LIGERO_PICON_EXAMENU3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Declaración de las variables a usar*/
        int n = 50;

        int min = 14;
        int max = 78;
        int contador = 0;

        /*Pedimos las dimensiones de las filas y columnas*/
        System.out.println("Inserte la dimensión de las filas: ");
        int filas = sc.nextInt();

        System.out.println("Inserte la dimensión de las columnas: ");
        int columnas = sc.nextInt();

        /*A partir de las dimensiones dadas, creamos el array bidimensional*/
        int[][] tabla = new int[filas][columnas];

        /*Luego, creamos los arrays para los pares e impares*/
        int[] pares = new int[n];
        int pa = 0;

        int[] impares = new int[n];
        int im = 0;

        /*Mostramos en este for la tabla completa con números aleatorios*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                tabla[i][j] = (int) (Math.random()*((max+1)-min)) + min;

                contador++;
                if (contador == columnas) {
                    System.out.println(tabla[i][j]);
                    contador = 0;
                } else {
                    System.out.print(tabla[i][j]+", ");
                }
            }
        }

        /*Declaramos de nuevo un for para pasar por la tabla bidimensional, pero esta vez recogiendo los números pares e impares en sus respectivos arrays*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                if (tabla[i][j]%2 == 0) {
                    pares[pa] = tabla[i][j];
                    pa++;
                } else {
                    impares[im] = tabla[i][j];
                    im++;
                }
            }
        }

        int suma_pares = 0;
        int contador_pares = 0;
        int min_aux_par = 1000;
        int max_aux_par = 0;
        /*Declaramos un for donde mostramos el array de pares*/
        System.out.println();
        System.out.println("Array de pares: ");
        contador = 0;
        for (int i = 0; i<n; i++) {
            contador++;
            if (contador == n) {

                if (pares[i] > 0) {
                    System.out.println(pares[i]);
                    contador = 0;
                    suma_pares += pares[i];
                    contador_pares++;
                }

                if (pares[i] < min_aux_par && pares[i] != 0) {
                    min_aux_par = pares[i];
                }

                if (pares[i] > max_aux_par) {
                    max_aux_par = pares[i];
                }
            } else {

                if (pares[i] > 0) {
                    System.out.print(pares[i]+", ");
                    suma_pares += pares[i];
                    contador_pares++;
                }

                if (pares[i] < min_aux_par && pares[i] != 0) {
                    min_aux_par = pares[i];
                }

                if (pares[i] > max_aux_par) {
                    max_aux_par = pares[i];
                }
            }
        }

        System.out.println();
        System.out.println("La suma de pares es: "+suma_pares);

        double media_pares = suma_pares/contador_pares;
        System.out.println("La media de pares es: "+media_pares);

        System.out.println("El mínimo de los pares: "+min_aux_par);

        System.out.println("El máximo de los pares: "+max_aux_par);

        int suma_impares = 0;
        int contador_impares = 0;
        int min_aux_impares = 1000;
        int max_aux_impares = 0;
        /*Declaramos un for donde mostramos el array de impares*/
        System.out.println();
        System.out.println("Array de impares: ");
        contador = 0;
        for (int i = 0; i<n; i++) {
            contador++;
            if (contador == n) {

                if (impares[i] > 0) {
                    System.out.println(impares[i]);
                    contador = 0;
                    suma_impares += impares[i];
                    contador_impares++;
                }

                if (impares[i] < min_aux_impares && impares[i] != 0) {
                    min_aux_impares = impares[i];
                }

                if (impares[i] > max_aux_impares) {
                    max_aux_impares = impares[i];
                }
            } else {

                if (impares[i] > 0) {
                    System.out.print(impares[i]+", ");
                    suma_impares += impares[i];
                    contador_impares++;
                }

                if (impares[i] < min_aux_impares && impares[i] != 0) {
                    min_aux_impares = impares[i];
                }

                if (impares[i] > max_aux_impares) {
                    max_aux_impares = impares[i];
                }
            }
        }

        System.out.println();
        System.out.println("La suma de impares es: "+suma_impares);

        double media_impares = suma_impares/contador_impares;
        System.out.println("La media de impares es: "+media_impares);

        System.out.println("El mínimo de los impares: "+min_aux_impares);

        System.out.println("El máximo de los impares es: "+max_aux_impares);
    }
}
