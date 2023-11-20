package org.velazquez.U3.Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Establecemos una longitud a la cadena. Preferiblemente con constante
        int longitud = 5;

        //Definimos la cadena como números enteros que tenga de máximo la longitud anterior
        int[] datos = new int[longitud];

        //Dentro del bucle, se indica un número a la posición en concreto de la cadena
        for (int i = 0; i<longitud; i++) {
            System.out.print("Introduce un número: ");
            datos[i] = sc.nextInt();

            System.out.println();
        }

        /*Como en una cadena se guardan todos los números, podemos hacer aparte un for para
        mostrar cada uno de ellos de manera más cómoda*/
        for (int i = 0; i<longitud; i++) {
            System.out.println("El número "+i+" de la cadena vale: "+datos[i]);

            System.out.println();
        }
        System.out.println();
        System.out.println("FINALIZADO");
    }
}
