package org.velazquez.U6.Tarea1.Ejercicio3.v2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Cadena de ejemplo
        String cadena = "Hola";
        String cadena2 = "Adiós";
        String textoCopia = "";

        System.out.println("Indique el nombre del archivo que quiere duplicar: ");
        String respuesta = sc.nextLine();

        //Creación de direcciones de ambos archivos
        String direccion = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v2\\original.txt";
        String nombreDireccion = "original";
        String direccionCopia = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v2\\copia_deOriginal.txt";

        if (respuesta.equals(nombreDireccion)) {
            //Si es correcto el nombre, se crea el archivo original y la copia
            try  {
                BufferedReader lector = new BufferedReader(new FileReader(direccion));
                BufferedWriter lectorCopia = new BufferedWriter(new FileWriter(direccionCopia));
                int c = lector.read();
                // Leemos cada uno de los caracteres de 'original.txt'
                while (c != -1) {
                    textoCopia += (char) c;
                    c = lector.read();
                }
                lector.close();

                // Escribimos en el archivo 'copia.txt' la cadena "textoCopia"
                lectorCopia.write(textoCopia);
                lectorCopia.close();

            } catch (IOException e) {
                System.out.println("Hubo errores: " + e.getMessage());
            }
        } else {
            //Si no se escribe el archivo correcto, no se creará nada
            System.out.println("No se encontró el archivo...");
        }
    }
}
