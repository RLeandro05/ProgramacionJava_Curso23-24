package org.velazquez.U3.Pruebas;

import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Indicamos primero el número para convertir en morse*/
        System.out.println("Por favor, introduzca un número aleatorio: ");
        int n = sc.nextInt();

        /*Invocaremos a la función convierteEnMorse para que se encargue de mostrar el número
        en Código Morse*/
        String morse = convierteEnMorse(n);

        /*Por último, lo imprimimos en pantalla*/
        System.out.println("El número " + n + " en Morse es: " + morse);
    }
    /*Declaración de la función convierteEnMorse*/
    public static String convierteEnMorse(int n) {
        /*Primero, declaramos un array de morse según el dígito, de 0 a 9*/
        String[] morseEnDigitos = {
                "-----", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----."
        };

        /*Ahora, convertiremos primero el número a cadena String, para luego convertir esa misma cadena
        en un array de caracteres. Esto nos servirá para luego buscar según el dígito, su correspondiente
        equivalencia a Código Morse*/
        String n_cadena = Integer.toString(n);
        char[] digitos = n_cadena.toCharArray();

        /*En este StringBuilder, convertimos cada dígito a su equivalente Morse*/
        StringBuilder resultado = new StringBuilder();
        /*En este for, la variable i será la posición del array "digitos"*/
        for (int i = 0; i < digitos.length; i++) {
            /*En este char, convertiremos la posición actual del array en un caracter*/
            char digito = digitos[i];

            /*Antes de convertirlo en Morse, establecemos una condición que se encargará de
            asegurarse si el caracter presente es un número entre 0 y 9*/
            if (digito >= '0' && digito <= '9') {
                /*Si se cumple el caso, crearemos un índice el cual será el caracter del dígito menos
                el caracter en código ASCCI del 0, para así dar el valor el cual se convertirá en código morse*/
                int indice = digito - '0';
                /*La función append construirá una cadena de texto para convertirlo en morse*/
                resultado.append(morseEnDigitos[indice]).append(" ");
            }
        }

        /*Por último, devolvemos el valor en código morse*/
        return resultado.toString().trim();
    }
}
