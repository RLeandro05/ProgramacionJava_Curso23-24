package org.velazquez.U7.Tarea3b.Ejercicio4;

/*Crea una clase llamada Traductor,
que contenga un atributo llamado "diccionario"
de tipo HashMap y se comporte de esta forma:

Al crear el objeto Traductor, el atributo diccionario debe ser cargado con
la información de un archivo de texto cuyo nombre se le pasará por parámetro al constructor.
Este archivo debe contener varias palabras en español y su traducción al inglés,
de tal forma que las palabras en español sean la clave, y las que estén en inglés, el valor. Por ejemplo:

hola, hello

mundo, world

gracias, thanks

adios, bye

Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Traductor {

    //Creamos un mapa que contendrá un diccionario
    private static Map<String, String> diccionario = new HashMap<>();
    //Creamos un atributo para el constructor. Este atributo será el nombre del archivo donde se guarda el diccionario
    protected String nombreArchivo; //"C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea3b\\Ejercicio4\\diccionario.txt"

    public Traductor(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public static Map<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(Map<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public String devolverIngles () { //Definimos el método
        Scanner sc = new Scanner(System.in);

        String error = "Error: No se encuentra dicha palabra en el diccionario"; //Ponemos un mensaje de error en el caso de que no esté la palabra dada

        System.out.println("Introduzca una palabra"); //Pedimos que escriba una palabra
        String palabra = sc.next();

        if (diccionario.containsKey(palabra)) { //Si se encuentra en el diccionario, devolverá su equivalencia al inglés
            return diccionario.get(palabra);
        }

        return error; // Si no se cumple la condición, devolverá el mensaje de error por pantalla
    }
}
