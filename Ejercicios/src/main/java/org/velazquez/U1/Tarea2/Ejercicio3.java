package org.velazquez.U1.Tarea2;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.println("Introduzca el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.println("La división de ambos número es: ");
        System.out.print(numero1/numero2);

    }
}
