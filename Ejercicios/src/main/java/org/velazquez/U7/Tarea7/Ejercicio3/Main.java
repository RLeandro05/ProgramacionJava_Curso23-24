package org.velazquez.U7.Tarea7.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        int contador = 0;

        // Definición de dos listas
        List<Integer> listaInteger1 = new ArrayList<>();
        List<Integer> listaInteger2 = new ArrayList<>();

        while (contador < 20) { // Añadimos números aleatorios a ambas listas hasta 20 números

            int numAleatorio = (int) (Math.random()*(max + 1) - min) + min;

            listaInteger1.add(numAleatorio);

            numAleatorio = (int) (Math.random()*(max + 1) - min) + min;

            listaInteger2.add(numAleatorio);

            contador++;
        }

        List<Integer> listaUnida = new ArrayList<>(listaInteger1); // Con una lista conjunta, añadimos los elementos de ambas listas
        listaUnida.addAll(listaInteger2);

        List<Integer> listaOrdenadaSinRepeticiones = listaUnida.stream() // Creamos el Stream de tipo Integer como la lista
                                                     .distinct() // Filtramos los números sin guardar sus repetidos, es decir, mostrará un número una sola vez y el repetido no se guardará
                                                        .sorted() // Ordenamos el Stream
                                                            .collect(Collectors.toList()); // Lo guardamos en el Stream

        System.out.println("Lista ordenada y sin repeticiones: "+listaOrdenadaSinRepeticiones); // Mostramos por pantalla la nueva lista
    }
}
