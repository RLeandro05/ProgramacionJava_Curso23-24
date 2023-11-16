package org.velazquez.U1.Pruebas;

public class Letra_V {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = i; j<=n-2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j<n-2; j++) {
                System.out.print(" ");
            }
            if (i != n-1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
