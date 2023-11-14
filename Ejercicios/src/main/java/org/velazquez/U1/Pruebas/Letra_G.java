package org.velazquez.U1.Pruebas;

public class Letra_G {
    public static void main(String[] args) {
        int n = 11;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == 1 && j == 1  ||  i == n && j == 1) {
                    System.out.print(" ");
                }
                if (i == 1 && j > 1 && j <= ancho+1  ||  i == n && j > 1 && j <= ancho+1) {
                    System.out.print("*");
                }
                if (i > 1 && i < ancho) {
                    System.out.print("*");
                    break;
                }
            }
            if (i == ancho) {
                System.out.print("*");

                for (int k = 1; k<=n; k++){
                    if (k < ancho) {
                        System.out.print(" ");
                    } else {
                        System.out.print("**");
                        break;
                    }
                }
            }
            if (i > ancho && i < n) {
                System.out.print("*");

                for (int l = 1; l<=ancho; l++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
