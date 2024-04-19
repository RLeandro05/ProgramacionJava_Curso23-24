package org.velazquez.U7.Tarea2.Ejercicio12;

/*Escribir el método incluido(), que devuelve true si todos los elementos del
primer conjunto pertenecen al segundo y false si hay algún elemento del
primero que no pertenezca al segundo.
Su prototipo es:

boolean incluido(Set conjunto1, Set conjunto2)*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(); // Creamos un primer conjunto de tipo String
        // Añadimos algunos elementos
        conjunto1.add("Leandro");
        conjunto1.add("Leonaida");
        conjunto1.add("Adrian");
        conjunto1.add("Carlos");

        Set<String> conjunto2 = new HashSet<>(); // Creamos un segundo conjunto de tipo String
        // Añadimos algunos elementos
        conjunto2.add("Leonaida");
        conjunto2.add("Adrian");
        conjunto2.add("Mario");
        conjunto2.add("Alfonso");

        if (incluido(conjunto1, conjunto2)) { // A partir de la función "incluido", si es true, todos los elementos del conjunto1 están en el conjunto2
            System.out.println("Todos los elementos del conjunto1 pertenecen al conjunto2");
        } else { // Devolverá false si hay como mínimo un elemento del conjunto1 que no está en el conjunto2
            System.out.println("Al menos un elemento del conjunto1 no pertenece al conjunto2");
        }
    }

    public static boolean incluido(Set conjunto1, Set conjunto2) { // Definimos la función "incluido"

        for (Object elemento : conjunto1) { // Iteramos cada elemento del conjunto1
            if (!conjunto2.contains(elemento)) { // En cuanto encuentre un elemento que no esté en el ssegundo conjunto, devolverá false
                return false;
            }
        }

        return true; // Si todos los elementos están en el segundo, devolverá true
    }
}
