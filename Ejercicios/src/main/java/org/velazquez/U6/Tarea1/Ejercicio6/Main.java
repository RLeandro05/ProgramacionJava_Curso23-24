package org.velazquez.U6.Tarea1.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres ver la lista de firmas o insertar un nuevo nombre?");
        System.out.println("1. Ver lista");
        System.out.println("2. Insertar nuevo nombre");

        int eleccion = sc.nextInt();

        String direccion = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio6\\firmas.txt";
        String texto = "";

        if (eleccion == 1) {
            try {
                BufferedReader lector = new BufferedReader(new FileReader(direccion));

                while (texto != null) {
                    texto = lector.readLine();
                    if (texto == null) {
                        break;
                    }
                    System.out.println(texto);
                }
                lector.close();
            } catch (IOException e) {
                System.out.println("Hubo errores: "+e.getMessage());
            }
        } else {
            try {
                BufferedReader lector = new BufferedReader(new FileReader(direccion));
            } catch (IOException e) {
                System.out.println("Hubo errores: "+e.getMessage());
            }
        }
    }
}
