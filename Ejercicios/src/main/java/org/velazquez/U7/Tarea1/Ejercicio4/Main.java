package org.velazquez.U7.Tarea1.Ejercicio4;

/*Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla
las palabras que estén repetidas. A continuación, mostrar las que no lo estén.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase aleatoria: ");
        String frase = sc.nextLine(); // Papas con mas papas y papas con lechuga y aceituna

        ArrayList<String> listaString = new ArrayList<>(); // Creamos una lista para almacenar todas las palabras
        ArrayList<String> repetidasString = new ArrayList<>(); // Creamos una lista donde guarde las repetidas en en la lista principal
        ArrayList<String> noRepetidasString = new ArrayList<>(); // Creamos una lista donde guarde las no repetidas en en la lista principal

        String aux = ""; // Auxiliar para almacenar las palabras

        for (int i = 0; i < frase.length(); i++) { // Recorremos la frase para guardar palabra por palabra

            if (frase.charAt(i) != ' ') { // No guardamos el espacio para evitar errores
                aux += frase.charAt(i);
            }

            if (frase.charAt(i) == ' ' || i == frase.length() - 1) { // Si llegamos al caracter del espacio o llega al final, vemos lo siguiente
                if (listaString.contains(aux)) { // Si la palabra ya estaba en la lista, la quitamos de las no repetidas y la ponemos en las repetidas
                    noRepetidasString.remove(aux);
                    repetidasString.add(aux);
                } else { // Si no es asñi, se quedará en las no repetidas
                    noRepetidasString.add(aux);
                }

                listaString.add(aux); // Luego, la añadimos después para evitar errores
                aux = ""; // Reiniciamos la auxiliar para la siguiente palabra
            }
        }

        System.out.println("Repetidas: "+repetidasString); // Mostramos por pantalla la lista de las repetidas
        System.out.println("No Repetidas: "+noRepetidasString); // Mostramos por pantalla la lista de las no repetidas
    }
}
