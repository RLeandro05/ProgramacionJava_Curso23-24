package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int multiplicador = 1;
        int resultado;

        System.out.println("Introduzca un número del 1 al 10: ");
        num = sc.nextInt();

        while (num < 1 || num > 10) {
            System.out.println(num+" no está entre el 1 y 10. Por favor, ");
            System.out.println("introduzca un número entre el 1 y el 10: ");
            num = sc.nextInt();
        }

        while (true) {

            resultado = multiplicador*num;
            System.out.println(resultado);

            multiplicador++;

            if (multiplicador > 10) {
                break;
            }

        }


    }
}
