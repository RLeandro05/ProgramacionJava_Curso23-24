package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        String palabra = "fin";

        //Se agrega la condición de que da igual si está en minúscula o mayúscula
        int indice = frase.toLowerCase().indexOf(palabra.toLowerCase());

        //Se indica que si se encuentra dicha palabra, se haga una
        // subcadena donde se muestre desde el inicio hasta la palabra sin contarla
        if (indice != -1) {
            String subcadena = frase.substring(0, indice);
            System.out.println(subcadena);
        } else {
            System.out.println(frase);
        }
    }
}
