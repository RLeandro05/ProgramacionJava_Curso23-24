package org.velazquez.U4.Tarea1.Ejercicio7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EmisoraFM {
    private final int HZmin = 80;
    private final int HZmax = 108;
    private float frecuencia = HZmin;
    private final float operador = 0.5f;

    /*Función de interfaz de Radio FM*/
    public void interfaz() {
        Scanner sc = new Scanner(System.in);

        int decision;

        System.out.println("¡Bienvenido a la interfaz de la Radio! Por favor, seleccione qué desea hacer: ");
        while (true){
            System.out.println("1. Subir frecuencia");
            System.out.println("2. Bajar frecuencia");
            System.out.println("3. Mostrar frecuencia actual");
            System.out.println("4. Apagar");

            decision = sc.nextInt();

            switch (decision) {
                /*Primer caso para sumar la frecuencia de la radio*/
                case 1:
                    frecuencia += operador;

                    if (frecuencia > HZmax) {
                        frecuencia = HZmin;
                    }
                    break;
                /*Segundo caso para restar la frecuencia de la radio*/
                case 2:
                    frecuencia -= operador;

                    if (frecuencia < HZmin) {
                        frecuencia = HZmax;
                    }
                    break;
                /*Tercer caso para mostrar la frecuencia actual de la radio*/
                case 3:
                    System.out.println("Frecuencia actual: "+frecuencia);
                    break;
                /*Cuarto caso para apagar la radio*/
                case 4:
                    System.out.println("Apagando...");
                    break;
            }

            /*Decisión para apagar la radio*/
            if (decision == 4) {
                break;
            }

            System.out.println("¿Qué más quiere hacer?");
        }
    }
}
