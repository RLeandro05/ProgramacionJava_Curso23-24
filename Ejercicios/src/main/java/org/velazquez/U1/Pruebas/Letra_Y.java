package org.velazquez.U1.Pruebas;

public class Letra_Y {
    public static void main(String[] args) {
        int n = 5;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == j && i <= ancho || i+j == n+1 && i < ancho || j == ancho && i > ancho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
