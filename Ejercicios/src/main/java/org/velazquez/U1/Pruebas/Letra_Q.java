package org.velazquez.U1.Pruebas;

public class Letra_Q {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if ((j == 1 || j == n) && i > 1 && i < n-1 || (i == 1 || i == n-1) && j > 1 && j < n || i == j && i == n-2 || i == j && i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
