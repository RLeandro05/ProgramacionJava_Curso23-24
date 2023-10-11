package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soporte = 1;
        int num;

        System.out.println("Introduzca un número para su factorial: ");
        num = sc.nextInt();

       while (num != 0) {
           soporte = soporte*num; num--;
       }
        System.out.println("El factorial es: "+soporte);

    }
}
