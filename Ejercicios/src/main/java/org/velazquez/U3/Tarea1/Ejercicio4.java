package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static int MAYOR(int n1, int n2) {
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        return mayor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int mayor = MAYOR(n1, n2);

        System.out.println("El número mayor es: "+mayor);
    }
}
