package org.velazquez.U3.Tarea4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Establecemos todas las variables a usar*/
        int n = 100;

        int contador = 1;

        int min_aux = 1000;
        int max_aux = 0;

        int[] lista = new int[n];

        int min = 0;
        int max = 500;

        /*En este for, se ponen en el array números aleatorios entre 0 y 500*/
        for (int i = 0; i<n; i++) {
            lista[i] = (int) (Math.random()*((max+1)-min))+min;

            System.out.print(lista[i]+", ");
            /*Este paso es por estética*/
            contador++;
            if (contador==10) {
                contador=1;
                System.out.println();
            }
        }

        /*Indicamos cuál de los números quiere destacar con asteriscos*/
        System.out.println();
        System.out.println("¿Qué número quiere destacar?(1.Mínimo/2.Máximo)");
        int eleccion = sc.nextInt();

        if (eleccion == 1) {
            /*En el caso de ser el mínimo, indicamos que si el siguiente número es menor al otro,
            se convierte en el nuevo mínimo*/
            for (int i = 0; i<n; i++) {
                if (lista[i]<min_aux) {
                    min_aux=lista[i];
                }
            }
            /*Por consiguiente, se establece un for donde imprime nuevamente la lista de números,
            pero destacando el mínimo*/
            for (int i = 0; i<n; i++) {
                if (lista[i] == min_aux) {
                    System.out.print("**"+lista[i]+"**, ");
                } else {
                    System.out.print(lista[i]+", ");
                }
                contador++;
                if (contador==10) {
                    contador=1;
                    System.out.println();
                }
            }
        } else {
            /*En el caso de ser el máximo, indicamos que si el siguiente número es mayor al otro,
            se convierte en el nuevo máximo*/
            for (int i = 0; i<n; i++) {
                if (lista[i]>max_aux) {
                    max_aux=lista[i];
                }
            }
            /*Por consiguiente, se establece un for donde imprime nuevamente la lista de números,
            pero destacando el máximo*/
            for (int i = 0; i<n; i++) {
                if (lista[i] == max_aux) {
                    System.out.print("**"+lista[i]+"**, ");
                } else {
                    System.out.print(lista[i]+", ");
                }
                contador++;
                if (contador==10) {
                    contador=1;
                    System.out.println();
                }
            }
        }
    }
}
