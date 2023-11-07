package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio11B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int a;

        System.out.println("Ingrese un número de base: ");
        n = sc.nextInt();

        System.out.println("Ingrese un número de exponente");
        a = sc.nextInt();

        double resultado = potencia(n , a);

        System.out.println("El resultado es: "+resultado);
    }
    public static double potencia(int n, int a) {
        if (a == 0) {
            return 1;
        } else {
            return n * potencia(n, a-1);
        }
    }
}
