package org.velazquez.U6.Tarea1.Ejercicio4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fichero = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio4\\carta.txt";
        String textoCopia = "";

        //Inicializamos los contadores
        int contadorCaracteres = 0;
        int contadorLineas = 0;
        int contadorPalabras = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(fichero));

            //Leemos la primera línea y la guardmos en una cadena
            String linea = lector.readLine();
            while (linea != null) {
                /*Dentro del while mientras la siguiente línea no sea null, guardamos todas las líneas
                en una cadena de texto*/
                textoCopia += (linea + " ");

                //Actualizamos el número de caracteres de cada línea
                contadorCaracteres += linea.length();
                //Sumamos en uno la línea
                contadorLineas++;

                //Leemos la siguiente línea
                linea = lector.readLine();
            }

            //Dentro del for, usamos el textoCopia con todo el texto en una misma cadena para contar las palabras
            for (int i = 0; i < textoCopia.length(); i++) {
                if (textoCopia.charAt(i) == ' ') {
                    contadorPalabras++;
                }
            }
            //Cerramos el fichero
            lector.close();
        } catch (IOException e) {
            System.out.println("Hubo errores: "+e.getMessage());
        }

        //Mostramos en pantalla los resultados
        System.out.println("Nº caracteres: "+contadorCaracteres);
        System.out.println("Nº líneas: "+contadorLineas);
        System.out.println("Nº palabras: "+contadorPalabras);
    }
}
