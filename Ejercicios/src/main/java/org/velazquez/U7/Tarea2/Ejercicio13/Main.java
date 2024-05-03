package org.velazquez.U7.Tarea2.Ejercicio13;

/*Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista,
fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir,
que las listas utilizadas como parámetros de entrada se mantengan intactas.*/

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto1 = new TreeSet<>(); // Creamos un primer conjunto TreeSet, el cual ordena automáticamente los elementos
        // Añadimos elementos
        conjunto1.add("Leandro");
        conjunto1.add("Alfonso");
        conjunto1.add("Zara");

        Set<String> conjunto2 = new TreeSet<>(); // Creamos un segundo conjunto TreeSet, el cual ordena automáticamente los elementos
        // Añadimos elementos
        conjunto2.add("Bobi");
        conjunto2.add("Mario");
        conjunto2.add("Marina");

        Set<String> conjuntoResultado = unionOrdenada(conjunto1, conjunto2); // Guardamos en un conjuntoResultado el conjunto unido y ordenado de la función

        System.out.println("Lista unida y ordenada: "+conjuntoResultado); // Lo mostramos por pantalla
    }

    public static Set unionOrdenada (Set conjunto1, Set conjunto2) { // Definimos la función "unionOrdenada"

        Set<String> conjuntoOrdenadoUnido = new TreeSet<>(conjunto1); // Creamos un conjunto que contenga los elementos de un conjunto

        conjuntoOrdenadoUnido.addAll(conjunto2); // Seguidamente, añadimos los elementos del otro conjunto

        return conjuntoOrdenadoUnido; // Devolvemos el conjuntoOrdenadoUnido, el cual ya tendrá todos lo elementos ordenados al ser TreeSet
    }
}
