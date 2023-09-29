package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca la hora actual sin minutos: ");
        int hora = teclado.nextInt();

        System.out.println("Por favor, introduzca los minutos de la hora actual: ");
        int minutos = teclado.nextInt();

        int calculo1 = (int) (hora*3600);
        int calculo2 = (int) (minutos*60);
        int calculo3 = (int) (calculo1+calculo2);
        int resultado = (int) (86400-calculo3);

        System.out.println("Los segundos que faltan para que llegue la media noche son: "+resultado+" s");
    }
}
