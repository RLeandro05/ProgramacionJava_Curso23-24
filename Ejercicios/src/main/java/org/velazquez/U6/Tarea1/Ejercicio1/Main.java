package org.velazquez.U6.Tarea1.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ponemos un fichero por defecto de prueba.txt
        final String FICHERO_POR_DEFECTO = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\prueba.txt";

        //Solicitamos una dirección de un fichero
        System.out.println("Escriba el nombre del fichero: ");
        String FICHERO = sc.nextLine();

        //Si no se proporciona, leemos el que está por defecto
        if (FICHERO.isEmpty()) {
            try {
                BufferedReader in = new BufferedReader(new FileReader(FICHERO_POR_DEFECTO));
                String texto = "";

                //Lo leemos
                int c = in.read();
                while (c != -1) {
                    texto += (char) c;
                    c = in.read();
                }
                //Lo cerramos
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            //Si se proporciona, se lee el fichero dado
            try {
                BufferedReader in = new BufferedReader(new FileReader(FICHERO));
                String texto = "";
                int c = in.read();
                while (c != -1) {
                    texto += (char) c;
                    c = in.read();
                }
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    }