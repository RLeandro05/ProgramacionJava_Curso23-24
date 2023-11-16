package org.velazquez.U1.Pruebas;

public class Letra_V {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=(n*2)-1; j++) {
                if (i == j || i+j == n*2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
