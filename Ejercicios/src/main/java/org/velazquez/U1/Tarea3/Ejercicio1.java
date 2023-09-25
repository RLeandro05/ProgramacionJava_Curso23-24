package org.velazquez.U1.Tarea3;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        byte b1 = teclado.nextByte();

        System.out.println("Introduzca el segundo número: ");
        byte b2 = teclado.nextByte();

        System.out.println("La suma de "+b1+" y "+b2+" es de: ");
        byte suma = (byte) (b1 + b2);

        System.out.print(suma);


    }
}
