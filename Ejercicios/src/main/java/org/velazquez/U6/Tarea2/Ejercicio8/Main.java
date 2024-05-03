package org.velazquez.U6.Tarea2.Ejercicio8;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Guardamos el enlace del archivo binario
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio8\\archivo.bin";

        //Ponemos el mínimo y máximo siempre y cuando sea menor a 100
        int min = 0;
        int max = 99;

        //Creamos el array de números
        int[] arrayInt = new int[5];

        //Metemos números aleatorios
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random()*(max+1)-min)+min;
        }

        //Ordenamos de menor a mayor el array
        Arrays.sort(arrayInt);

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Con el escritor guardamos en el archivo binario el array en orden
            for (int i = 0; i < arrayInt.length; i++) {
                escritor.writeInt(arrayInt[i]);
            }

            //Cerramos
            escritor.close();

            //Con el lector, mostramos por pantalla número por número del array y del mismo orden que cuando se almacenó
            for (int i = 0; i < arrayInt.length; i++) {
                int num = lector.readInt();

                System.out.println(num);
            }

            //Cerramos
            lector.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
