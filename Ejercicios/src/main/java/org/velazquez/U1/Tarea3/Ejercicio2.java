package org.velazquez.U1.Tarea3;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su año de nacimiento: ");
        short n1 = teclado.nextShort();

        System.out.println("Introduzca el año correspondiente en la actualidad: ");
        short n2 = teclado.nextShort();

        System.out.println("Usted tiene: ");

        short resta = (short) (n2 - n1);

        System.out.print(resta);
    }
}
