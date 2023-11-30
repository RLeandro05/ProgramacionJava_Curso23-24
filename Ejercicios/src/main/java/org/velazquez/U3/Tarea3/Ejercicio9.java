package org.velazquez.U3.Tarea3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Declaración de variables para su uso*/
        int n = 6;

        int[] apuesta = new int[n];
        int[] ganador = new int[n];

        int min = 0;
        int max = 9;

        /*Primer for para almacenar números de la primitiva*/
        for (int i = 0; i<n; i++) {
            System.out.println("Número: ");
            apuesta[i] = sc.nextInt();
        }
        /*Segundo for para almacenar números ganadores de la primitiva*/
        for (int i = 0; i<n; i++) {
            ganador[i] = (int) (Math.random()*((max+1)-min))+min;
        }

        int resultado = primitiva(apuesta, ganador, n);

        System.out.println("Hay: "+resultado+" aciertos");
    }
    /*Declaración de la función*/
    static int primitiva(int[] apuesta, int[] ganador, int n) {
        int contador = 0;

        for (int i = 0; i<n; i++) {
            /*Ponemos una condición que establece que si son el mismo número
            el programa te añade en el contador el número como acertado*/
            if (apuesta[i] == ganador[i]) {
                contador++;
            }
        }

        /*Returnamos el contador de números acertados de la primitiva*/
        return contador;
    }
}
