package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p1 = sc.next();
        String p2 = sc.next();

        if (p1.length() < p2.length()) {
            System.out.println(p1+" es más corto con "+p1.length()+" letras");
        } else {
            System.out.println(p2+" es más corto con "+p2.length()+" letras");

        }
    }
}
