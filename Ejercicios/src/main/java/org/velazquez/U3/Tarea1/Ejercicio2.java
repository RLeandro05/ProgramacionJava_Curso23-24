package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void serie(int i, int n) {
        while (i != n-1) {
            i++;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int n = sc.nextInt();

        serie(i, n);
    }
}
