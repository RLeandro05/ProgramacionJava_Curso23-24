package org.velazquez.U1.Pruebas;

public class Letra_H {
    public static void main(String[] args) {
        int n = 11;
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
            System.out.println();
        }
    }
}
