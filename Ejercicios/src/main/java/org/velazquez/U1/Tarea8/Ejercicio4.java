package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int numero_1 = 0;
        System.out.println("Inserte un número entero: ");
        n = sc.nextInt();

        while (numero_1 != n) {
            numero_1++;
            System.out.println(numero_1);
        }
    }
}
