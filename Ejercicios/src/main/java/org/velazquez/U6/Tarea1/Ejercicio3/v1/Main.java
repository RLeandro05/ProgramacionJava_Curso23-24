package org.velazquez.U6.Tarea1.Ejercicio3.v1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // Cadena de ejemplo
        String textoCopia = "";

        // Direcciones de ambos archivos
        String direccion = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v1\\original.txt";
        String direccionCopia = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v1\\copia.txt";

        // Creamos el archivo 'original.txt'
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(direccion))) {
            escritor.write("Hola");
            escritor.newLine();
            escritor.write("Adiós");
        } catch (IOException e) {
            System.out.println("Hubo errores: " + e.getMessage());
        }

        // Leemos ahora línea por línea 'original.txt' para copiarlo en 'copia.txt'
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
    }
}

