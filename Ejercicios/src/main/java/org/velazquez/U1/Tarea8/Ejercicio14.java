package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i;
        int j;

        System.out.println("Por favor, intrduzca el número máximo de lado: ");
        n = sc.nextInt();

        for (i=1;i<=n;i++) {
            for (j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}

