package org.velazquez.U7.Tarea1.Ejercicio8;

/*Implementar una función a la que se le pase una lista de nombres y
devuelva una copia sin elementos repetidos (sin modificar la original), con el prototipo:

List eliminaRepetidos (List c)*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> c = new ArrayList<>(); // Creamos una lista

        // Añadimos algunos valores con algunos duplicados
        c.add("ADRIANA");
        c.add("LEANDRO");
        c.add("LAURA");
        c.add("ADRIANA");
        c.add("LAURA");
        c.add("GONZALO");

        System.out.println("Lista sin nombres repetidos: "+eliminaRepetidos(c)); // Mostramos por pantalla el resultado de la lista sin repetidos de la función "eliminaRepetidos"
    }
    public static List eliminaRepetidos (List c) { // Definición de la función "eliminaRepetidos" para eliminar los duplicados

        List<String> cCopia = new ArrayList<>(); // Creamos una lista copia de la otra para añadir los elementos sin que se dupliquen

        for (int i = 0; i < c.size(); i++) { // Recorremos la lista proporcionada

            if (!cCopia.contains(c.get(i))) { // Mientras en la copia no esté el siguiente elemento de la lista proporcionada, se añade en la copia
                cCopia.add(c.get(i).toString());
            }
        }

        return cCopia; // Devolvemos la lista sin repetidos
    }
}
