package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int n2;

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        System.out.println("Introduzca un segundo número: ");
        n2 = sc.nextInt();

        divisoresPrimos(n, n2);
    }
    public static void divisoresPrimos(int n, int n2) {
        int suma = 0;
        int suma2 = 0;

        System.out.println();
        System.out.print("Divisores de "+n+" sin contar a él mismo: ");

        for (int i = 1; i <= n-1; i++) {
            if (n%i == 0) {
                System.out.print(i+", ");
                suma+=i;
            }
        }
        System.out.println();
        System.out.println("La suma de sus divisores es: "+suma);
        System.out.println();

        System.out.print("Divisores de "+n2+" sin contar a él mismo: ");
        for (int j = 1; j <= n2-1; j++) {
            if (n2%j == 0) {
                System.out.print(j+", ");
                suma2+=j;
            }
        }
        System.out.println();
        System.out.println("La suma de sus divisores es: "+suma2);
        System.out.println();

        if (suma == n2 && suma2 == n) {
            System.out.println("Ambas sumas equivalen a ambos números, por tanto, son amigos");
        } else {
            System.out.println("Ninguna de las sumas equivalen a ambos números, por tanto, no son amigos");
        }

    }
}
