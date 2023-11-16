package org.velazquez.U1.Pruebas;

public class Letra_R {
    public static void main(String[] args) {
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i == 1 && j > 1 && j <= n-1 && j <= ancho+1) {
                    System.out.print("*");
                } else if (i == 1){
                    System.out.print(" ");
                }
                if (i > 1 && i < ancho) {
                    System.out.print("*");
                    for (int k = 1; k <= ancho; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    break;
                }
                if (i == ancho) {
                    for (int l = 1; l<= ancho+1; l++) {
                        System.out.print("*");
                    }
                    break;
                }
                if (i > ancho) {
                    if (j < 2|| j == i-1) {
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
