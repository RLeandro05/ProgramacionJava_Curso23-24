package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        String palabra = "fin";

        int indice = frase.toLowerCase().indexOf(palabra.toLowerCase());

        if (indice != -1) {
            String subcadena = frase.substring(0, indice);
            System.out.println(subcadena);
        } else {
            System.out.println(frase);
        }
    }
}
