package org.velazquez.U3.Tarea1;

public class Ejercicio12 {
    public static void main(String[] args) {
        int n = 5;
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es " + resultado);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
