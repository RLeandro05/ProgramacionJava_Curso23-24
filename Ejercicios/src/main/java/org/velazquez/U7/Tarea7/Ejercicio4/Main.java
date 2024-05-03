package org.velazquez.U7.Tarea7.Ejercicio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] tabla = {"me","gustan","los","macarrones"}; // Tabla donde almacenamos la frase

        List<String> listaPalabrasOrdenadas = Arrays.stream(tabla) // Creamos un Stream de tipo String como la tabla
                                                .sorted() // La ordenamos alfabéticamente
                                                    .collect(Collectors.toList()); // Guardamos dichas palabras ordenadas en la lista

        System.out.println("Cadena ordenada alfabéticamente: "+listaPalabrasOrdenadas); // Mostramos por pantalla la lista ordenada
    }
}
