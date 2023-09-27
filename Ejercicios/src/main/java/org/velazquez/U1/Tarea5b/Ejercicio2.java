package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de horas según el reloj: ");
        int n = teclado.nextInt();

        if (n == 6||n == 7||n == 8||n == 9||n == 10||n == 11||n == 12) {
            System.out.println("Buenos días");
        }
        else {
            if (n == 13||n == 14||n == 15||n == 16||n == 17||n == 18||n == 19||n == 20) {
                System.out.println("Buenas tardes");
            }
            else {
                if (n == 21||n == 22||n == 23||n == 1||n == 2||n == 3||n == 4||n == 5) {
                    System.out.println("Buenas noches");
                }
                else {
                    System.out.println("Número incorrecto");
                }
            }
        }
    }
}
