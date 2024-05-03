package org.velazquez.U7.Tarea7.Ejercicio14;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> streamEnteros = Stream.of(2, 5, 23, 6);

        int producto = streamEnteros.reduce(1, (a, b) -> a*b);

        System.out.println(producto);
    }
}
