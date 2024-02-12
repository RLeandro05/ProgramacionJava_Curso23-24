package org.velazquez.U5.Tarea2.Ejercicio2;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        /*Creación del array de clientes y la adición de cada uno con datos aleatorios*/
        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("456", "Ana", 30, 1500.0);
        clientes[1] = new Cliente("123", "Juan", 22, 1000.0);
        clientes[2] = new Cliente("789", "Carlos", 22, 800.0);
        clientes[3] = new Cliente("234", "María", 28, 1200.0);
        clientes[4] = new Cliente("567", "Laura", 35, 2000.0);

        /*Ordenación por DNI*/
        Arrays.sort(clientes);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
        System.out.println();

        /*Ordenación por Nombre*/
        Arrays.sort(clientes,
                new Comparator<Cliente>() {
                    @Override
                    public int compare(Cliente o1, Cliente o2) {
                        return o1.getNombre().compareTo(o2.getNombre());
                    }
                });
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
        System.out.println();

        /*Ordenación por Edad*/
        Arrays.sort(clientes,
                new Comparator<Cliente>() {
                    @Override
                    public int compare(Cliente o1, Cliente o2) {
                        if (o1.getEdad() < o2.getEdad()) {
                            return -1;
                        } else if (o1.getEdad() > o2.getEdad()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
    }
}
