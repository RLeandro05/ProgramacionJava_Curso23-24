package org.velazquez.U1.Tarea3;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        double n1 = teclado.nextDouble();

        System.out.println("Introduzca el segundo número: ");
        double n2 = teclado.nextDouble();

        System.out.println("El resultado de la división entre "+n1+" y "+n2+" es de: ");

        double division = (double) (n1/n2);

        System.out.print(division);
    }
}
