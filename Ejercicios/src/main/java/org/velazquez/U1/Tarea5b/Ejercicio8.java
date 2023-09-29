package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa puede resolver ecuaciones de segundo grado.");
        System.out.println("Introduce un valor al parámetro a: ");
        double a = teclado.nextDouble();

        System.out.println("Introduce un valor al parámetro b: ");
        double b = teclado.nextDouble();

        System.out.println("Introduce un valor al parámetro c: ");
        double c = teclado.nextDouble();

        double b_cambiada1 = (double) (b*-1);
        double raiz1a = (double) ((b*b)-(4*a*c));
        double raiz1b = (double) (Math.sqrt(raiz1a));
        double numerador1 = (double) (raiz1b+b_cambiada1);
        double denominador1 = (double) (2*a);
        double resultado1 = (double) (numerador1/denominador1);

        System.out.println("x = "+resultado1);

        double b_cambiada2 = (double) (b*-1);
        double raiz2a = (double) ((b*b)-(4*a*c));
        double raiz2b = (double) (Math.sqrt(raiz2a));
        double numerador2 = (double) (raiz2b-b_cambiada2);
        double denominador2 = (double) (2*a);
        double resultado2_alpha = (double) (numerador2/denominador2);
        double resultado2 = (double) (resultado2_alpha*-1);

        System.out.println("x = "+resultado2);

        }

    }
