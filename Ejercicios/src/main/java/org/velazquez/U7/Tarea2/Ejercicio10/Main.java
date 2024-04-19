package org.velazquez.U7.Tarea2.Ejercicio10;

/*Hacer lo mismo que en el ejercicio anterior con la intersección ,
formada por los elementos comunes a los dos conjuntos. Su prototipo es:

Set interseccion (Set conjunto1, Set conjunto2)*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(); // Creamos el primer conjunto de tipo String
        // Añadimos algunos elementos
        conjunto1.add("Leandro");
        conjunto1.add("Adrian");
        conjunto1.add("Leonaida");
        conjunto1.add("Carlos");

        Set<String> conjunto2 = new HashSet<>(); // Creamos el segundo conjunto de tipo String
        // Añadimos algunos elementos
        conjunto2.add("Mariana");
        conjunto2.add("Leandro");
        conjunto2.add("Carlos");
        conjunto2.add("Adrian");

        Set<String> conjuntoResultado = interseccion(conjunto1, conjunto2); // Guardamos en un nuevo Set el conjuntoComun de la función

        System.out.println("Lista de elementos comunes en ambos conjuntos: "+conjuntoResultado); // Lo mostramos por pantalla
    }

    public static Set interseccion (Set conjunto1, Set conjunto2) { // Definimos la funcion "interseccion" para guardar los elementos comunes de ambos conjuntos

        Set<String> conjuntoComun = new HashSet<>(); // Creamos un conjunto donde guardaremos elementos comunes

        for (Object elemento : conjunto1) { // Iteramos cada elemento del primer conjunto
            if (conjunto2.contains(elemento)) { // Si dicho elemento está también el segundo conjunto, lo añadimos al conjuntoComun
                conjuntoComun.add(elemento.toString());
            }
        }

        return conjuntoComun; // Devolvemos el conjuntComun con los elementos comunes
    }
}
