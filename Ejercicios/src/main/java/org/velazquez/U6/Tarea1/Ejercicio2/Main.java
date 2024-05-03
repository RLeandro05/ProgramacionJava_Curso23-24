package org.velazquez.U6.Tarea1.Ejercicio2;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre y edad: ");
        String nombreEdad = sc.nextLine();

        String archivo = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio2\\datos.txt";

        //Si no existe, se mete en este try
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            if (lector.readLine() == null) {
                System.out.println("Creando archivo...");
            }
        } catch (IOException e) {
            //Al no existir un archivo, lo crearemos e introducimos el nobre y edad

            System.out.println("No existe el archivo o ya existe 'datos.txt'"+"\n"+" Creando archivo...");

            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

                escritor.write(nombreEdad);
                escritor.close();

                return;
            } catch (IOException i) {
                System.out.println("No se pudo crear el archivo 'datos.txt'");
                return;
            }
        }

        //Aquí se aplicará la función una vez esté creado el archivo datos.txt
        //Hacemos un llamamiento a la función esArchivoVacio para averiguar si no hay nada escrito
        if (!esArchivoVacio(archivo, nombreEdad)) {
            //En caso negativo, escribiremos una cadena vacía

            try {
                BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));

                //Escribimos cadena vacía para borrar el contenido anterior
                escribir.write("");
                escribir.close();
            } catch (IOException e) {
                System.out.println("Hubo errores: "+ e.getMessage());
            }
        }
        else {
            //En caso positivo, modificaremos el archivo en la dirección indicada
            try {
                BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));

                //Escribimos la nueva cadena y se creará el nuevo archivo de forma automática
                escribir.write(nombreEdad);
                escribir.close();
            } catch (IOException e) {
                System.out.println("Hubo errores: "+ e.getMessage());
            }
        }
    }
    private static boolean esArchivoVacio (String archivo, String nombreEdad) {

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            if (lector.readLine() == null) {
                return true;
            }
        } catch (IOException e) {
            System.out.println("Hubo errores: "+ e.getMessage());
        }

        return false;
    }
}

