package org.velazquez.U1.Pruebas;

public class Letra_W2 {
    public static void main(String[] args) {
        int altura = 5;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2; j++) {
                if (j == i || j == altura * 2 - i - 1 || (j >= altura && i == altura - 1)) {
                    if (i == altura-1) {
                        System.out.print("*");
                        break;
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < altura * 2; j++) {
                if (j == i || j == altura * 2 - i - 1 || (j >= altura && i == altura - 1)) {
                    if (i == altura-1) {
                        System.out.print("*");
                        break;
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
