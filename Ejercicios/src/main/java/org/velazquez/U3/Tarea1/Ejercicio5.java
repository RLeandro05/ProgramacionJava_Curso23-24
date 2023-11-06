package org.velazquez.U3.Tarea1;

public class Ejercicio5 {
    public static int mayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int mayor = mayor(a, b, c);

        System.out.println("El mayor es: " + mayor);
    }
}
