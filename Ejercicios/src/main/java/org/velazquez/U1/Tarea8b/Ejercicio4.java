package org.velazquez.U1.Tarea8b;

public class Ejercicio4 {
    public static void main(String[] args) {
        int contador = 0;
        int positivo = 0;
        int negativo = 0;
        int numMin = -10;
        int numMax = 10;

        while (contador < 10) {
            int n = (int) (Math.random() * ((numMax+1)-numMin)) + numMin;

            if (n < 0) {
                System.out.println(n+" es negativo.");
                System.out.println();
                positivo++;
            }
            if (n > 0) {
                System.out.println(n+" es positivo.");
                System.out.println();
                negativo++;
            }
            contador++;
        }

        System.out.println("Hay "+negativo+" números negativos.");
        System.out.println();
        System.out.println("Hay "+positivo+" números positivos.");
    }
}
