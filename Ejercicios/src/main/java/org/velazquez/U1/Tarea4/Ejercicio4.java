package org.velazquez.U1.Tarea4;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un número decimal cualquiera: ");

        double n1 = teclado.nextDouble();

        System.out.println("Su redondeo sale: "+Math.round(n1));


    }
}
