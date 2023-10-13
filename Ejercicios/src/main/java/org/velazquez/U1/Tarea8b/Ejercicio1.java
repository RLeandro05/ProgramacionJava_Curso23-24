package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oportunidad = 3;
        int respuesta;
        int numMin = 1000;
        int numMax = 9999;

        int combinacion = (int) (Math.random()*((numMax+1)-numMin)) +numMin;
        System.out.println(combinacion);

        System.out.println("Introduzca la combinación de la caja fuerte escrita en 4 cifras: ");
        respuesta = sc.nextInt();

        while (true) {

            if (respuesta != combinacion) {
                System.out.println("Lo siento, esa no es la combinación. Inténtelo de nuevo: ");
                respuesta = sc.nextInt();
                oportunidad--;
            }
            if (respuesta == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            }
            if (oportunidad == 0) {
                System.out.println("Todas las oportunidades han sido gastadas. Inténtelo de nuevo en 9 horas.");
                break;
            }
        }

    }
}
