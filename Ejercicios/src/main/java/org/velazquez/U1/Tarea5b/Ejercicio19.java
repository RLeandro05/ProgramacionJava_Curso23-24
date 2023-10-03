package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un día: ");
        String dia;
        dia = sc.next();

        System.out.println("Introduce la hora solo en horas: ");
        int hora = sc.nextInt();

        System.out.println("Introduce la hora solo en minutos: ");
        int min = sc.nextInt();

        int calculo1 = (hora*60);
        int resto = (calculo1+min);

        if (dia.equals("lunes") || dia.equals("Lunes")) {
            int semana = (((24*5)*60)-(15*60));

            int lunes = ((24*60)-resto);

            int resultado = (semana - lunes);

            System.out.println("Quedan: "+resultado+" min.");
        }
        if (dia.equals("martes") || dia.equals("Martes")) {
            int semana = (((24*4)*60)-(15*60));

            int martes = ((24*60)-resto);

            int resultado = (semana - martes);

            System.out.println("Quedan: "+resultado+" min.");
        }
        if (dia.equals("miércoles") || dia.equals("Miércoles")) {
            int semana = (((24*3)*60)-(15*60));

            int miercoles = ((24*60)-resto);

            int resultado = (semana - miercoles);

            System.out.println("Quedan: "+resultado+" min.");
        }
        if (dia.equals("jueves") || dia.equals("Jueves")) {
            int semana = (((24*2)*60)-(15*60));

            int jueves = ((24*60)-resto);

            int resultado = (semana - jueves);

            System.out.println("Quedan: "+resultado+" min.");
        }
        if (dia.equals("viernes") || dia.equals("Viernes")) {
            int semana = ((24*60)-(15*60));

            int viernes = ((24*60)-resto);

            int resultado = (semana - viernes);

            System.out.println("Quedan: "+resultado*-1+" min.");
        }




    }
}
