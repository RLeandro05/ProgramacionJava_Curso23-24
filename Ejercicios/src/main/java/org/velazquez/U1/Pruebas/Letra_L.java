package org.velazquez.U1.Pruebas;

public class Letra_L {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (j == 1 || i == n && j > 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
