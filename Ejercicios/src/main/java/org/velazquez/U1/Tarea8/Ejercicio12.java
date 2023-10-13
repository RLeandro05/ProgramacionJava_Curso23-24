package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conteo = 0;
        int nota;
        int not_al_sus = 0;

        while (true) {
            System.out.println("Por favor, introduzca la nota del siguiente alumno: ");
            nota = sc.nextInt();

            if (nota < 5) {
                not_al_sus++;
                conteo++;
            }
            if (nota > 5) {
                conteo++;
            }

            if (conteo == 5 && not_al_sus >= 1) {
                System.out.println("Hay algún alumno suspenso");
                break;
            }
            if (conteo == 5 && not_al_sus == 0) {
                System.out.println("No hay ningún alumno suspenso");
                break;
            }
        }
    }
}
