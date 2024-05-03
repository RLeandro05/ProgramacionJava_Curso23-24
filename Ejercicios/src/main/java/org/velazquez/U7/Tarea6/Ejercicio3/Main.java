package org.velazquez.U7.Tarea6.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> diccionarioCapitales = new HashMap<>(); // Creamos un mapa

        // Añadimos unos elementos
        diccionarioCapitales.put("España", "Madrid");
        diccionarioCapitales.put("Portugal", "Lisboa");
        diccionarioCapitales.put("Francia", "Paris");

        while (true) {
            System.out.println("Escribe el nombre de un país y te diré su capital: ");
            String pais = sc.next(); // Escribimos un país

            if (pais.equals("salir")) { // Si decidimos salir, lo escribimos y mostramos por pantalla cómo ha quedado el mapa final
                System.out.println("¡Saliste!");
                System.out.println("Lista final de capitales: "+diccionarioCapitales);
                break;
            } else {
                if (diccionarioCapitales.containsKey(pais)) { // Si está en el mapa, nos dirá la capital de dicho país
                    System.out.println("La capital de "+pais+" es: "+diccionarioCapitales.get(pais));
                } else { // Si el país no está en el mapa, le proporcionamos la capital y se guardará en el mapa
                    System.out.println("No conozco su capital. ¿Podrías decirme cuál es la capital de "+pais+"?: ");
                    String capital = sc.next();

                    diccionarioCapitales.put(pais, capital);

                    System.out.println("¡Gracias por enseñarme nuevas capitales!");
                }
            }

        }
    }
}
