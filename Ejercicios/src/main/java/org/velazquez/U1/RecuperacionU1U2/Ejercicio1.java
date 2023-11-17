package org.velazquez.U1.RecuperacionU1U2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;

        System.out.print("Hola, por favor, ingrese la nota del primer control: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese la nota del segundo control: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese la nota del tercer control: ");
        nota3 = sc.nextDouble();

        double media = Math.ceil((nota1+nota2+nota3)/3*100)/100;

        if (media >= 5 && media < 6) {
            System.out.println("Suficiente");
        }
        if (media >= 6 && media < 7) {
            System.out.println("Bien");
        }
        if (media >= 7 && media < 9) {
            System.out.println("Notable");
        }
        if (media >= 9) {
            System.out.println("Sobresaliente");
        }
        if (media < 5) {
            System.out.println("Tu media da suspenso");
            System.out.println("¿Cuál fue tu nota en la recuperación?(1. apto/2. no apto)");
            int recu = sc.nextInt();

            switch (recu) {
                case 1 -> System.out.println("Suficiente");
                case 2 -> System.out.println("Suspenso");
            }
        }
        System.out.println();
        System.out.println("FINALIZADO");
    }
}
