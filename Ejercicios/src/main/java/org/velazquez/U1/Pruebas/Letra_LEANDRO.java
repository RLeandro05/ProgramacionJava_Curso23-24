package org.velazquez.U1.Pruebas;

public class Letra_LEANDRO {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (j == 1 || i == n && j > 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
            System.out.print("   ");
            for (int j = 1; j<=n; j++) {
                if (j == 1  ||  j == n) {
                    System.out.print("*");
                } else if (i == j && i > 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
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
                if (j == 1 && i > 1 || (i == 1 || i == ancho) && j > 1 && j < n || i > 1 && i < ancho && j == n || i == j && i > ancho) {
                    System.out.print("*");
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
            System.out.println();
        }
    }
}
