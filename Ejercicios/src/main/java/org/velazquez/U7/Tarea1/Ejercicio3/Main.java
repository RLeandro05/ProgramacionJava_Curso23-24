package org.velazquez.U7.Tarea1.Ejercicio3;

/*Crear una colección de 20 números enteros aleatorios menores que 10,
guardarlos por orden decreciente a medida que se vayan generando y mostrar la colección por pantalla.*/

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        int min = 0; // Establecemos el mínimo
        int max = 9; // Establecemos el máximo menor que 10

        int contador = 0; // Contador para insertar 20 números en el ArrayList

        ArrayList<Integer> listaInteger = new ArrayList<>(); // Creación de ArrayList para enteros

        while (contador < 20) {

            int numAleatorio = (int) (Math.random()*(max + 1) - min) + min; // Número aleatorio para luego insertar en la lista

            listaInteger.add(numAleatorio); // Lo añadimos a la lista

            listaInteger.sort(new Comparator<Integer>() { // A medida que añadimos un nuevo elemento, volvemos a ordenar la lista en decreciente
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });

            contador++;
        }

        System.out.println(listaInteger); // Mostramos la lista por pantalla
    }
}
