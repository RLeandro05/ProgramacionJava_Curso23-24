package org.velazquez.U6.Tarea1.Ejercicio3.v1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Cadena de ejemplo
        String cadena = "Hola";
        String cadena2 = "Adiós";

        //Creación de direcciones de ambos archivos
        String direccion = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v1\\original.txt";
        String direccionCopia = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v1\\copia.txt";

        try {
            //Creamos escritor de 'original.txt'
            BufferedWriter escritor = new BufferedWriter(new FileWriter(direccion));

            //Escribimos la cadena de ejemplo en 'original.txt'
            escritor.write(cadena);
            escritor.newLine();
            escritor.write(cadena2);
            escritor.close();

            //Creamos escritor de 'copia.txt'
            BufferedWriter escritorCopia = new BufferedWriter(new FileWriter(direccionCopia));

            //Escribimos la misma cadena de ejemplo en 'copia.txt'
            escritorCopia.write(cadena);
            escritorCopia.newLine();
            escritorCopia.write(cadena2);
            escritorCopia.close();

        } catch (IOException e) {
            System.out.println("Hubo errores: "+e.getMessage());
        }
    }
}
