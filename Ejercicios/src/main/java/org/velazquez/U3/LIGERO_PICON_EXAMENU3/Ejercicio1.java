package org.velazquez.U3.LIGERO_PICON_EXAMENU3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Introducimos la palabra la cual habrá que adivinar*/
        System.out.println("Introduzca la palabra a adivinar: ");
        String cadena_a_adivinar = sc.next();

        /*Luego, pondremos dicha palabra en guiones, para adivinarlo luego*/
        System.out.println("Introduzca guiones hasta ser de la misma longitud que la palabra a adivinar: ");
        String resultado_parcial = sc.next();

        System.out.println(resultado_parcial);

        /*Introducimos un caracter para intentar adivinar los caracteres de la cadena a adivinar*/
        System.out.println("Ahora, introduzca un caracter para revelar en la palabra: ");
        String letra_s = sc.next();

        char letra = letra_s.charAt(0);
    }
    /*Declaración de la función palabraAhorcado*/
    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {
        Scanner sc = new Scanner(System.in);

        String[] cadena = new String[cadena_a_adivinar.length()];

        System.out.println("Defina nuevamente la letra: ");
        String letra_s = sc.nextLine();
        String resultado;
        while (true) {
            for (int i = 0; i<cadena.length; i++) {
                if (cadena[i].equals(letra_s)) {
                }
            }
        }
    }
}
