package org.velazquez.U1.Tarea2;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número de grados centígrados: ");
        int c = teclado.nextInt();

        System.out.println("Sabiendo que un Grado Fahrenheit es: 9*C/5 + 32 Fahrenheit");

        System.out.println(c +"º son: 9*"+c+"/5 +32");

        System.out.println("Por consiguiente, el resultado es: ");
        System.out.print(9*c/5 + 32 +"F");
    }
}
