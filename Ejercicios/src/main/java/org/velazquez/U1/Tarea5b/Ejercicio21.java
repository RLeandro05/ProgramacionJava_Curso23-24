package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su cargo (1-3): ");
        System.out.println("1. Programador Junior");
        System.out.println("2. Programador Senior");
        System.out.println("3. Jefe de Proyecto");
        int n = sc.nextInt();

        if (n == 1) {
            int s_junior = 950;
            int viaje = 30;
            System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
            int n_clientes = sc.nextInt();

            System.out.println("Introduzca su estado civil (1-2: ");
            System.out.println("1. Soltero");
            System.out.println("2. Casado");
            int estado_civil = sc.nextInt();

            if (estado_civil == 1) {

                int sueldo_bruto = (s_junior + (n_clientes*viaje));
                double IRPF_sol_resta = (sueldo_bruto*(0.25));

                double TOTAL = (sueldo_bruto - IRPF_sol_resta);

                System.out.println("Sueldo neto: "+TOTAL+"€");


            }
            if (estado_civil == 2) {
                int sueldo_bruto = (s_junior + (n_clientes*viaje));
                double IRPF_sol_resta = (sueldo_bruto*(0.2));

                double TOTAL = (sueldo_bruto - IRPF_sol_resta);

                System.out.println("Sueldo neto: "+TOTAL+"€");
            }
        }

        if (n == 2) {
            int s_senior = 1200;
            int viaje = 30;
            System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
            int n_clientes = sc.nextInt();

            System.out.println("Introduzca su estado civil (1-2: ");
            System.out.println("1. Soltero");
            System.out.println("2. Casado");
            int estado_civil = sc.nextInt();

            if (estado_civil == 1) {

                int sueldo_bruto = (s_senior + (n_clientes*viaje));
                double IRPF_sol_resta = (sueldo_bruto*(0.25));

                double TOTAL = (sueldo_bruto - IRPF_sol_resta);

                System.out.println("Sueldo neto: "+TOTAL+"€");


            }
            if (estado_civil == 2) {
                int sueldo_bruto = (s_senior + (n_clientes*viaje));
                double IRPF_sol_resta = (sueldo_bruto*(0.2));

                double TOTAL = (sueldo_bruto - IRPF_sol_resta);

                System.out.println("Sueldo neto: "+TOTAL+"€");
            }
        }

        if (n == 3) {
            int s_jefe = 1600;
            int viaje = 30;
            System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
            int n_clientes = sc.nextInt();

            System.out.println("Introduzca su estado civil (1-2: ");
            System.out.println("1. Soltero");
            System.out.println("2. Casado");
            int estado_civil = sc.nextInt();

            if (estado_civil == 1) {

                int sueldo_bruto = (s_jefe + (n_clientes*viaje));
                double IRPF_sol_resta = (sueldo_bruto*(0.25));

                double TOTAL = (sueldo_bruto - IRPF_sol_resta);

                System.out.println("Sueldo neto: "+TOTAL+"€");


            }
            if (estado_civil == 2) {
                int sueldo_bruto = (s_jefe + (n_clientes*viaje));
                double IRPF_sol_resta = (sueldo_bruto*(0.2));

                double TOTAL = (sueldo_bruto - IRPF_sol_resta);

                System.out.println("Sueldo neto: "+TOTAL+"€");
            }
        }
    }
}
