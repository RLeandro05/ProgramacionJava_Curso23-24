package org.velazquez.U3.Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Establecemos todos los parámetros a usar
        int n;

        double positivo = 0;
        int cont_positivo = 0;

        double negativo = 0;
        int cont_negativo = 0;

        int cont_cero = 0;

        //Introducimos la longitud de la cadena
        System.out.println("Introduzca la longitud de la cadena: ");
        n = sc.nextInt();

        int[] datos = new int[n];

        /*En este bucle for después de introducir un número en cada posición de la cadena,
        indicamos según cada condición, hacer la media de positivos, negativos o conteo de ceros
        */
        for (int i = 0; i<n; i++) {
            System.out.println("Introduzca un número: ");
            datos[i] = sc.nextInt();

            System.out.println();

            if (datos[i] > 0){
                positivo = positivo + datos[i];
                cont_positivo++;
            }
            if (datos[i] < 0) {
                negativo = negativo + datos[i];
                cont_negativo++;
            }
            if (datos[i] == 0) {
                cont_cero++;
            }
        }

        /*AL final, se hace la media de ambos además del conteo de ceros y se muestra
        en pantalla el resultado*/
        double positivo_total = positivo/cont_positivo;
        double negativo_total = negativo/cont_negativo;

        System.out.println("La media de positivos es: "+Math.ceil(positivo_total*100)/100);
        System.out.println("La media de negativos es: "+Math.ceil(negativo_total*100)/100);
        System.out.println("El número de ceros es: "+cont_cero);
    }
}
