package org.velazquez.U6.Tarea2.Ejercicio5;

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

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Dentro del array ya creado, simplemente metemos como un valor del array el primer valor que encuentre el archivo binario
            //Al mostrarlo, saldrá en el mismo orden ya que al introducir anteriormente el array, se hizo con el mismo orden
            for (int i = 0; i < arrDouble.length; i++) {
                arrDouble[i] = lector.readDouble();

                //Al mismo tiempo, vamos mostrando por pantalla el número double
                System.out.println(arrDouble[i]);
            }

            //Cerramos
            lector.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
