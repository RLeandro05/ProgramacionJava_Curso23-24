package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.print("El número introducido es: ");
        System.out.print(numero);
        numero = 45;
        System.out.print("El número automático es: ");
        System.out.println(numero);
    }
}