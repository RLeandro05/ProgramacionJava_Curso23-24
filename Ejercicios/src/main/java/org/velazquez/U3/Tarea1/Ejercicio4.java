package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void MAYOR(int n1, int n2) {
        int mayor = Math.max(n1, n2);

        if (mayor == n1) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        MAYOR(n1, n2);
    }
}
