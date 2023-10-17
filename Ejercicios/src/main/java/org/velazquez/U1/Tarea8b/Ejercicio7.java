package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int resto;
        int invertido = 0;

        System.out.println("Introduzca un número entero aleatorio para darle la vuelta: ");
        n = sc.nextInt();

        while (n > 0) {
            resto = n % 10;
            invertido = invertido * 10 +resto;
            n /= 10;
        }

        System.out.println("El número al revés sería: "+invertido);



    }
}
