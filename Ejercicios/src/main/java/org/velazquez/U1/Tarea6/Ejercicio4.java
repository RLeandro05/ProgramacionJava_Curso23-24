package org.velazquez.U1.Tarea6;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        byte n = sc.nextByte();
        System.out.println("Introduzca un segundo número: ");
        byte m = sc.nextByte();


        if (n<m) {
            System.out.println(n+" es menor que "+m);
        }else {
            System.out.println(m+" es menor que "+n);
        }

        System.out.println("Introduzca un número: ");
        byte n1 = sc.nextByte();
        System.out.println("Introduzca un segundo número: ");
        byte m1 = sc.nextByte();

        byte menor;

        menor = n1<m1 ? n1 : m1;

        System.out.println(menor);
    }
}
