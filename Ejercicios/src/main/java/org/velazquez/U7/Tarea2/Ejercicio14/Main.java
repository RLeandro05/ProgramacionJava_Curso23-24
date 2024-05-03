package org.velazquez.U7.Tarea2.Ejercicio14;

/* Implementar la función leeCadena con el siguiente prototipo:

List<Character> leeCadena()
Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("La lista de caracteres de la palabra asignada es: "+leeCadena()); // Mostramos por pantalla la lista de caracteres de la palabra
    }

    public static List<Character> leeCadena() { // Definimos la función "leeCadena"

        String palabra = "Leandro"; // Asignamos una palabra aleatoria

         List<Character> listaCaracteres = new ArrayList<>(); // Creamos una lista de caracteres donde gaurdaremos cada uno de la palabra asignada

        for (int i = 0; i < palabra.length(); i++) { // Recorremos cada caracter de la palabra
            char c = palabra.charAt(i);
            listaCaracteres.add(c); // Una vez sacamos el caracter, lo añadimos a la lista
        }

        return listaCaracteres; // Devolvemos la lista
    }
}
