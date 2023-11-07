package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio11A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int e;

        System.out.println("Ingrese un número de base: ");
        n = sc.nextInt();
        int aux = n;

        System.out.println("Ingrese un número de exponente: ");
        e = sc.nextInt();

        int resultado = PotenciaIterativa(n, e, aux);
        System.out.println(resultado);
    }
    public static int PotenciaIterativa(int n, int e, int aux) {
        for (int i = 1; i < e; i++) {
            n = aux * n;
        }

        return n;
    }
}
