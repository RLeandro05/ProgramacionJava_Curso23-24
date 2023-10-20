package org.velazquez.U1.Entregable1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Venta de entradas CineCampa");

        int base = 8;
        int miercoles = 5;
        int jueves_pareja = 11;

        System.out.println("Número de entradas: ");
        int n = sc.nextInt();

        System.out.println("Día de la semana: ");
        String dia;
        dia = sc.next();

        System.out.println("¿Tiene TarjetaCampa?(s/n)");
        String respuesta;
        respuesta = sc.next();

        if (dia.equals("miércoles")) {
            if (respuesta.equals("s")) {
                System.out.println("Precio por entrada individual:   5,00€");
                double total_entrada = n * miercoles;
                System.out.println("Total de entradas:   " + total_entrada+"€");
                double descuento = 0.1 * total_entrada;
                System.out.println("Descuento:   " + descuento+"€");
                double a_pagar = total_entrada - descuento;
                System.out.println("A pagar:   " + a_pagar+"€");

            }
            if (respuesta.equals("n")) {
                System.out.println("Precio por entrada individual:   5,00€");
                double total_entrada = n * miercoles;
                System.out.println("Total de entradas:   " + total_entrada + "€");
                System.out.println("Descuento:   0€");
                System.out.println("A pagar:   " + total_entrada + "€");
            }
        }
        if (dia.equals("jueves")) {
            if (respuesta.equals("s")) {
                System.out.println("Precio por entrada individual:   8,00€");
                System.out.println("Precio especial del Jueves por cada pareja:   11,00€");
                if (n%2==0) {
                    int media = n/2;
                    double total_entrada = media*jueves_pareja;
                    System.out.println("Total de entradas:   "+total_entrada+"€");
                    double descuento = 0.1 * total_entrada;
                    System.out.println("Descuento:   "+descuento);
                    double a_pagar = total_entrada-descuento;
                    System.out.println("A pagar:   "+a_pagar+"€");
                }
                if (n%2==1) {
                    int media = (n-1)/2;
                    double total_entrada = media*jueves_pareja+base;
                    System.out.println("Total de entradas:   "+total_entrada+"€");
                    double descuento = 0.1 * total_entrada;
                    System.out.println("Descuento:   "+descuento+"€");
                    double a_pagar = total_entrada-descuento;
                    System.out.println("A pagar:   "+a_pagar+"€");
                }
            }
            if (respuesta.equals("n")) {
                System.out.println("Precio por entrada individual:   8,00€");
                System.out.println("Precio especial del Jueves por cada pareja:   11,00€");
                if (n%2==0) {
                    int media = n/2;
                    double total_entrada = media*jueves_pareja;
                    System.out.println("Total de entradas:   "+total_entrada+"€");
                    System.out.println("Descuento:   0€");
                    System.out.println("A pagar:   "+total_entrada+"€");
                }
                if (n%2==1) {
                    int media = (n-1)/2;
                    double total_entrada = media*jueves_pareja+base;
                    System.out.println("Total de entradas:   "+total_entrada+"€");
                    System.out.println("Descuento:   0€");
                    System.out.println("A pagar:   "+total_entrada+"€");
                }
            }
        }
        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("viernes") || dia.equals("sábado") || dia.equals("domingo")) {
            if (respuesta.equals("s")) {
                System.out.println("Precio por entrada individual:   8,00€");
                double total_entrada = n * base;
                System.out.println("Total de entradas:   " + total_entrada+"€");
                double descuento = 0.1 * total_entrada;
                System.out.println("Descuento:   " + descuento+"€");
                double a_pagar = total_entrada - descuento;
                System.out.println("A pagar:   " + a_pagar+"€");

            }
            if (respuesta.equals("n")) {
                System.out.println("Precio por entrada individual:   5,00€");
                double total_entrada = n * base;
                System.out.println("Total de entradas:   " + total_entrada + "€");
                System.out.println("Descuento:   0€");
                System.out.println("A pagar:   " + total_entrada + "€");
            }
        }
    }
}
