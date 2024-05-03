package org.velazquez.U7.Tarea7.Ejercicio1;

/*A partir de una lista de 100 enteros aleatorios menores que 1000:

Calcula cuántos son primos.
Determina cuál es el mayor, el menor, la suma de todos ellos y el valor promedio.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int min = 0; // Definición de número mínimo
        int max = 999; // Definición de número máximo

        int contador = 0; // Definición de contador para insertar 100 números en el ArrayList

        ArrayList<Integer> listaInteger = new ArrayList<>(); // Creación de una lista para archivar los números

        while (contador < 100) {

            int numAleatorio = (int) (Math.random()*(max + 1) - min) + min;

            listaInteger.add(numAleatorio); // Mientras el contador no llegue a 100, se irán implementando los números aleatorios

            contador++;
        }

        long numPrimos = listaInteger.stream().filter(Main::esPrimo).count(); // Establecemos una variable númerica que guardará el número de primos proveniente del filtro del Stream

        System.out.println("Hay "+numPrimos+" primos."); // Mostramos por pantalla el número de primos

        int maxPrimo = listaInteger.stream().max(Integer::compareTo).get(); // Establecemos una variable donde se guardará el máximo de la lista

        System.out.println("El número máximo de la lista es: "+maxPrimo); // Mostramos por pantalla el número más grande

        int minPrimo = listaInteger.stream().min(Integer::compareTo).get(); // Establecemos una variable donde se guardará el mínimo de la lista

        System.out.println("El número mínimo de la lista es: "+minPrimo); // Mostramos por pantalla el número más pequeño

        int sumaPrimos = listaInteger.stream().mapToInt(Integer::intValue).sum(); // Establecemos una variable donde se sumarán todos los números de la lista

        System.out.println("La suma de toda la lista de números es: "+sumaPrimos); // Mostramos por pantalla el resultado de la suma

        double promedioPrimos = listaInteger.stream().mapToInt(Integer::intValue).average().getAsDouble(); // Establecemos una variable donde se sumarán todos los números de la lista

        System.out.println("El promedio es: "+promedioPrimos); // Mostramos por pantalla el resultado del promedio
    }

    public static boolean esPrimo(int numero) { // Creación del método de verificación de primos
        if (numero <= 1) { // Si es menor o igual a uno, automáticamente no son primos por norma general
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // Si no es así, recorremos el for hasta que i sea mayor que la raíz del siguiente número de la lista
            if (numero % i == 0) { // Si el resto de la divisón entre el número dado y la i es 0, no es primo
                return false;
            }
        }
        return true; // Si no se cumple nada, el número es primo
    }
}
