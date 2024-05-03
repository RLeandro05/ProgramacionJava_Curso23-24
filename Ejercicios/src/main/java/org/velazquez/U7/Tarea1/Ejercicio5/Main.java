package org.velazquez.U7.Tarea1.Ejercicio5;

/*Crear una colección de 20 números enteros aleatorios distintos menores que 100,
guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.*/

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        int min = 0; // Establecemos el mínimo
        int max = 99; // Establecemos el máximo menor a 100

        int contador = 0; // Establecemos un contador para ingresar 20 números en la lista

        ArrayList<Integer> listaInteger = new ArrayList<>(); // Creación del ArrayList donde se almacenarán los números

        while (contador < 20) { // Establecemos un while para ingresar los 20 números

            int numAleatorio = (int) (Math.random()*(max + 1) - min) + min; // Ponemos un número aleatorio

            if (!listaInteger.contains(numAleatorio)) { // Si este no está en la lista, se añade el número
                listaInteger.add(numAleatorio);

                contador++; // Sumamos el contador aquí ya que si el número está ya dentro de la lista, no debe sumarse para que luego se den los 20 distintos exactos

                listaInteger.sort(new Comparator<Integer>() { // Al mismo tiempo que insertamos un nuevo número a la lista, lo vamos ordenando decrecientemente
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });
            }
        }

        System.out.println(listaInteger); // Mostramos por pantalla la lista ordenada decrecientemente
    }
}
