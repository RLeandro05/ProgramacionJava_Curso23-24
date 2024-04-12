package org.velazquez.U6.Tarea2.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Introducimos el número double por teclado
        System.out.println("Introduce un número double: ");
        double num = sc.nextDouble();

        sc.close();

        try {
            //Inicializamos un escritor binario de un archivo binario
           ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio1\\archivo.bin"));

           //Escribimos en el archivo binario el número
           escritor.writeDouble(num);
           escritor.close();
        } catch (IOException e) {
            System.out.println("Error en: " + e.getMessage());
        }
    }
}
