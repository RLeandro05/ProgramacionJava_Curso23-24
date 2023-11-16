package org.velazquez.U1.Pruebas;

public class Letra_K {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=ancho; j++) {
                if (j == 1 || i < ancho && i+j == ancho+1 || i > ancho && i-j == ancho-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
