package org.velazquez.U1.Pruebas;

public class Letra_N {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (j == 1  ||  j == n) {
                    System.out.print("*");
                } else if (i == j && i > 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
