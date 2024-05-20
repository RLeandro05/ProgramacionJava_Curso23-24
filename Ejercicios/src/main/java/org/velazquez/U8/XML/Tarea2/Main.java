package org.velazquez.U8.XML.Tarea2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main implements Serializable {
    public static void main(String[] args) {

        Persona p1 = new Persona("Leandro", 19);
        Persona p2 = new Persona("Maria", 27);
        Persona p3 = new Persona("Laura", 29);
        Persona p4 = new Persona("Adrian", 19);
        Persona p5 = new Persona("Chema", 55);

        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);

        System.out.println("---------------------------------------------------");

        OperacionesconPersonas operaciones = new OperacionesconPersonas();

        operaciones.almacenarPersonas(listaPersonas);

        System.out.println("---------------------------------------------------");

        operaciones.crearXML();

        System.out.println("---------------------------------------------------");
    }
}
