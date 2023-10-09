package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();

        while (n!=0) {

            if (n%2 == 0) {
                System.out.println(n+" es par");
            }
            else {
                System.out.println(n+" es impar");
            }

            System.out.println("Su cuadrado es: "+n*n);

            if (n>0) {
                System.out.println(n+" es positivo");
                n--;
            }
            else {
                System.out.println(n+" es negativo");
                n++;
            }

        }

        System.out.println(n+" ya es 0");
    }
}
