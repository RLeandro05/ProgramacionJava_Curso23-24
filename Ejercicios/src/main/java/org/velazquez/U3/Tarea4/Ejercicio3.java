package org.velazquez.U3.Tarea4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Declaramos el máximo y mínimo de número de comensales por mesa*/
        int min = 0;
        int max = 4;

        /*Declaramos las mesas para mostrar en pantalla las que hay*/
        System.out.print("Nº mesas: ");
        int[] mesa = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i<mesa.length;i++) {
            System.out.print(mesa[i]+" ");
        }

        System.out.println();

        /*Declaramos primero un número aleatorio de comensales por mesa*/
        System.out.print("Ocupación: ");
        int[] ocupacion = new int[mesa.length];
        for (int i = 0; i<mesa.length; i++) {
            ocupacion[i] = (int) (Math.random()*((max+1)-min))+min;
            System.out.print(ocupacion[i]+" ");
        }

        int comensales;
        System.out.println();

        /*Ponemos un bucle while para poder actualizar los comensales de cada mesa*/
        while (true) {
            /*Indicamos primero el número de comensales que entrarán*/
            System.out.println("¿Cuántos son?: ");
            comensales = sc.nextInt();

            /*Si ponemos -1, salimos del programa*/
            if (comensales == -1) {
                System.out.println("Gracias. Hasta pronto.");
                break;
            }
            /*Por otra parte, cada mesa tiene como máximo 4 comensales, por lo que si supera el número al introducirlo
            , no se permitirá y volverá a pedir el número de comensales que entrarán*/
            if (comensales > 4) {
                System.out.println("Lo sentimos, sólo permitimos como máximo grupos de 4.");
            }
            else {
                /*Si no supera el máximo por mesa al entrar, establecemos un for siendo la i la posición de "ocupacion"*/
                for (int i = 0; i< mesa.length; i++) {
                    /*Indicamos la primera prioridad, la cual será buscar una mesa libre para los comensales*/
                    if (ocupacion[i] == 0) {
                        System.out.println("Hay hueco libre. Adelante");
                        ocupacion[i] = comensales;
                        break;
                    }
                    /*Si no hay mesas libres, optaos por la segunda prioridad, la cual será buscar mesas donde poder
                    ponerse para compartir*/
                    else if (i == mesa.length-1){
                        /*Este for también tendrá como posición de array "ocupación. Aquí vemos si al sumar el número
                        de comensales en la mesa más los que van a entrar pueden sentarse sin superar el límite*/
                        for (int j = 0; j<mesa.length; j++) {
                            if (ocupacion[j]+comensales <= 4) {
                                System.out.println("Lo sentimos, no hay hueco disponible. Tendrán que compartir" +
                                        " mesa.");
                                ocupacion[j] = comensales+ocupacion[j];
                                break;
                            }
                            /*Sin tampoco se puede compartir dependiendo del número de comensales que haya de ambos campos,
                            indicamos que no hay sitio disponible para el grupo de comensales, y volvermeos a preguntar
                            el número de comensales que entrarán*/
                            else if (j == mesa.length-1){
                                System.out.println("Lo sentimos. No hay hueco para ustedes.");
                            }
                        }
                    }
                }
            }

            /*Cada vez que se termine el for principal, lo actualizaremos en el array "ocupación" y volveremos
            a mostrar las mesas y esta vez las ocupaciones de comensales de cada mesa actualizado para el próximo
            grupo de comensales que entren*/
            System.out.print("Nº mesas: ");
            for (int i = 0; i<mesa.length;i++) {
                System.out.print(mesa[i]+" ");
            }

            System.out.println();

            System.out.print("Ocupación: ");
            for (int i = 0; i<mesa.length; i++) {
                System.out.print(ocupacion[i]+" ");
            }

            System.out.println();
        }
    }
}
