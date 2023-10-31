package org.velazquez.U1.Pruebas;

public class Prueba8 {
    public static void main(String[] args) {

        System.out.println("ROMBO HUECO");
        System.out.println();
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i <= ancho; i++) {
            for (int j = 1; j <= ancho - i; j++) {
                System.out.print("- ");
            }
            System.out.print("* ");

            for (int k = 1; k <= 2 * i - 3; k++) {
                System.out.print("- ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i<=ancho-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("- ");
            }
            System.out.print("* ");
            for (int j = i; j<=ancho-2; j++) {
                System.out.print("- ");
            }
            for (int j = i; j<ancho-2; j++) {
                System.out.print("- ");
            }
            if (i != ancho-1) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
