package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una letra: ");
        String letra = sc.next();

        boolean esVocal = esVocal(letra);

        if (esVocal) {
            System.out.println("Es vocal.");
        } else {
            System.out.println("No es vocal.");
        }
    }
    public static boolean esVocal(String letra) {
        return (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") ||letra.equals("u"));
    }
}
