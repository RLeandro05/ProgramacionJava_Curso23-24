package org.velazquez.U7.Tarea2.Ejercicio1;

/*Implementar el método unión de dos conjuntos,
que devuelva un nuevo conjunto con todos los elementos que pertenezcan, al menos,
a uno de los dos conjuntos. Su prototipo es:

Set union (Set conjunto1, Set conjunto2)*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto1 = new HashSet<>(); // Creamos un Set genérico de tipo HashSet para no dar errores
        // Añadimos algunos elementos String
        conjunto1.add("Goku");
        conjunto1.add("Vegeta");
        conjunto1.add("Gohan");

        Set<String> conjunto2 = new HashSet<>(); // Creamos un segundo Set genérico de tipo HashSet para no dar errores
        // Añadimos algunos elementos String
        conjunto2.add("Satan");
        conjunto2.add("Krillin");
        conjunto2.add("Videl");

        Set<String> nuevoconjunto = union(conjunto1, conjunto2); // Creamos un conjunto nuevo y le añadimos el conjuntoUnion de la función anterior

        System.out.println(nuevoconjunto); // Mostramos por pantalla el conjunto
    }
    public static <T> Set<T> union(Set<T> conjunto1, Set<T> conjunto2) { // Creamos el método "union", indicando un tipo genérico en Set para no dar errores
        Set<T> conjuntoUnion = new HashSet<>(conjunto1); // Creamos un nuevo Set genérico de tipo "T", es decir, que usará cualquier tipo de valor. Además, se le añade el contenido del conjunto1
        conjuntoUnion.addAll(conjunto2); // Añadimos en el nuevo conjunto (que tiene los elementos del conjunto1) los elementos del conjunto2
        return conjuntoUnion; // Returnamos el nuevo conjunto con la unión de ambos conjuntos
    }
}
