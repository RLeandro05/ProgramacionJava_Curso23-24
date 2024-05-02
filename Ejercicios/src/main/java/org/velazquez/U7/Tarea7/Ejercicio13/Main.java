package org.velazquez.U7.Tarea7.Ejercicio13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> listaEnteros1 = new ArrayList<>();
        listaEnteros1.add(4);
        listaEnteros1.add(2);
        listaEnteros1.add(45);
        listaEnteros1.add(13);
        listaEnteros1.add(3);

        Collections.sort(listaEnteros1);

        List<Integer> listaEnteros2 = new ArrayList<>();
        listaEnteros2.add(2);
        listaEnteros2.add(1);
        listaEnteros2.add(40);
        listaEnteros2.add(67);

        Collections.sort(listaEnteros2);

        List<Integer> listaUnida = new ArrayList<>(listaEnteros1);
        listaUnida.addAll(listaEnteros2);

        List<Integer> listaUnidadOrdenada = listaUnida.stream().sorted().toList();

        System.out.println(listaUnidadOrdenada);


    }
}
