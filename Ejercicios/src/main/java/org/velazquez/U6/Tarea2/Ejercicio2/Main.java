package org.velazquez.U6.Tarea2.Ejercicio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {

        //Añadimos el enlace del archivo binario
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio1\\archivo.bin";

        try {
            //Inicializamos el lector binario
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Leemos y mostramos por pantalla el número almacenado en dicho archivo
            System.out.println("El número es: " + lector.readDouble());

            lector.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: " + e.getMessage());
        }
    }
}
