package org.velazquez.U1.Tarea5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un número entero: ");
        int n1 = teclado.nextInt();

        if (n1 > 0) {
            System.out.println(n1+ " es mayor que 0" );
        }
        else {
            System.out.println(n1+ " es menor que 0" );
        }


    }
}
