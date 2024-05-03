package org.velazquez.U7.Tarea1.Ejercicio2;

/*Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        Collections.sort(listaInteger, new Comparator<Integer>() { // Ordenamos en decreciente con un comparador
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(listaInteger); // Mostrar dicha lista ordenada
    }
}
