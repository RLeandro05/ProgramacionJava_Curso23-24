package org.velazquez.U6.Tarea2.Ejercicio9;

import java.io.*;

/*Crear un fichero binario e insertar varios objetos de tipo Tren.
Cerrar el fichero y leerlo a continuación, mostrándo los objetos por pantalla.*/
public class Main {
    public static void main(String[] args) {

        //Creamos el enlace del archivo binario
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea2\\Ejercicio9\\archivo.bin";

        //Creamos algunos objetos de tipo Tren para insertar en el archivo
        Tren t1 = new Tren(3, 1, "Renfe");
        Tren t2 = new Tren(4, 2, "AvesMadrid");
        Tren t3 = new Tren(5, 3, "MetroMan");

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));
            escritor.writeObject(t1);
            escritor.writeObject(t2);
            escritor.writeObject(t3);
            escritor.close(); //Cerramos

            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace));

            //Introducimos un nuevo try para que intente hacer lo siguiente
            try {
                while (true) {
                    Tren tren = (Tren) lector.readObject(); //Mientras exista algo en el archivo, creará objetos
                    System.out.println(tren); //Lo mostrará por pantalla
                }
            } catch (IOException e) {
                System.out.println("Fin del archivo");
            }

            lector.close(); //Cerramos
        } catch (IOException | ClassNotFoundException e) { //Ponemos la excepción de si no encuentra la clase Tren
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
