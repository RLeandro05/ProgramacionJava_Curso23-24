package org.velazquez.U1.Tarea5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce el número 12: ");
        int n1 = teclado.nextInt();

        if (n1 == 12) {
            System.out.println(n1+ " Bien Hecho." );
        }
        else {
            System.out.println(n1+ " Incorrecto." );
        }
    }
}
