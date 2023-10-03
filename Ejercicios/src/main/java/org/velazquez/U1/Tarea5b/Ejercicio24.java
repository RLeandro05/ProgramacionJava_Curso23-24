package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1, introduzca su jugada: ");
        String jugador_1;
        jugador_1 = sc.next();

        System.out.println("Jugador 2, introduzca su jugada: ");
        String jugador_2;
        jugador_2 = sc.next();

        if (jugador_1.equals("tijeras") && jugador_2.equals("tijeras")  ||  jugador_1.equals("piedra") && jugador_2.equals("piedra")  ||  jugador_1.equals("papel") && jugador_2.equals("papel")) {
            System.out.println("EMPATE");
        }else {
            System.out.println("Jugada incorrecta");
        }
        if (jugador_1.equals("tijeras") && jugador_2.equals("papel")) {
            System.out.println("GANA JUGADOR 1");
        }
        if (jugador_1.equals("papel") && jugador_2.equals("tijeras")) {
            System.out.println("GANA JUGADOR 2");
        }
        if (jugador_1.equals("papel") && jugador_2.equals("piedra")) {
            System.out.println("GANA JUGADOR 1");
        }
        if (jugador_1.equals("piedra") && jugador_2.equals("papel")) {
            System.out.println("GANA JUGADOR 2");
        }
        if (jugador_1.equals("piedra") && jugador_2.equals("tijeras")) {
            System.out.println("GANA JUGADOR 1");
        }
        if (jugador_1.equals("tijeras") && jugador_2.equals("piedra")) {
            System.out.println("GANA JUGADOR 2");
        }
    }
}
