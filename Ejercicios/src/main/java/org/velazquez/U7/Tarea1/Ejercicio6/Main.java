package org.velazquez.U7.Tarea1.Ejercicio6;

/*Introducir por teclado, hasta que se introduzca "fin",
una serie de nombres que se insertarán en una colección,
de forma que se conserve el orden de inserción y que no puedan repetirse.
Mostrar la estructura por pantalla.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaString = new ArrayList<>(); // Creamos el ArrayList de String para añdir nombres

        String nombre = ""; // Inicializamos la variable de cadena para insertar nombres

        while (!nombre.equals("fin")) { // Mientras el nombre no sea "fin", irá añadiendo en la lista
            System.out.println("Escriba un nombre: ");
            nombre = sc.next(); // Insertamos por teclado un nuevo nombre

            if (!listaString.contains(nombre) && !nombre.equals("fin")) { // Si el nombre no está en la lista y no es la palabra fin para salir, la insertará en la lista de nombres
                listaString.add(nombre);
            } else { // Si no se cumple, no se añadirá y se le comentará dicho problema al usuario
                System.out.println("La lista ya contiene el nombre "+nombre+".");
            }
        }

        System.out.println("Nombres: "+listaString); // Mostramos por pantalla la lista de nombres
    }
}
