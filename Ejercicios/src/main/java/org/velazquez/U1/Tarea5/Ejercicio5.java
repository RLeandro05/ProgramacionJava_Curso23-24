package org.velazquez.U1.Tarea5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un primer número entero largo");
        int n1 = teclado.nextInt();

        System.out.println("Por favor, introduce un segundo número entero largo");
        int n2 = teclado.nextInt();

        System.out.println("Por favor, introduce un tercer número entero largo");
        int n3 = teclado.nextInt();

        if (n1>n2) {
            if (n1>n3) {
                System.out.println(n1+" es el número más grande");
            }
            else {
                System.out.println(n3+" es el número más grande");
            }

        }
        else {
            if (n2>n3) {
                System.out.println(n2+" es el número más grande");
            }
            else {
                System.out.println(n3+" es el número más grande");
            }
        }
    }
}
