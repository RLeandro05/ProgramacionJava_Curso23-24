package org.velazquez.U6.Tarea2.Ejercicio7;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Guardamos el enlace del archivo
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio7\\archivo.bin";

        //Pedimos que escriba una frase aleatoria
        System.out.println("Escriba una frase: ");
        String frase = sc.nextLine();

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));

            //Escribimos en el archivo binario la frase
            escritor.writeUTF(frase);

            //Cerramos
            escritor.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Mostramos en pantalla la lectura de la frase del archivo binario
            System.out.println("La frase salvada es: "+lector.readUTF());

            //Cerramos
            lector.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
