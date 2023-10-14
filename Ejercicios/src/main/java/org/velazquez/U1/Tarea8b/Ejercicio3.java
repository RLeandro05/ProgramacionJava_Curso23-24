package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma;
        int num1= 0;
        int num2 = 1;

        System.out.println("Por favor, introduce el máximo número de serie: ");
        n = sc.nextInt();
        System.out.print("0");

        for (int i = 1;i<=(n-1);i++) {

            suma = num1 + num2;
            num2 = num1;
            num1 = suma;

            System.out.print(", "+suma);
        }
    }
}
