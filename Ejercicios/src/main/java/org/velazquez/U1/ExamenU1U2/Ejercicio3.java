package org.velazquez.U1.ExamenU1U2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("Indique el día: ");
        dia = sc.next();


        switch (dia) {
            case "lunes", "jueves", "viernes", "sábado", "domingo":
                int n3;
                int simple3;
                int precio_simple3 = 3;
                int precio_gourmet3 = 9;
                int gourmet3;
                System.out.println("¡BIENVENIDO! Por favor, indique las hamburguesas simples que quiere: ");
                simple3 = sc.nextInt();

                System.out.println();

                System.out.println("Indique ahora las hamburguesas gourmet que quiere: ");
                gourmet3 = sc.nextInt();

                System.out.println();

                String eleccion3;
                System.out.println("¿Pertenece al club Fanegas?(s/n)");
                eleccion3 = sc.next();

                switch (eleccion3) {
                    case "s":
                        double total_gourmet = gourmet3 * precio_gourmet3;

                        double total_simple = simple3 * precio_simple3;
                        double total = total_gourmet + total_simple;

                        double oferta_club = (total) * 0.12;
                        double TOTAL2 = total - oferta_club;
                        System.out.println("Su pedido total es: " + TOTAL2);
                        break;
                    case "n":
                        double total_gourmet2 = gourmet3 * precio_gourmet3;

                        double total_simple2 = simple3 * precio_simple3;
                        double total2 = total_gourmet2 + total_simple2;

                        System.out.println("Su pedido total es: " + total2);
                        break;
                    case "martes":
                        int simple;
                        int precio_simple = 3;
                        int precio_gourmet = 5;
                        int oferta_doble_gourmet = 9;
                        int gourmet;
                        System.out.println("¡BIENVENIDO! Por favor, indique las hamburguesas simples que quiere: ");
                        simple = sc.nextInt();

                        System.out.println();

                        System.out.println("Indique ahora las hamburguesas gourmet que quiere: ");
                        gourmet = sc.nextInt();

                        System.out.println();

                        String eleccion;
                        System.out.println("¿Pertenece al club Fanegas?(s/n)");
                        eleccion = sc.next();

                        switch (eleccion) {

                            case "s":
                                if (gourmet >= 2) {
                                    double oferta = precio_gourmet * 0.1;
                                    double total_oferta = (gourmet * precio_gourmet) * oferta;
                                    double total_gourmet4 = (gourmet * precio_gourmet) - total_oferta;

                                    double total_simple4 = simple * precio_simple;
                                    double total4 = total_gourmet4 + total_simple4;

                                    double oferta_club4 = (total4) * 0.12;
                                    double TOTAL = total4 - oferta_club4;
                                    System.out.println("Su pedido total es: " + TOTAL);
                                    break;
                                } else {
                                    double total_gourmet4 = gourmet * precio_gourmet;

                                    double total_simple4 = simple * precio_simple;
                                    double total4 = total_gourmet4 + total_simple4;

                                    double oferta_club4 = (total4) * 0.12;
                                    double TOTAL = total4 - oferta_club4;
                                    System.out.println("Su pedido total es: " + TOTAL);
                                    break;
                                }

                            case "n":
                                if (gourmet >= 2) {
                                    double oferta = precio_gourmet * 0.1;
                                    double total_oferta = (gourmet * precio_gourmet) * oferta;
                                    double total_gourmet4 = (gourmet * precio_gourmet) - total_oferta;

                                    double total_simple4 = simple * precio_simple;
                                    double total4 = total_gourmet4 + total_simple4;

                                    System.out.println("Su pedido total es: " + total4);
                                    break;
                                } else {
                                    double total_gourmet4 = gourmet * precio_gourmet;

                                    double total_simple4 = simple * precio_simple;
                                    double total4 = total_gourmet4 + total_simple4;

                                    System.out.println("Su pedido total es: " + total4);
                                    break;
                                }

                            case "miércoles":
                                int n2;
                                int simple2;
                                int precio_simple2 = 2;
                                int precio_gourmet2 = 9;
                                int gourmet2;
                                System.out.println("¡BIENVENIDO! Por favor, indique las hamburguesas simples que quiere: ");
                                simple2 = sc.nextInt();

                                System.out.println();

                                System.out.println("Indique ahora las hamburguesas gourmet que quiere: ");
                                gourmet2 = sc.nextInt();

                                System.out.println();

                                String eleccion2;
                                System.out.println("¿Pertenece al club Fanegas?(s/n)");
                                eleccion2 = sc.next();

                                switch (eleccion2) {
                                    case "s":
                                        double total_gourmet5 = gourmet * precio_gourmet;

                                        double total_simple5 = simple * precio_simple;
                                        double total5 = total_gourmet5 + total_simple5;

                                        double oferta_club5 = (total5) * 0.12;
                                        double TOTAL = total5 - oferta_club5;
                                        System.out.println("Su pedido total es: " + TOTAL);
                                        break;

                                    case "n":
                                        double total_gourmet6 = gourmet * precio_gourmet;

                                        double total_simple6 = simple * precio_simple;
                                        double total6 = total_gourmet6 + total_simple6;

                                        System.out.println("Su pedido total es: " + total6);
                                        break;
                                }
                        }
                }
        }
    }
}
