package org.velazquez.U3.Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        //Introducimos la longitud de la cadena
        System.out.println("Establezca la longitud de la cadena: ");
        n = sc.nextInt();

        int[] datos = new int[n];

        //Se introduce un bucle for para añadir los números a la cadena
        for (int i = 0; i<n; i++) {
            System.out.println("Introduzca un número: ");
            datos[i] = sc.nextInt();
        }

        /*En este bucle ponemos al revés las condiciones. Como
        la i equivale a las posiciones, entonces empezaremos desde el último al primero
        como indica el ejercicio*/
        for (int i = n-1; i >= 0; i--) {
            System.out.println("El número "+i+" equivale a: "+datos[i]);
            System.out.println();
        }
    }
}
