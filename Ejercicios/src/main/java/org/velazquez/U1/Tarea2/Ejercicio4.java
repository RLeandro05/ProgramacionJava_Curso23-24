package org.velazquez.U1.Tarea2;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int metros = 1609;

        System.out.println("Establezca un número de millas: ");
        int numero1 = teclado.nextInt();

        System.out.print(numero1);
        System.out.println(" equivalen a: ");
        System.out.print(numero1 * metros );
    }
}
