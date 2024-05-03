package org.velazquez.U7.Tarea7.Ejercicio16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaEnteros = new ArrayList<>();

        int contador = 0;

        while (contador < 1000) {

            listaEnteros.add(contador);

            contador++;
        }

        List<Integer> listaEnterosImparesMultiplos = listaEnteros.stream().filter(entero -> entero%2 == 1 && (entero%3 == 0 || entero%5 == 0)).toList();

        System.out.println(listaEnterosImparesMultiplos);
    }
}
