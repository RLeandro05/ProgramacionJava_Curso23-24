package org.velazquez.U7.Tarea2.Ejercicio15;

/*Definir una clase ListaOrdenada, que hereda de LinkedList, que permita la inserción ordenada.
Codificar un método que inserte un nuevo elemento con el prototipo:

void insertarOrdenado( E elemento)*/

public class Main {
    public static void main(String[] args) {

        ListaOrdenada<Integer> lista = new ListaOrdenada<>(); // Al haber implementado correctamente el comparable y la lista
                                                                // (Da igual si es Linked o Array),
                                                                // procedemos a realizar las operaciones

        // Añadimos algunos elementos
        lista.insertarOrdenado(1);
        lista.insertarOrdenado(5);
        lista.insertarOrdenado(2);
        lista.insertarOrdenado(10);
        lista.insertarOrdenado(3);
        lista.insertarOrdenado(0);

        // Sin usar un tipo genérico, no habría que implementar el comparable. únicamente se implementa cuando es genérico
//        ListaOrdenada lista = new ListaOrdenada();
        // Ejemplo con cadenas de texto
//        lista.insertarOrdenado("Leandro");
//        lista.insertarOrdenado("Adrian");
//        lista.insertarOrdenado("Leonaida");
//        lista.insertarOrdenado("Zara");
//        lista.insertarOrdenado("Mariana");

        System.out.println(lista); // Al mostrar en pantalla la lista, veremos que está ordenada correctamente
    }
}
