package org.velazquez.U1.Pruebas;

public class Letra_J {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=ancho; j++) {
                if (i < n-1 && j == ancho) {
                    System.out.print("*");
                } else if (i < n-1){
                    System.out.print(" ");
                }
                if (i == n-1) {
                    System.out.print("*");
                    for (int k = 1; k<=ancho-2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    break;
                }
                if (i == n) {
                    System.out.print(" ");
                    for (int l = 1; l<=ancho-2; l++) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                    break;
                }
            }
            System.out.println();
        }
    }
}
