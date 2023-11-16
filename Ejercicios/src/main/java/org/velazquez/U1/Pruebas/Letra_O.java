package org.velazquez.U1.Pruebas;

public class Letra_O {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i<=n; i++) {
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
