package org.velazquez.U7.Tarea6.Ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> mapPiezas = new HashMap<>();

        //Puntuaciones
        mapPiezas.put("Peon", 1);
        mapPiezas.put("Torre", 5);
        mapPiezas.put("Caballo", 2);
        mapPiezas.put("Alfil", 3);
        mapPiezas.put("Reina", 9);

        int numPeones = 8; // case 1

        int numCaballos = 2; // case 2

        int numTorres = 2; // case 3

        int numAlfiles = 2; // case 4

        int numReinas = 1; // case 5

        int puntos = 0;

        int min = 0;
        int max = 15;

        // Número de capturas aleatorias
        int numCapturas = (int) (Math.random()*(max + 1) - min) + min;

        if (numCapturas == 0) { // Si el número de capturas fuese 0, obviamente no habría piezas capturadas
            System.out.println("No capturaste ninguna pieza.");
        } else {

            max = 5;

            System.out.println("Has capturado las siguientes piezas: ");

            while (numCapturas != 0) {

                int piezaAleatoria = (int) (Math.random()*(max + 1) - min) + min; // Sacamos una pieza aleatoria

                switch (piezaAleatoria) { // Según la que salga, mostramos por pantalla la puntuación de la pieza y sumamos su valor
                    case 1:
                        if (numPeones != 0) {
                            System.out.println("Peón: 1 peón");

                            puntos += mapPiezas.get("Peon");

                            numPeones--;
                        } else {
                            numCapturas++;
                        }
                        break;
                    case 2:
                        if (numCaballos != 0) {
                            System.out.println("Caballo: 2 peones");

                            puntos += mapPiezas.get("Caballo");

                            numCaballos--;
                        } else {
                            numCapturas++;
                        }
                        break;
                    case 3:
                        if (numTorres != 0) {
                            System.out.println("Torre: 5 peones");

                            puntos += mapPiezas.get("Torre");

                            numTorres--;
                        } else {
                            numCapturas++;
                        }
                        break;
                    case 4:
                        if (numAlfiles != 0) {
                            System.out.println("Alfil: 3 peones");

                            puntos += mapPiezas.get("Alfil");

                            numAlfiles--;
                        } else {
                            numCapturas++;
                        }
                        break;
                    case 5:
                        if (numReinas != 0) {
                            System.out.println("Reina: 9 peones");

                            puntos += mapPiezas.get("Reina");

                            numReinas--;
                        } else {
                            numCapturas++;
                        }
                        break;
                }

                numCapturas--;

                // Si hiciese todas las capturas, salimos para no quedarnos infinitamente en el bucle
                if (numPeones == 0 && numTorres == 0 && numCaballos == 0 && numAlfiles == 0 && numReinas == 0) {
                    break;
                }
            }
        }

        System.out.println("Puntuación total: "+puntos+" peones"); // Mostramos por pantalla la puntuación total
    }
}
