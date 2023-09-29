package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.println("¡Bienvenido! Ahora comenzaremos con el cuestionario:");

        System.out.println("Pregunta 1: ¿Cómo se escribe el importe del Escáner en Java?");
        System.out.println("1. import java.util.Scanner");
        System.out.println("2. import java.Scanner");
        System.out.println("3. import java.util.Scanner;");
        int respuesta1 = teclado.nextInt();

        if (respuesta1 ==3) {
            System.out.println("¡Correcto!");
            contador ++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 2: ¿Cuántos tipos de software existen?");
        System.out.println("1. 3");
        System.out.println("2. 4");
        System.out.println("3. Ambas son correctas");
        int resultado2 = teclado.nextInt();

        if (resultado2 == 1) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 3: ¿Cuáles son las horas semanales como mínimo en general?");
        System.out.println("1. 35");
        System.out.println("2. 40");
        System.out.println("3. Ninguna son correctas");
        int respuesta3 = teclado.nextInt();

        if (respuesta3 == 2) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 4: ¿Un videojuego qué tipo de software es?");
        System.out.println("1. De gestión");
        System.out.println("2. De sistema");
        System.out.println("3. Ninguna es correcta");
        int respuesta4 = teclado.nextInt();

        if (respuesta4 == 1) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 5: ¿El software es tangible?");
        System.out.println("1. Nop LoL");
        System.out.println("2. Claro que sí");
        System.out.println("3. Ambas son correctas");
        int respuesta5 = teclado.nextInt();

        if (respuesta5 == 1) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 6: ¿Que utiliza HTML?");
        System.out.println("1. Etiquetas");
        System.out.println("2. A tu abuela");
        System.out.println("3. Códigos XML");
        int respuesta6 = teclado.nextInt();

        if (respuesta6 == 1) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 7: ¿Cuál es el lenguaje de marcas más usado según la gente?");
        System.out.println("1. XML");
        System.out.println("2. JavaScript");
        System.out.println("3. HTML");
        int respuesta7 = teclado.nextInt();

        if (respuesta7 == 3) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡incorrecto!");
        }

        System.out.println("Pregunta 8: ¿Cuál es la abreviación de un print en Java?");
        System.out.println("1. sout");
        System.out.println("2. print");
        System.out.println("3. println");
        int respuesta8 = teclado.nextInt();

        if (respuesta8 == 1) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Pregunta 9: ¿Quién creó Windows?");
        System.out.println("1. Microsoft");
        System.out.println("2. Linux");
        System.out.println("3. Apple");
        int respuesta9 = teclado.nextInt();

        if (respuesta9 == 1) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Contador!");
        }

        System.out.println("Pregunta 10: ¿Quieres un punto gratis?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("3. Claro");
        int respuesta10 = teclado.nextInt();

        if (respuesta10 == 1 || respuesta10 == 3) {
            System.out.println("¡Correcto!");
            contador++;
        }
        else {
            System.out.println("¡Incorrecto!");
        }

        System.out.println("Obtuviste: "+contador+" puntos");
    }
}
