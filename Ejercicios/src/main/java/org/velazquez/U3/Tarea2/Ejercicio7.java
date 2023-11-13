package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        int pos_0 = 0;
        char caracter_0 = s1.charAt(pos_0);

        int pos_f = s1.length()-1;
        char caracter_f = s1.charAt(pos_f);

        while (true) {
            System.out.println("JUGADOR 2, adivine la contraseña.");
            System.out.println("Contiene: "+s1.length()+" caracteres.");
            System.out.println("El primer caracter es: "+caracter_0);
            System.out.println("El segundo caracter es: "+caracter_f);

            String s2 = sc.nextLine();

            //Usamos la función para comaprar alfabéticamente dos Strings
            int s = s2.compareTo(s1);

            //Si la comparación resulta mayor que 0, s2 irá después, es decir, es menor
            if (s > 0) {
                System.out.println("La contraseña es mayor alfabéticamente");
            }
            //En caso contrario, resulta mayor
            if (s < 0) {
                System.out.println("La contraseña es menor alfabéticamente");
            }
            if (s2.equals(s1)) {
                System.out.println("CORRECTO");
                break;
            }
        }
        System.out.println();
        System.out.println("FINALIZADO");
    }
}
