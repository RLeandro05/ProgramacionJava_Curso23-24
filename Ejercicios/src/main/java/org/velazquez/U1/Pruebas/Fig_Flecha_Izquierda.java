package org.velazquez.U1.Pruebas;

public class Fig_Flecha_Izquierda {
    public static void main(String[] args) {

        System.out.println("FLECHA");
        System.out.println();
        int n = 7;
        int ancho = (n+1)/2;

        for (int i = 1; i <= ancho;i++) {
            for (int j = i;j<=ancho;j++) {
                System.out.print("_ ");
            }
            for (int k = 1; k <= i;k++) {
                System.out.print("* ");
            }
            if (i == ancho) {
                System.out.print("* * * * * ");
            }
            System.out.println();
        }

        for (int i = 1; i<= ancho-1;i++) {
            for (int j = 0; j <= i;j++){
                System.out.print("_ ");
            }
            for (int k = i; k <= ancho-1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
