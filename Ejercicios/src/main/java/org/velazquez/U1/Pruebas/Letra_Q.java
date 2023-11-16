package org.velazquez.U1.Pruebas;

public class Letra_Q {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n+1; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == 1 && j == 1  ||  i == 1 && j == n  ||  i == n && j == 1) {
                    System.out.print(" ");
                } else if (i == 1  ||  i == n){
                    System.out.print("*");
                }
            }
            if (i > 1 && i < n-1) {
                System.out.print("*");
                for (int k = 1; k<=ancho*2-3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if (i == n-1) {
                System.out.print("*");
                for (int l = 1; l<=ancho*2-4; l++) {
                    System.out.print(" ");
                }
                System.out.print("**");
            }
            if (i == n+1) {
                for (int m = 1; m<=n; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
