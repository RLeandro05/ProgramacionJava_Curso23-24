package org.velazquez.U1.Pruebas;

public class Letra_HOLA {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if ((j == 1 ||  j == n) && i != ancho) {
                    System.out.print("*");
                } else if (i == ancho){
                    for (int k = 1; k<=n; k++) {
                        System.out.print("*");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
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
            System.out.print("   ");
            for (int j = 1; j<=ancho; j++) {
                if (j == 1 && i < n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

                if (i == n-1) {
                    for (int k = 1; k <= n*2-4;k++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.print("*");

            for (int l = 1; l <= 2*i-3; l++) {
                if (i != n-1) {
                    System.out.print(" ");
                }
            }

            if (i > 1 && i != n-1) {
                System.out.print("*");
            }


            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
