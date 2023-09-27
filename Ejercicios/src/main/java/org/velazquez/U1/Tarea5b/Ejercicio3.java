package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, escribe un número del 1 al 7: ");
        int n = teclado.nextInt();

        if (n == 1) {
            System.out.println("Lunes");
        }
        else {
            if (n == 2) {
                System.out.println("Martes");
            }
            else {
                if (n == 3) {
                    System.out.println("Miércoles");
                }
                else {
                    if (n == 4) {
                        System.out.println("Jueves");
                    }
                    else {
                        if (n == 5) {
                            System.out.println("Viernes");
                        }
                        else {
                            if (n == 6) {
                                System.out.println("Sábado");
                            }
                            else {
                                if (n == 7) {
                                    System.out.println("Domingo");
                                }
                                else {
                                    System.out.println("Número incorrecto");
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
