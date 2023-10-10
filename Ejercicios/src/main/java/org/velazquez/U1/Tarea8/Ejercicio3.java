package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMin = 1;
        int numMax = 100;
        int intento;
        int contesta;

        int soluc = (int) (Math.random() * ((numMax + 1) - numMin)) + numMin;

        System.out.println("Introduzca un número entre 1 y 100: ");
        intento = sc.nextInt();

        while (intento >= 1 && intento <= 100) {

            if (intento > soluc) {
                System.out.println("La solución es menor a " + intento);
                System.out.println("¿Quieres rendirte?");
                System.out.println("1. Si (Pulse -1)");
                System.out.println("2. No (Pulse cualquier número distinto de -1)");
                contesta = sc.nextInt();
                if (contesta == -1) {
                    System.out.println("Una pena tu rendición");
                    break;
                } else {
                    System.out.println("Sigue intentándolo: ");
                    intento = sc.nextInt();
                }
                if (intento < soluc) {
                    System.out.println("La solución es mayor a " + intento);
                    System.out.println("¿Quieres rendirte?");
                    System.out.println("1. Si (Pulse -1)");
                    System.out.println("2. No (Pulse cualquier número distinto de -1)");
                    contesta = sc.nextInt();
                    if (contesta == -1) {
                        System.out.println("Una pena tu rendición");
                        break;
                    } else {
                        System.out.println("Sigue intentándolo: ");
                        intento = sc.nextInt();
                    }
                    if (intento == soluc) {
                        System.out.println("¡CORRECTO!");
                        break;
                    }
                }
            }
        }
    }
}
