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
            int azarmin = 5;
            int azarmax = 10;

            int azar = (int) (Math.random()*((azarmax+1)-azarmin))+azarmin;

            String subcadena = mensaje.substring(0, indice);
            for (int i = 1; i <= azar; i++) {
                System.out.print("_");
            }
            System.out.print(","+subcadena);
            String subcadena2 = mensaje.substring(indice+16);
            System.out.print(subcadena2);
            System.out.println();
            System.out.println("FINALIZADO");
        }
        if (indice2 != -1) {
            System.out.println();
            System.out.println("El mensaje está en javaliano.");
            System.out.println();
            int azarmin = 5;
            int azarmax = 10;

            int azar = (int) (Math.random()*((azarmax+1)-azarmin))+azarmin;

            String subcadena1_1 = mensaje.substring(0, indice2);
            System.out.print(subcadena1_1);
            for (int i = 1; i <= azar; i++) {
                System.out.print("_");
            }
            System.out.println();
            System.out.println("FINALIZADO");
        }
        if (indice2 == -1 && indice == -1) {
            System.out.println("El mensaje no está javaliano");
            System.out.println();
            System.out.println(mensaje);
            System.out.println();
            System.out.println("FINALIZADO");
        }
    }
}
