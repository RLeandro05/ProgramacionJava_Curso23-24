package org.velazquez.U6.Tarea1.Ejercicio8;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Definimos un contador que servirá como definición de longitudes de los dos siguientes arrays
        int contador1 = -1;
        int contador2 = -1;

        //Definimos las direcciones de ambos archivos
        String direccionPerso1 = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio8\\perso1.txt";
        String direccionPerso2 = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio8\\perso2.txt";

        try {
            //Abrimos la lectura de ambos archivos
            BufferedReader lectorPerso1 = new BufferedReader(new FileReader(direccionPerso1));
            BufferedReader lectorPerso2 = new BufferedReader(new FileReader(direccionPerso2));

            //Usamos una línea auxiliar para leer los archivos
            String lineaAux;
            //Decimos que mientars haya contenido, que siga sumando el contador
            while ((lineaAux = lectorPerso1.readLine()) != null) {
                contador1++;
            }
            //Cerramos el archivo y creamso el array con la longitud ya definida gracias al contador
            lectorPerso1.close();

            //Realizamos los mismos pasos en el segundo archivo
            while ((lineaAux = lectorPerso2.readLine()) != null) {
                contador2++;
            }
            lectorPerso2.close();

        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }

        try {
            BufferedReader lectorPerso1 = new BufferedReader(new FileReader(direccionPerso1));
            BufferedReader lectorPerso2 = new BufferedReader(new FileReader(direccionPerso2));

            //Creamos la longitud del array conjunto
            int longitud = (contador1 + contador2) + 2;

            String[] arrTotos = new String[longitud];

            String lineaAux;
            //Añadimos al array los elementos de ambos archivos
            for (int i = 0; i < arrTotos.length; i++) {
                if ((lineaAux = lectorPerso1.readLine()) != null) {
                    arrTotos[i] = lineaAux;
                } else if ((lineaAux = lectorPerso2.readLine()) != null) {
                    arrTotos[i] = lineaAux;
                }
            }

            //Lo ordenamos
            Arrays.sort(arrTotos);

            //Creamos el archivo donde se almacenarán los nombres ordenados
            BufferedWriter escritorTodos = new BufferedWriter(new FileWriter("C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio8\\todos.txt"));

            escritorTodos.write(Arrays.toString(arrTotos));

            escritorTodos.close();

            lectorPerso1.close();
            lectorPerso2.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
