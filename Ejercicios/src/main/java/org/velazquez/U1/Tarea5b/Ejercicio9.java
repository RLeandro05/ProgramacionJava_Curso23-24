package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca el día de su nacimiento: ");
        int dia = teclado.nextInt();

        System.out.println("Por favor, introduzca el mes de su nacimiento en número: ");
        int mes = teclado.nextInt();

        if (mes == 1) {
            if (dia >= 1 && dia <=19) {
                System.out.println("Usted es: Capricornio");
            }
            if (dia >=20 && dia <= 31) {
                System.out.println("Usted es: Acuario");
            }
        }
        if (mes == 2) {
            if (dia >= 1 && dia <= 18) {
                System.out.println("Usted es: Acuario");
            }
            if (dia >= 19 && dia <= 28) {
                System.out.println("Usted es: Piscis");
            }
        }
        if (mes == 3) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Usted es: Piscis");
            }
            if (dia >= 21 && dia <= 31) {
                System.out.println("Usted es: Aries");
            }
        }
        if (mes == 4) {
            if (dia >= 1 && dia <= 19) {
                System.out.println("Usted es: Aries");
            }
            if (dia >= 20 && dia <= 30) {
                System.out.println("Usted es: Tauro");
            }
        }
        if (mes == 5) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Usted es: Tauro");
            }
            if (dia >= 21 && dia <= 31) {
                System.out.println("Usted es: Géminis");
            }
        }
        if (mes == 6) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Usted es: Géminis");
            }
            if (dia >= 21 && dia <= 30) {
                System.out.println("Usted es: Cáncer");
            }
        }
        if (mes == 7) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Usted es: Cáncer");
            }
            if (dia >= 23 && dia <= 31) {
                System.out.println("Usted es: Leo");
            }
        }
        if (mes == 8) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Usted es: Leo");
            }
            if (dia >= 23 && dia <= 31) {
                System.out.println("Usted es: Virgo");
            }
        }
        if (mes == 9) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Usted es: Virgo");
            }
            if (dia >= 23 && dia <= 30) {
                System.out.println("Usted es: Libra");
            }
        }
        if (mes == 10) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Usted es: Libra");
            }
            if (dia >= 23 && dia <= 31) {
                System.out.println("Usted es: Escorpio");
            }
        }
        if (mes == 11) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Usted es: Escorpio");
            }
            if (dia >= 22 && dia <= 30) {
                System.out.println("Usted es: Sagitario");
            }
        }
        if (mes == 12) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Usted es: Sagitario");
            }
            if (dia >= 22 && dia <= 31) {
                System.out.println("Usted es: Capricornio");
            }
        }
    }
}
