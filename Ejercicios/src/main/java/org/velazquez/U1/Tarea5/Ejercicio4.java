package org.velazquez.U1.Tarea5;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un primer número entero: ");
        int n1 = teclado.nextInt();

        System.out.println("Por favor, introduce un segundo número entero: ");
        int n2 = teclado.nextInt();

        int contador = 0;

        if (n1%2 == 0) {
            System.out.println(n1+ " es par" );
            contador ++;
        }
        else {
            System.out.println(n1+ " es impar" );
        }

        if (n2%2 == 0) {
            System.out.println(n2+ " es par" );
            contador ++;
        }
        else {
            System.out.println(n2+ " es impar" );
        }

        System.out.println("Hay en total: "+contador+" números pares");





    }
}
