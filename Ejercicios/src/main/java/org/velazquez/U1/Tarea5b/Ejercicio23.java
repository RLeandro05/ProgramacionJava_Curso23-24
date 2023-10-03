package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿De qué sabor quiere la tarta?");
        System.out.println("1. Manzana");
        System.out.println("2. Fresa");
        System.out.println("3. Chocolate");
        int tarta = sc.nextInt();

        if (tarta == 1) {
            System.out.println("¿Quiere nata?(s/n)");
            String nata;
            nata = sc.next();

            System.out.println("¿Quiere ponerle un nombre?(s/n)");
            String nombre;
            nombre = sc.next();

            if (nata.equals("s") && nombre.equals("s")) {
                double precio_nata = 2.50;
                double precio_nombre = 2.75;
                double precio_manzana = 18;

                double TOTAL = precio_nata + precio_nombre + precio_manzana;

                System.out.println("TOTAL: " + TOTAL + "€");
            }
            if (nata.equals("s") && nombre.equals("n")) {
                double precio_nata = 2.50;
                double precio_manzana = 18;

                double TOTAL = precio_nata + precio_manzana;

                System.out.println("TOTAL: " + TOTAL + "€");
            }
            if (nata.equals("n") && nombre.equals("s")) {
                double precio_nombre = 2.75;
                double precio_manzana = 18;

                double TOTAL = precio_nombre + precio_manzana;

                System.out.println("TOTAL: " + TOTAL + "€");
            }
            if (nata.equals("n") && nombre.equals("n")) {
                double precio_manzana = 18;

                System.out.println("TOTAL: "+precio_manzana+"€");
            }


        }
        if (tarta == 2) {
            System.out.println("¿Quiere nata?(s/n)");
            String nata;
            nata = sc.next();

            System.out.println("¿Quiere ponerle un nombre?(s/n)");
            String nombre;
            nombre = sc.next();

            if (nata.equals("s") && nombre.equals("s")) {
                double precio_nata = 2.50;
                double precio_nombre = 2.75;
                double precio_fresa = 16;

                double TOTAL = precio_nata + precio_nombre + precio_fresa;

                System.out.println("TOTAL: " + TOTAL + "€");
            }
            if (nata.equals("s") && nombre.equals("n")) {
                double precio_nata = 2.50;
                double precio_fresa = 16;

                double TOTAL = precio_nata + precio_fresa;

                System.out.println("TOTAL: " + TOTAL + "€");
            }
            if (nata.equals("n") && nombre.equals("s")) {
                double precio_nombre = 2.75;
                double precio_fresa = 16;

                double TOTAL = precio_nombre + precio_fresa;

                System.out.println("TOTAL: " + TOTAL + "€");
            }
            if (nata.equals("n") && nombre.equals("n")) {
                double precio_fresa = 16;

                System.out.println("TOTAL: "+precio_fresa+"€");
            }
        }
        if (tarta == 3) {
            System.out.println("¿Qué tipo de chocolate quiere?");
            System.out.println("1. Blanco");
            System.out.println("2. Negro");
            int chocolate = sc.nextInt();

            if (chocolate == 1) {
                System.out.println("¿Quiere nata?(s/n)");
                String nata;
                nata = sc.next();

                System.out.println("¿Quiere ponerle un nombre?(s/n)");
                String nombre;
                nombre = sc.next();

                if (nata.equals("s") && nombre.equals("s")) {
                    double precio_nata = 2.50;
                    double precio_nombre = 2.75;
                    double precio_blanco = 14;

                    double TOTAL = precio_nata + precio_nombre + precio_blanco;

                    System.out.println("TOTAL: " + TOTAL + "€");
                }
                if (nata.equals("s") && nombre.equals("n")) {
                    double precio_nata = 2.50;
                    double precio_blanco = 14;

                    double TOTAL = precio_nata + precio_blanco;

                    System.out.println("TOTAL: " + TOTAL + "€");
                }
                if (nata.equals("n") && nombre.equals("s")) {
                    double precio_nombre = 2.75;
                    double precio_blanco = 14;

                    double TOTAL = precio_nombre + precio_blanco;

                    System.out.println("TOTAL: " + TOTAL + "€");
                }
                if (nata.equals("n") && nombre.equals("n")) {
                    double precio_blanco = 14;

                    System.out.println("TOTAL: "+precio_blanco+"€");
                }
            }
            if (chocolate == 2) {
                System.out.println("¿Quiere nata?(s/n)");
                String nata;
                nata = sc.next();

                System.out.println("¿Quiere ponerle un nombre?(s/n)");
                String nombre;
                nombre = sc.next();

                if (nata.equals("s") && nombre.equals("s")) {
                    double precio_nata = 2.50;
                    double precio_nombre = 2.75;
                    double precio_negro = 15;

                    double TOTAL = precio_nata + precio_nombre + precio_negro;

                    System.out.println("TOTAL: " + TOTAL + "€");
                }
                if (nata.equals("s") && nombre.equals("n")) {
                    double precio_nata = 2.50;
                    double precio_negro = 15;

                    double TOTAL = precio_nata + precio_negro;

                    System.out.println("TOTAL: " + TOTAL + "€");
                }
                if (nata.equals("n") && nombre.equals("s")) {
                    double precio_nombre = 2.75;
                    double precio_negro = 15;

                    double TOTAL = precio_nombre + precio_negro;

                    System.out.println("TOTAL: " + TOTAL + "€");
                }
                if (nata.equals("n") && nombre.equals("n")) {
                    double precio_negro = 15;

                    System.out.println("TOTAL: "+precio_negro+"€");
                }
            }
        }
    }
}
