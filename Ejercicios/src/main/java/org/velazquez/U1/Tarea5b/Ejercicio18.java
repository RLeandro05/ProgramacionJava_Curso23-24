package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba la nota del primer control: ");
        double nt1 = teclado.nextInt();

        System.out.println("Escriba la nota del segundo control: ");
        double nt2 = teclado.nextInt();

        double media = ((nt1+nt2)/2);

        if (media >= 5) {
            System.out.println("Tu nota media es: "+media);
        }
        else {
            System.out.println("Escriba el resultado de la recuperación en 'apto' o 'no apto': ");
            String nt_R;
            nt_R = teclado.next();

            if (nt_R.equals("apto") || nt_R.equals("Apto")) {
                System.out.println("Tu nota media es: 5");
            }
            else {
                System.out.println("Tu nota media es: "+media);
            }
        }
    }
}
