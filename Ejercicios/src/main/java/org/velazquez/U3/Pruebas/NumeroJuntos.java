package org.velazquez.U3.Pruebas;

import java.util.Scanner;

public class NumeroJuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un primer número: ");
        long n1 = sc.nextLong();

        System.out.println("Escribe un segundo número: ");
        long n2 = sc.nextLong();

        System.out.println("Escribe nuevamente un primer número: ");
        long n3 = sc.nextLong();

        System.out.println("Escribe nuevamente un segundo número: ");
        long n4 = sc.nextLong();

        long numerosjuntos1 = juntaNumeros(n1, n2);
        System.out.println("El resultado de juntar " + n1 + " y " + n2 + " es: " + numerosjuntos1);

        long numerosjuntos2 = juntaNumeros(n3, n4);
        System.out.println("El resultado de juntar 987 y 654 es: " + numerosjuntos2);
    }

    public static long juntaNumeros(long a, long b) {
        // Convertir b a un número de la misma magnitud que a
        long magnitud = 1;
        while (magnitud <= a) {
            magnitud *= 10;
        }

        // Unir los dos números
        return a * magnitud + b;
    }
}
