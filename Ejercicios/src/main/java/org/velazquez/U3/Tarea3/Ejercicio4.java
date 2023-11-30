package org.velazquez.U3.Tarea3;

import java.util.Scanner;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int n_min = 0;
        int n_max = 9;

        //Introducimos la longitud de la cadena
        System.out.println("Introduzca la la longitud de la clave: ");
        n = sc.nextInt();

        int[] clave;
        int[] prueba = new int[n];

        clave = new int[n];

        /*Introducimos en este bucle la clave con números aleatorios, los cuales
        serán grabados en la cadena*/
        for (int i = 0; i<clave.length; i++) {
            int cifra = (int) (Math.random()*((n_max+1)-n_min))+n_min;

            clave[i] = cifra;

            System.out.print(clave[i]);
        }
        System.out.println();

        System.out.println("Ponga la clave dígito por dígito: ");
        //Se hace un bucle el cual funcionará mientras no sena iguales las cadenas
        while (!Arrays.equals(clave,prueba)) {

            //En este for se escribirá la clave que nosotros pondremos
            for (int j = 0; j<prueba.length; j++) {
                prueba[j] = sc.nextInt();
            }

            //Este for servirá de auxiliar para poder comparar cada posición de ambas cadenas
            for (int k = 0; k<clave.length; k++) {
                if (clave[k] == prueba[k]) {
                    System.out.println("El "+prueba[k]+" es igual.");
                }
                if (prueba[k] > clave[k]) {
                    System.out.println("El "+prueba[k]+" es mayor.");
                }
                if (prueba[k] < clave[k]) {
                    System.out.println("El "+prueba[k]+" es menor.");
                }
            }
        }
        System.out.println("¡ACERTASTE!");
    }
}
