package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base imponible: ");
        double base = sc.nextInt();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String IVA;
        IVA = sc.next();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promo;
        promo = sc.next();

        if (IVA.equals("general")) {
            double IVAg = 21;
            double IVAG = ((IVAg / 100) * base);
            double precio_IVAg = (base + IVAG);

            if (promo.equals("nopro")) {
                System.out.println("TOTAL: " + precio_IVAg+"€");
            }
            if (promo.equals("mitad")) {
                double precio_IVAg_mitad = (precio_IVAg / 2);
                System.out.println("TOTAL: " + precio_IVAg_mitad+"€");
            }
            if (promo.equals("meno5")) {
                double precio_IVAg_meno5 = (precio_IVAg - 5);
                System.out.println("TOTAL: "+precio_IVAg_meno5+"€");
            }
            if (promo.equals("5porc")) {
                double cinco_porc = (precio_IVAg * 5/100);
                double precio_IVAg_5porc = (precio_IVAg - cinco_porc);
                System.out.println("TOTAL: "+precio_IVAg_5porc+"€");

            }
        }

        if (IVA.equals("reducido")) {
            double IVAr = 10;
            double IVAR = ((IVAr / 100) * base);
            double precio_IVAr = (base + IVAR);

            if (promo.equals("nopro")) {
                System.out.println("TOTAL: " + precio_IVAr+"€");
            }
            if (promo.equals("mitad")) {
                double precio_IVAr_mitad = (precio_IVAr / 2);
                System.out.println("TOTAL: " + precio_IVAr_mitad+"€");
            }
            if (promo.equals("meno5")) {
                double precio_IVAr_meno5 = (precio_IVAr - 5);
                System.out.println("TOTAL: "+precio_IVAr_meno5+"€");
            }
            if (promo.equals("5porc")) {
                double cinco_porc = (precio_IVAr * 5/100);
                double precio_IVAr_5porc = (precio_IVAr - cinco_porc);
                System.out.println("TOTAL: "+precio_IVAr_5porc+"€");

            }
        }
        if (IVA.equals("superreducido")) {
            double IVAsr = 4;
            double IVASR = ((IVAsr / 100) * base);
            double precio_IVAsr = (base + IVASR);

            if (promo.equals("nopro")) {
                System.out.println("TOTAL: " + precio_IVAsr+"€");
            }
            if (promo.equals("mitad")) {
                double precio_IVAsr_mitad = (precio_IVAsr / 2);
                System.out.println("TOTAL: " + precio_IVAsr_mitad+"€");
            }
            if (promo.equals("meno5")) {
                double precio_IVAsr_meno5 = (precio_IVAsr - 5);
                System.out.println("TOTAL: "+precio_IVAsr_meno5+"€");
            }
            if (promo.equals("5porc")) {
                double cinco_porc = (precio_IVAsr * 5/100);
                double precio_IVAsr_5porc = (precio_IVAsr - cinco_porc);
                System.out.println("TOTAL: "+precio_IVAsr_5porc+"€");

            }
        }


    }
}