package org.velazquez.U7.Tarea1.Ejercicio1;

/*Crear una colección de 20 números enteros aleatorios menores que 100,
y guardarlos en el orden en que se vayan generando;
mostrar por pantalla dicha lista una vez creada.
Ordenarla en sentido creciente y volverla a mostrar por pantalla.*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int min = 0; // Definimos mínimo
        int max = 99; // Definimos máximo menor que 100

        int contador = 0; //Definimos contador para insertar hasta 20 números aleatorios

        ArrayList<Integer> listaInteger = new ArrayList<>(); // Definimos un ArrayList de tipo Integer

        while (contador < 20) {

            int numAleatorio = (int) (Math.random()*(max + 1) - min) + min; // Generamos números aleatorios

            listaInteger.add(numAleatorio); // Por cada número nuevo, lo añadimos con .add

            contador++;
        }

        System.out.println(listaInteger); // Mostrar dicha lista una vez creada

        Collections.sort(listaInteger); // Ordenamos en orden natural (creciente)

        System.out.println(listaInteger); // Mostrar dicha lista ordenada
    }
}
