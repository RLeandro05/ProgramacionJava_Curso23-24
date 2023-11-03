package org.velazquez.U1.Pruebas;


public class Prueba10 {
    public static void main(String[] args) {

        int altura = 5;
        int espacios = 4;
        int ancho = (altura+1)/2;

        for (int i = 1; i<=altura;i++) {
            for (int j = 1; j<=altura*2+espacios;j++) {
             if (j == 1 || i == j && i <= ancho || j == altura || i + j == altura + 1 && i <= j ||
                     j == i+altura+espacios && i <= ancho ||
                     j == altura*2+1-i+espacios && i+espacios+altura <= j || j == ancho + espacios + altura && i > ancho){
                 System.out.print("*");
             } else {
                 System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
}
