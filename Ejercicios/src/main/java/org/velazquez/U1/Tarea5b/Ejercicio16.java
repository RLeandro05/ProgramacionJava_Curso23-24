package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n = teclado.nextInt();
        int ult_dig = n%10;

        System.out.println("La última cifra es: "+ult_dig);
    }
}
