package org.velazquez.U1.Pruebas;

public class Letra_M {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == j && i <= ancho || j == 1 && i > 1 || i+j == n+1 && i < ancho || j == n && i > 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
