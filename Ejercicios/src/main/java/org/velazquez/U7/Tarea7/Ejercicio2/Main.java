package org.velazquez.U7.Tarea7.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int contador = 0; // Contador para crear la lista

        List<Integer> listaInteger = new ArrayList<>();

        while (contador < 100) {
            listaInteger.add(contador+1); // Añadimos un valor + 1 en la lista

            contador++;
        }

        List<Integer> listaMultiplosSiete = listaInteger.stream() // Creamos el stream de tipo Integer, como la lista
                                            .filter(num -> num % 7 == 0) // Función lambda que devuelve el número si es múltiplo de 7
                                            .collect(Collectors.toList()); // El número devuelto por el filtro se queda guardado en la lista

        System.out.println("Lista de múltiplos de 7: "+listaMultiplosSiete); // Mostramos por pantalla la lista filtrada
    }
}
