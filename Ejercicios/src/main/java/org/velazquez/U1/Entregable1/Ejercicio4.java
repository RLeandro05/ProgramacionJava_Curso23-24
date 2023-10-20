package org.velazquez.U1.Entregable1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero positivo con una cantidad de cifras pares: ");
            numero = scanner.nextInt();
        } while (numero <= 0 || obtenerCantidadCifras(numero) % 2 != 0);

        int longitud = obtenerCantidadCifras(numero);
        int mitad = longitud / 2;
        int primeraMitad = obtenerMitadIzquierda(numero, mitad);
        int segundaMitad = obtenerMitadDerecha(numero, mitad);

        if (esPrimo(primeraMitad)) {
            System.out.println("La primera mitad (" + primeraMitad + ") es un número primo.");
        } else {
            System.out.println("La primera mitad (" + primeraMitad + ") no es un número primo.");
        }

        if (esPrimo(segundaMitad)) {
            System.out.println("La segunda mitad (" + segundaMitad + ") es un número primo.");
        } else {
            System.out.println("La segunda mitad (" + segundaMitad + ") no es un número primo.");
        }
    }

    // Función para obtener la cantidad de cifras de un número
    public static int obtenerCantidadCifras(int numero) {
        int cifras = 0;
        while (numero != 0) {
            numero /= 10;
            cifras++;
        }
        return cifras;
    }

    // Función para obtener la mitad izquierda de un número
    public static int obtenerMitadIzquierda(int numero, int mitad) {
        int divisor = (int) Math.pow(10, mitad);
        return numero / divisor;
    }

    // Función para obtener la mitad derecha de un número
    public static int obtenerMitadDerecha(int numero, int mitad) {
        int divisor = (int) Math.pow(10, mitad);
        return numero % divisor;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;


    }
 }
