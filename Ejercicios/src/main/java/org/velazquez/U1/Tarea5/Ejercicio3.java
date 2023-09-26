package org.velazquez.U1.Tarea5;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio3  {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un número: ");
        int n1 = teclado.nextInt();

        if (n1%2 == 0) {
            System.out.println(n1+ " Su número es par" );
        }
        else {
            System.out.println(n1+ " Su número es impar" );
        }

    }
}
