package org.velazquez.U7.Tarea3b.Ejercicio1;

/*Crea un HashMap cuya clave sea un Integer,
y cuyos valores sean los nombres de algunos de tus compañeros.
La clave ha de calcularse mediante un método que reciba un String que represente el dni, y
devuelva la suma de sus dígitos.*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Creamos un mapa teniendo como clave números Integer, y como valores, cadenas de String
        Map<Integer, String> mapa = new HashMap<>();

        //Añadimos al mapa cadenas de String y valores de DNI en el método para hacer un llamamiento
        mapa.put(sumaDigitosDNI("12345678A"), "Adrian");
        mapa.put(sumaDigitosDNI("23456789B"), "Christian");
        mapa.put(sumaDigitosDNI("34567890C"), "Adam");
        mapa.put(sumaDigitosDNI("45678901D"), "Marina");

        //Mostramos en pantalla el mapa
        System.out.println(mapa);
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
