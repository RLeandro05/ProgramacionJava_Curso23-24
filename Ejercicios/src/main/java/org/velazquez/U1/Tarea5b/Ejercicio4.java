package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, inroduzca el número de horas que ha trabajado esta semana: ");
        int horas = teclado.nextInt();

        if (horas <= 40) {
            int resultado = (int) (horas*12);
            System.out.println("El salario semanal que le pertenece es de: "+resultado+"€");
        }
        if (horas > 40) {
            int calculo1 = (int) (horas-40);
            int calculo2 = (int) (calculo1*16);
            int calculo3 = (int) (40*12);
            int resultado2 = (int) (calculo2+calculo3);

            System.out.println("El salario semanal que le pertenece es de: "+resultado2+"€");

        }
    }
}
