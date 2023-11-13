package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Javalin, javalon";
        String s2 = "javalen, len, len";

        String mensaje = sc.nextLine();


        int indice = mensaje.toLowerCase().indexOf(s1.toLowerCase());
        int indice2 = mensaje.toLowerCase().indexOf(s2.toLowerCase());

        if (indice != -1) {
            System.out.println();
            System.out.println("El mensaje está en javaliano.");
            System.out.println();

            String mensaje_aux = mensaje.replace(s1,"");
            char [] caracteres = mensaje_aux.toCharArray();

            String mensajef = mensaje_aux;

            for (int i = 0; i <= mensajef.length(); i++) {
                if (Character.isWhitespace(caracteres[i])) {
                    mensajef = mensajef.replaceFirst(" ","");
                } else {
                    System.out.println(mensajef);
                    break;
                }
            }
        }
        if (indice2 != -1) {
            System.out.println();
            System.out.println("El mensaje está en javaliano.");
            System.out.println();

            String mensaje_aux = mensaje.substring(0,indice2);
            System.out.println(mensaje_aux);
        }
        if (indice == -1 && indice2 == -1) {
            System.out.println();
            System.out.println("El mensaje no está en javaliano.");
            System.out.println();
            System.out.println(mensaje);
        }
    }
}
