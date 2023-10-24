package org.velazquez.U1.Depuracion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el número: ");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");

        }
    }

    public static boolean esPrimo(int num) {

        boolean esPrimo = true;
        int divisores = 0;

        /*Añadiendo un contador de divisores que den de resto 0, se tendrá en cuenta para poner la solución como
        primo o no*/
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                divisores++;
            }
            if (divisores == 2) {
                esPrimo = true;
            } else {
                esPrimo = false;
            }
        }
        return esPrimo;
    }
}