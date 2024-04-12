package org.velazquez.U6.Tarea2.Ejercicio4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos el número que será la longitud del array
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        //Inicializamos el array de tipo double
        double[] arrDouble = new double[num];

        //Dejamos el enlace para la creación del archivo binario
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio4\\archivo.bin";

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));

            //Dentro de un for, introducimos números double en el array
            for (int i = 0; i < arrDouble.length; i++) {
                System.out.println("Introduce un número double: ");
                double numDouble = sc.nextDouble();
                arrDouble[i] = numDouble;

                //Al mismo tiempo que los introducimos, vamos escribiéndolo en el archivo
                escritor.writeDouble(arrDouble[i]);
            }

            //Cerramos
            sc.close();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
