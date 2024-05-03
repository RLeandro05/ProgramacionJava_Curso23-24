package org.velazquez.U7.Tarea1.Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaString = new ArrayList<>(); // Creamos la lista de nombres

        String nombre = ""; // Creación de nombres para insertar

        System.out.println("Introduzca un nombre: ");
        nombre = sc.next(); // Insertamos el primer nombre para poder comparar

        listaString.add(nombre);

        while (!nombre.equals("fin")) { // Mientras la palabra no sea fin, seguiremos añadiendo nombres

            System.out.println("Introduzca un nombre: ");
            nombre = sc.next();

            if (!listaString.contains(nombre)) { // Vemos si está ya en la lista
                if (!nombre.equals("fin")) { // Vemos si no es fin
                    for (int i = 0; i < listaString.size(); i++) { // Recorremos cada elemento de la lista con un índice

                        int comparacion = listaString.get(i).compareTo(nombre); // Por cada índice, gaurdamos la comparación con el nombre

                        if (comparacion >= 0) { // Si llega a ser mayor que el anterior, no lo añadimos
                            if (i == listaString.size() - 1) { // En cuanto llegue al final, si sigue siendo maror, se le comentará que no se añade porque no sigue le orden alfabético
                                System.out.println("La inserción no va en orden alfabético");
                                break;
                            }
                        } else if (i == listaString.size() - 1){ // Si el nombre es mayor y llegó al final de la lista, se inserta en la lista
                            listaString.add(nombre);
                            break;
                        }
                    }
                }
            } else {
                System.out.println(nombre+" ya está incluid@"); // Si ya está incluido, no se inserta y se comenta al usuario
            }
        }

        System.out.println(listaString); // Mostramos la lista por pantalla
    }
}
