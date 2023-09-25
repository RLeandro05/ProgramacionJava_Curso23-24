package org.velazquez.U1.Tarea3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número de millas: ");
        float n1 = teclado.nextFloat();

        System.out.println("Sabiendo que: ");
        System.out.println("1 milla = 1.609 km");

        System.out.print(n1+" = ");
        float multiplicacion = (float) (n1*1609);

        System.out.print(multiplicacion +" km ");
    }
}
