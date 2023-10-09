package org.velazquez.U1.Tarea7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean jasp;
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println("Intoduzca su nivel de estudios: ");
        int nivel_de_estudios = sc.nextInt();

        System.out.println("Introduzca sus ingresos: ");
        int ingresos = sc.nextInt();

        if (edad<=28 && nivel_de_estudios>3 && ingresos>28000) {
            System.out.println("Verdadero");

        }else {
            System.out.println("Falso");
        }


    }
}

