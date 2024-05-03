package org.velazquez.U7.Tarea3b.Ejercicio2;

/*Añada al programa anterior la siguiente funcionalidad.
El programa pedirá al usuario un dni, calculará la clave que ha de consultar,
comprobará que dicha clave existe, y, en tal caso, mostrará el valor
asociado a esa clave en el HashMap.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos un mapa teniendo como clave números Integer, y como valores, cadenas de String
        Map<Integer, String> mapa = new HashMap<>();

        //Añadimos al mapa cadenas de String y valores de DNI en el método para hacer un llamamiento
        mapa.put(sumaDigitosDNI("12345678A"), "Adrian");
        mapa.put(sumaDigitosDNI("23456789B"), "Christian");
        mapa.put(sumaDigitosDNI("34567890C"), "Adam");
        mapa.put(sumaDigitosDNI("45678901D"), "Marina");

        //Mostramos en pantalla el mapa
        System.out.println(mapa);

        //Pedimos que introduzca un DNI por teclado
        System.out.println("Introduzca un DNI a calcular: ");
        String scannerDNI = sc.next();

        //Calculamos en el método su suma de Dígitos para verificar si está en el mapa
        if (mapa.containsKey(sumaDigitosDNI(scannerDNI))) {
            //En el caso de que sí esté, mostrará el valor con .get
            System.out.println("El DNI está presente en el mapa");
            System.out.println("Tiene como valor: " + mapa.get(sumaDigitosDNI(scannerDNI)));
        } else {
            //En el caso de que no esté, se le comentará que no está
            System.out.println("El DNI no está presente en el mapa");
        }

        sc.close();
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
