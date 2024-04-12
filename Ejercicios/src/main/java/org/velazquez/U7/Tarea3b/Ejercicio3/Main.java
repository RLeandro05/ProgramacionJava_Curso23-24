package org.velazquez.U7.Tarea3b.Ejercicio3;

/*Recorre el Map anterior, extrayendo cada pareja clave-valor, y mostrándolas,
de tal forma que se escriban los datos así:

La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".

La clave ... está asociada al nombre ....*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Creamos un mapa teniendo como clave números Integer, y como valores, cadenas de String
        Map<Integer, String> mapa = new HashMap<>();

        //Añadimos al mapa cadenas de String y valores de DNI en el método para hacer un llamamiento
        mapa.put(sumaDigitosDNI("12345678A"), "Adrian");
        System.out.println("La clave "+sumaDigitosDNI("12345678A")+" está asociada al nombre: " +mapa.get(sumaDigitosDNI("12345678A")));
        mapa.put(sumaDigitosDNI("23456789B"), "Christian");
        System.out.println("La clave "+sumaDigitosDNI("23456789B")+" está asociada al nombre: " +mapa.get(sumaDigitosDNI("23456789B")));
        mapa.put(sumaDigitosDNI("34567890C"), "Adam");
        System.out.println("La clave "+sumaDigitosDNI("34567890C")+" está asociada al nombre: " +mapa.get(sumaDigitosDNI("34567890C")));
        mapa.put(sumaDigitosDNI("45678901D"), "Marina");
        System.out.println("La clave "+sumaDigitosDNI("45678901D")+" está asociada al nombre: " +mapa.get(sumaDigitosDNI("45678901D")));
    }

    //Definimos el método para sumar los dígitos del DNI
    public static int sumaDigitosDNI (String DNI) {

        //Inicializamos la suma de los dígitos
        int suma = 0;

        for (int i = 0; i < DNI.length(); i++) {
            //Para cada caracter, lo guardamos en una variable caracter
            char c = DNI.charAt(i);

            //Si dicho caracter llega a estar entre 0 y 9 en el código ASCII, lo sumaremos restando 0 en código ASCII
            //Con eso, dará la suma correcta
            if (c >= '0' && c <= '9') {
                suma += c - '0';
            }
        }

        //Devolvemos el valor dela suma
        return suma;
    }
}
