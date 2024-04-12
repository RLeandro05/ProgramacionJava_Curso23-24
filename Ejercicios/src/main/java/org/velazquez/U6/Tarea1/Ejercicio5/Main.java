package org.velazquez.U6.Tarea1.Ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fichero = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio5\\numeros.txt";
        try {
            BufferedReader lector = new BufferedReader(new FileReader(fichero));

            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
