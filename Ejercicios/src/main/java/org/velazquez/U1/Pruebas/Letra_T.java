package org.velazquez.U1.Pruebas;

public class Letra_T {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == 1) {
                    System.out.print("*");
                }
                if (i > 1 && j == ancho) {
                    for (int k = 1; k<ancho; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
