package org.velazquez.U1.Tarea6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("1;Par");
        } else {
            System.out.println("0;Impar");
        }

        System.out.println("Introduzca un segundo número: ");
        int n2 = sc.nextInt();
        int par;

        par = n2%2 == 0 ? 1 : 0;

        System.out.println(par);
    }
}
