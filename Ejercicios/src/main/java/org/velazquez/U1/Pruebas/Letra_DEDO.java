package org.velazquez.U1.Pruebas;

public class Letra_DEDO {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == 1 && j < n  ||  i == n && j < n) {
                    System.out.print("*");
                } else if (i == 1 || i == n){
                    System.out.print(" ");
                }
            }
            if (i > 1 && i < n) {
                System.out.print("*");

                for (int k = 1; k <= n-2; k++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.print("   ");
            for (int j = 1; j<=ancho; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                    for (int k = 1; k<=ancho-1; k++) {
                        System.out.print("*");
                    }
                    break;
                }
                if (i > 1 && i < ancho || i > ancho) {
                    System.out.print("*");
                    for (int k = 1; k<=ancho-1; k++) {
                        System.out.print(" ");
                    }
                    break;
                }
                if (i == ancho) {
                    for (int k = 1; k<=ancho; k++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.print("   ");
            for (int j = 1; j<=n; j++) {
                if (i == 1 && j < n  ||  i == n && j < n) {
                    System.out.print("*");
                } else if (i == 1 || i == n){
                    System.out.print(" ");
                }
            }
            if (i > 1 && i < n) {
                System.out.print("*");

                for (int k = 1; k <= n-2; k++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.print("   ");
            for (int j = 1; j<=n; j++) {
                if (i == 1 || i == n) {
                    if (j > 1 && j < n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i > 1 && i < n) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
