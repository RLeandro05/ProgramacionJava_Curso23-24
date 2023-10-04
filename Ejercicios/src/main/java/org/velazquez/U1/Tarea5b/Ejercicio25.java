package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué ha tomado de comer?");
        System.out.println("1. Palmera");
        System.out.println("2. Donut");
        System.out.println("3. Pitufo");
        String comida;
        comida = sc.next();

        if (comida.equals("palmera") || comida.equals("Palmera")) {
            double palmera = 1.40;

            System.out.println("¿Qué tomó?");
            System.out.println("1. Zumo");
            System.out.println("2. Café");
            String bebida;
            bebida = sc.next();

            if (bebida.equals("Zumo") || bebida.equals("zumo")) {
                double zumo = 1.50;
                double TOTAL = zumo+palmera;

                System.out.println("TOTAL: "+TOTAL+"€");
            }
            if (bebida.equals("Café") || bebida.equals("café")) {
                double cafe = 1.20;
                double TOTAL = palmera+cafe;

                System.out.println("TOTAL: "+TOTAL+"€");
            }
        }
        if (comida.equals("donut") || comida.equals("Donut")) {
            double donut = 1;

            System.out.println("¿Qué tomó?");
            System.out.println("1. Zumo");
            System.out.println("2. Café");
            String bebida;
            bebida = sc.next();

            if (bebida.equals("Zumo") || bebida.equals("zumo")) {
                double zumo = 1.50;
                double TOTAL = zumo+donut;

                System.out.println("TOTAL: "+TOTAL+"€");
            }
            if (bebida.equals("Café") || bebida.equals("café")) {
                double cafe = 1.20;
                double TOTAL = donut+cafe;

                System.out.println("TOTAL: "+TOTAL+"€");
            }
        }
        if (comida.equals("pitufo") || comida.equals("Pitufo")) {
            System.out.println("¿Con aceite o con tortilla?");
            System.out.println("1. Aceite");
            System.out.println("2. Tortilla");
            String pitufo;
            pitufo = sc.next();

            if (pitufo.equals("Aceite") || pitufo.equals("aceite")) {
                double aceite = 1.20;

                System.out.println("¿Qué tomó?");
                System.out.println("1. Zumo");
                System.out.println("2. Café");
                String bebida;
                bebida = sc.next();

                if (bebida.equals("Zumo") || bebida.equals("zumo")) {
                    double zumo = 1.50;
                    double TOTAL = zumo+aceite;

                    System.out.println("TOTAL: "+TOTAL+"€");
                }
                if (bebida.equals("Café") || bebida.equals("café")) {
                    double cafe = 1.20;
                    double TOTAL = aceite+cafe;

                    System.out.println("TOTAL: "+TOTAL+"€");
                }
            }
            if (pitufo.equals("Tortilla") || pitufo.equals("tortilla")) {
                double tortilla = 1.60;

                System.out.println("¿Qué tomó?");
                System.out.println("1. Zumo");
                System.out.println("2. Café");
                String bebida;
                bebida = sc.next();

                if (bebida.equals("Zumo") || bebida.equals("zumo")) {
                    double zumo = 1.50;
                    double TOTAL = zumo+tortilla;

                    System.out.println("TOTAL: "+TOTAL+"€");
                }
                if (bebida.equals("Café") || bebida.equals("café")) {
                    double cafe = 1.20;
                    double TOTAL = tortilla+cafe;

                    System.out.println("TOTAL: "+TOTAL+"€");
                }
            }
        }


    }
}
