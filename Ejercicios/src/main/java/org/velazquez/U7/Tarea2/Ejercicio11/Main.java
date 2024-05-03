package org.velazquez.U7.Tarea2.Ejercicio11;

/*Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al primero,
pero no al segundo). Con el prototipo:

Set diferencia (Set conjunto1, Set conjunto2)*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(); // Creamos un conjunto de tipo String

        // Guardamos algunos elementos, dejando al menos uno que no estará en el segundo conjunto
        conjunto1.add("uno");
        conjunto1.add("dos");
        conjunto1.add("tres");

        Set<String> conjunto2 = new HashSet<>(); // Creamos un segundo conjunto de tipo String

        // Guardamos algunos elementos, repitiendo algunos del primer conjunto para realizar el cejercicio correctamente
        conjunto2.add("uno");
        conjunto2.add("cuatro");
        conjunto2.add("tres");

        Set<String> conjuntoFinal = diferencia(conjunto1, conjunto2); // Creamos un conjunto con el valor resultado de la función "diferencia"

        System.out.println("Elementos que están en conjunto1 pero no en conjunto2: "+conjuntoFinal); // Mostramos por pantalla los elementos pertenecientes al conjunto1 pero no que a su vez, no se presentan en el conjunto2
    }
    public static <T> Set<T> diferencia (Set<T> conjunto1, Set<T> conjunto2) { // Creamos la función "diferencia"

        Set<T> conjuntoNuevo = new HashSet<>(); // Creamos un nuevo conjunto resultado

        for (T elemento:conjunto1) { // Usamos un for-each para ahorrar el .toArray()[] a la hora de iterar cada valor del conjunto1

            if (!conjunto2.contains(elemento)) { // Si en el conjunto2 no se presenta dicho elemento del conjunto1, se añadirá el conjunto resultado
                conjuntoNuevo.add(elemento);
            }
        }

        return conjuntoNuevo; // Devolvemos el conjunto resultado
    }
}
