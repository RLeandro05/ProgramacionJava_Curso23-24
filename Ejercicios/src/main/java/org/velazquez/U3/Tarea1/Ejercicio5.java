package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void MAYOR(int n1, int n2, int n3) {
        int mayor = Math.max(Math.max(n1, n2), n3);

        System.out.println(mayor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        MAYOR(n1, n2, n3);
    }
}
