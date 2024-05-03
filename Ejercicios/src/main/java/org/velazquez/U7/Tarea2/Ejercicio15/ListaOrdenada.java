package org.velazquez.U7.Tarea2.Ejercicio15;

import java.util.LinkedList;

public class ListaOrdenada <E extends Comparable<E>> extends LinkedList<E> { // Implementamos una lista además del Comparable para poder aplicar las comparaciones de la lista correctamente

    public void insertarOrdenado(E elemento) { // Definimos el método "insertarOrdenado"

        if (isEmpty()) { // Si al principio está vacía, simplemente añadimos el elemento
            add(elemento);
        } else { // En cuanto ya tenga algo, primero vamos a recorrer la lista
            for (int i = 0; i < size(); i++) {
                E elementoLista = get(i); // Añadimos en una variable el elemento de la posición de la lista

                if (elemento.compareTo(elementoLista) < 0) { // Si vemos que el elemento proporcionado es menor a el de la lista, lo añadimos en esa posición para ordenar la lista
                    add(i, elemento);
                    break;
                } else if (i == size() - 1) { // Si nunca ha llegado a ser menor que ningún elemento de la lista, simplemente se añadirá al final para terminr la ordenación correctamente
                    add(elemento);
                    break;
                }
            }
        }
    }
}
