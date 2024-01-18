package org.velazquez.U4.Tarea1.Ejercicio5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Texto {

    //Declaración de atributos
    private int longitud_max;
    private String texto;
    private String inicio;
    private String fina_l;

    //Declaración de la función escribirTexto para escribir un texto aleatorio
    public void escribirTexto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto aleatorio: ");

        texto = sc.nextLine();
    }

    /*Declaración de la función contarCaracteres para validar el número de caracteres a
    diferencia del máximo para validar si es válido el texto o no
     */
    public void contarCaracteres(int longitud_max) {
        if (texto.length() > longitud_max) {
            System.out.println("ERROR");
            System.out.println("Caracteres: "+texto.length());
        } else {
            System.out.println("VALIDO");
            System.out.println("Caracteres: "+texto.length());
        }
    }
    /*Declaración de la función Nuevo_texto_caracter para añadir un caracter al inicio o al final
    del texto siempre y cuando no se pase del límite de caracteres
     */
    public void Nuevo_texto_caracter(String inicio, String fina_l, int longitud_max) {
        Scanner sc = new Scanner(System.in);
        String decision;

        if (texto.length() >= longitud_max) {
            System.out.println("No puedes añadir nuevos caracteres porque sobrepasaría el límite de caracteres.");
        } else {
            System.out.println("¿Quieres el nuevo caracter al inicio o al final?(i/f)");
            decision = sc.next();

            if (decision.equals("i")) {
                System.out.println(inicio+texto);
            } else {
                System.out.println(texto+fina_l);
            }
        }
    }
    /*Declaración de la función Nuevo_texto_cadena para añadir una cadena al inicio o al final
    * del texto siempre y cuando no se pase del límite de caracteres*/
    public void Nuevo_texto_cadena(String inicioo, String fina_ll, int longitud_max) {
        Scanner sc = new Scanner(System.in);
        String decision;

        if (texto.length() >= longitud_max) {
            System.out.println("No puedes añadir nuevas cadenas porque sobrepasaría el límite de caracteres.");
        } else {
            System.out.println("¿Quieres la nueca cadena al inicio o al final?(i/f)");
            decision = sc.next();

            if (decision.equals("i")) {
                System.out.println(inicioo+texto);
            } else {
                System.out.println(texto+fina_ll);
            }
        }
    }
    /*Declaración de la función leerVocales para mostrar el número de vocales
    * presentes en el texto*/
    public void leerVocales() {
        int contador_vocales = 0;
        String [] vocales = {"a", "e", "i", "o", "u", "á", "é", "í", "ó", "ú", "A", "E", "I", "O", "U"};

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            String caracterr = Character.toString(caracter);

            for (int j = 0; j < vocales.length; j++) {
                if (caracterr.equals(vocales[j])) {
                    contador_vocales++;
                }
            }
        }

        System.out.println("Total de vocales en el texto: "+contador_vocales);
    }
}
