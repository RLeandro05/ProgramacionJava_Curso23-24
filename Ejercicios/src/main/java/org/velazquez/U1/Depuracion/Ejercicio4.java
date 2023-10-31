package org.velazquez.U1.Depuracion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el número: ");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número "+num+" es primo");
        } else {
            System.out.println("El número "+num+" no es primo");
        }
    }
    public static boolean esPrimo(int num) {

        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
