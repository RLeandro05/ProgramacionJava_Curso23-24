package org.velazquez.U1.Pruebas;

public class Prueba6 {
    public static void main(String[] args) {
        int n = 11;
        int ancho = (n+1)/2;

        for (int i = 1; i<=ancho; i++) {
            for (int j = i; j<ancho; j++) {
                System.out.print("- ");
            }
            for (int j = 1; j<=i*2-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i<=ancho-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("- ");
            }
            for (int j = i; j<=ancho-1; j++) {
                System.out.print("* ");
            }
            for (int j = i; j<ancho-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
