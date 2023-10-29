package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int n0 = 0;

        System.out.println("Introduzca un número : ");
        n = sc.nextInt();

        //While para sacar las cifras al revés
        while (n > 0) {
            int resto = n%10;
            n /= 10;

            n0 = n0*10 + resto;
        }

        System.out.println("El número convertido en asteriscos es: ");
        //Método sin cadena para sacar asteriscos por números sin contar con 0 de inicio, ya que nunca se cuenta

        while (n0 > 0) {
            int resto_final = n0 % 10;

            n0 /= 10;

            for (int i = 0; i < resto_final; i++) {
                System.out.print("*");
            }
            System.out.print("_");

        }
    }
}
