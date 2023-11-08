package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont_bl = 0;

        String frase = sc.nextLine();

        //Dicho código se encarga de ver caracter por caracter la frase establecida
        char [] caracteres = frase.toCharArray();

        //Posteriormente, se mostrará cada caracter para saber si dicho caracter es un espacio en blanco
        for (int i = 0; i< frase.length(); i++) {
            if (Character.isWhitespace(caracteres[i])) {
                cont_bl++;
            }
        }
        System.out.println("Hay "+cont_bl+" espacios en blanco dentro de la frase");
    }
}
