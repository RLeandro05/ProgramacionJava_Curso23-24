package org.velazquez.U1.Pruebas;

public class Prueba7 {
    public static void main(String[] args) {

        System.out.println("TRIANGULO INVERTIDO");
        System.out.println();
        int n = 5;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("- ");
            }
            for (int j = i; j<=n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j<n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}