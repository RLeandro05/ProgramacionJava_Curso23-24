package org.velazquez.U5.Tarea1.Ej9;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        /*Creación del array de Electrodomésticos*/
        Electrodomestico[] array_el = new Electrodomestico[10];

        array_el[0] = new Lavadora();
        array_el[1] = new Lavadora(120, 45);
        array_el[2] = new Lavadora(45, 20);
        array_el[3] = new Lavadora(150, 80);
        array_el[4] = new Lavadora(Electrodomestico.Consumo.A, Electrodomestico.Color.Rojo, 135, 56, 12);
        array_el[5] = new Television();
        array_el[6] = new Television(120, 45);
        array_el[7] = new Television(45, 20);
        array_el[8] = new Television(150, 80);
        array_el[9] = new Television(Electrodomestico.Consumo.A, Electrodomestico.Color.Rojo, 135, 56, 24, true);

        for (int i = 0; i < array_el.length; i++) {
            System.out.println(array_el[i]);
        }

        System.out.println();
        System.out.println();

        /*Creación del array Lavadoras*/
        Lavadora[] array_la = new Lavadora[5];

        array_la[0] = new Lavadora();
        array_la[1] = new Lavadora(120, 45);
        array_la[2] = new Lavadora(45, 20);
        array_la[3] = new Lavadora(150, 80);
        array_la[4] = new Lavadora(Electrodomestico.Consumo.A, Electrodomestico.Color.Rojo, 10, 56, 12);

        /*Ordenación por carga*/
        Arrays.sort(array_la);
        for (int i = 0; i < array_la.length; i++) {
            System.out.println(array_la[i]);
        }

        System.out.println();
        System.out.println();

        /*Ordenación por Precio Final*/
        Arrays.sort(array_la,
                new Comparator<Lavadora>() {
                    @Override
                    public int compare(Lavadora o1, Lavadora o2) {
                        if (o1.getPrecioFinal() < o2.getPrecioFinal()) {
                            return -1;
                        } else if (o1.getPrecioFinal() > o2.getPrecioFinal()) {
                            return 1;
                        }
                        return 0;
                    }
                });
        for (int i = 0; i < array_la.length; i++) {
            System.out.println(array_la[i]);
        }
    }
}
