package org.velazquez.U1.Pruebas;

public class Letra_D {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i<=n; i++) {
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
            System.out.println();
        }
    }
}
