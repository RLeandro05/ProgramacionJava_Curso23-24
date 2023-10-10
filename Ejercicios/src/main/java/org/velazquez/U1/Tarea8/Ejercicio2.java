package org.velazquez.U1.Tarea8;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int alumnos = 0;
        int mayor_de_edad = 0;
        int suma = 0;

        System.out.println("Introduzca la edad de un alumno: ");
        edad = sc.nextInt();

        while (edad > 0) {

            if (edad>=18) {
                mayor_de_edad++;
            }
            alumnos++;
            suma = suma + edad;

            System.out.println("Introduzca la edad de otro alumno: ");
            edad = sc.nextInt();
        }


        System.out.println("La media de edad es: "+suma/alumnos);
        System.out.println("La cantidad de alumnos es: "+alumnos);
        System.out.println("La cantidad de alumnos mayores de edad es: "+mayor_de_edad);


    }
}
