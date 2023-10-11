package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int etiqueta_arbol = 0;
        int altura = 0;
        int altura_max = 0;
        int arbol_max = 0;

        while (altura != -1) {
            System.out.println("Introduzca la altura del árbol número "+etiqueta_arbol);
            altura = sc.nextInt();

            if (altura > altura_max) {
                altura_max = altura;
                arbol_max = etiqueta_arbol;
            }

            etiqueta_arbol ++;
        }

        System.out.println("El árbol número "+arbol_max+" es el más alto con una altura de: "+altura_max);




    }
}
