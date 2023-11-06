package org.velazquez.U3.Tarea1;


public class Ejercicio1 {
    public static void ECO(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("ECO...");
        }
    }
    //Para los casos que únicamente imprima, la función debe ser void, para indicar que no trae nada en específico
    public static void main(String[] args) {
        ECO(5);
    }
}
