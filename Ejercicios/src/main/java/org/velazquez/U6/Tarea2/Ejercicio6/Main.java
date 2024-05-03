package org.velazquez.U6.Tarea2.Ejercicio6;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //Guardamos el enlace del archivo
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio6\\archivo.bin";

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Inicializamos un contador
            int contador = 0;

            //Dentro de un while, suponiendo que siempre se cumpla, seguirá leyendo los números y sumando el contador
            while (true) {
                try {
                    lector.readDouble();
                    contador++;
                } catch (IOException a) {
                    //Cuando llegue al final del archivo, este saldrá del while para mostrar el número de doubles
                    break;
                }
            }

            //Mostramos por pantalla el número total de doubles en el archivo binario
            System.out.println("Hay "+contador+" números double en el archivo");

            //Cerramos
            lector.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }

//        try {
//            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));
//
//            escritor.writeDouble(1.11);
//            escritor.writeDouble(1.12);
//            escritor.writeDouble(23.1);
//
//            escritor.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
