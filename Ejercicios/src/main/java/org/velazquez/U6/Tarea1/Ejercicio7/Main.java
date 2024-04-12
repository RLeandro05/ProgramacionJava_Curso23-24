package org.velazquez.U6.Tarea1.Ejercicio7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String archivo = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea1\\Ejercicio7\\texto.txt";

        //Definimos el máximo que queremos mostrar por pantalla
        final int maximoLineas = 24;
        //Definimos un contador para mostrar hasta el máximo de Líneas por página
        int contadorLineas = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea = reader.readLine();
            //Definimos un while en el que mientras haya contenido en el texto, seguirá mostrando líneas
            while (linea != null) {
                System.out.println(linea);
                contadorLineas++;

                //Definimos un if en el cual decimos que si llega al número máximo de líneas, pulsemos una teclapara seguir mostrando
                if (contadorLineas == maximoLineas) {
                    System.out.println("Presiona cualquier tecla para seguir mostrando nuevas líneas");
                    scanner.nextLine();
                    //Reiniciamos el contador ya que suponemos que estamos en una nueva página del texto
                    contadorLineas = 0;
                }

                //Vamos a la siguiente línea
                linea = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

