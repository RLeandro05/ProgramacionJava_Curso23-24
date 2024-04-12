package org.velazquez.U6.Tarea2.Ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos el archivo en un enlace
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio3\\numerosPositivos.bin";

        try {
            //Inicializamos el escritor binario
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));

            int num = 0;

            //Indicamos que sólo queremos números positivos
            while (num >= 0) {
                System.out.println("Introduce un número positivo");

                num = sc.nextInt();

                //Mientras sea positivo, se guardará en el archivo
                if (num >= 0) {
                    escritor.writeInt(num);
                }
            }
            escritor.close();
            sc.close();

            //Inicilizamos el lector binario
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Indicamos que mientras sea true cada línea, mostraremos el número de esa línea y luego la siguiente
            while (true) {
                int numero = lector.readInt();
                System.out.println(numero);
            }

            //Cuando llegue a null, mostraremos en la excepción que ya llegó al final del archivo
        } catch (IOException e) {
            System.out.println("Final del archivo");
        }
    }
}
