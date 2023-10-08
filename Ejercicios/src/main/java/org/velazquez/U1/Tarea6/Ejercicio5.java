package org.velazquez.U1.Tarea6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca una opción para calcular: ");
        System.out.println("1. Diámetro");
        System.out.println("2. Perímetro");
        System.out.println("3. Area");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Introduzca el valor del radio: ");
                double radio = sc.nextDouble();
                double resultado = 2*radio;

                System.out.println("El diámetro es: "+resultado);
                break;

            case 2:
                System.out.println("Introduzca el valor del radio: ");
                double radio2 = sc.nextDouble();
                double resultado2 = 2*3.14*radio2;

                System.out.println("El perímetro es: "+resultado2);
                break;

            case 3:
                System.out.println("Intoduzca el valor del radio: ");
                double radio3 = sc.nextDouble();
                double resultado3 = 3.14*radio3*radio3;

                System.out.println("El área es: "+resultado3);
                break;
        }
    }
}
