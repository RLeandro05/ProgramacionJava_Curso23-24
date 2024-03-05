package org.velazquez.U6.Tarea1.Ejercicio3.v2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Cadena de ejemplo
        String cadena = "Hola";
        String cadena2 = "Adiós";

        System.out.println("Indique el nombre del archivo que quiere duplicar: ");
        String respuesta = sc.nextLine();

        //Creación de direcciones de ambos archivos
        String direccion = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v2\\original.txt";
        String nombreDireccion = "original";
        String direccionCopia = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio3\\v2\\copia_deOriginal.txt";

        if (respuesta.equals(nombreDireccion)) {
            //Si es correcto el nombre, se crea el archivo original y la copia
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

                //Indicamos que lacopi se creó
                System.out.println("El archivo copia de '"+respuesta+"' ha sido creado");

            } catch (IOException e) {
                System.out.println("Hubo errores: "+e.getMessage());
            }
        } else {
            //Si no se escribe el archivo correcto, no se creará nada
            System.out.println("No se encontró el archivo...");
        }
    }
}
