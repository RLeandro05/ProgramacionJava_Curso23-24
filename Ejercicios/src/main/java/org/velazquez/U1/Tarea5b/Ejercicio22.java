package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el largo de la bandera: ");
        int largo = sc.nextInt();

        System.out.println("Introduzca la anchura de la bandera: ");
        int ancho = sc.nextInt();

        System.out.println("¿Quiere escudo?(s/n)");
        String escudo;
        escudo = sc.next();

        if (escudo.equals("s")) {
            double cm_cuadrado = largo*ancho;
            double TOTAL = cm_cuadrado*0.01 + 3.25 + 2.50;
            System.out.println("TOTAL: "+TOTAL+"€");
        }
        if (escudo.equals("n")) {
            double cm_cuadrado = largo*ancho;
            double TOTAL = cm_cuadrado*0.01 + 3.25;
            System.out.println("TOTAL: "+TOTAL+"€");
        }
    }
}
