package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        //Se indica la longitud
        int longitud = cadena.length();

        //Como queremos saber sobre el centro, se divide dicha longitud entre dos
        int posicionCentral = longitud / 2;

        //Con charAT se podrá sacar el caracter de la posición central
        //usando el anterior int
        char caracterCentral = cadena.charAt(posicionCentral);

        //Indicamos el centro para asegurar si es o no un espacio en blanco
        System.out.println(caracterCentral);

        //Con el comando Character.isWhitespace indicamos si el caracter central que pusimos es o no un espacio en blanco
        if (Character.isWhitespace(caracterCentral)) {
            System.out.println("El centro contiene un espacio en blanco");
        } else {
            System.out.println("El centro no contiene un espacio en blanco");
        }
    }
}
