package org.velazquez.U7.Tarea3b.Ejercicio4;

import org.velazquez.U6.Tarea3.Ejercicio2.Cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Enlace para el objeto de tipo Traductor
        Traductor tr1 = new Traductor("C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea3b\\Ejercicio4\\diccionario.txt");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(tr1.nombreArchivo)); //Nuevo lector para el archivo

            int c = lector.read(); //Primera lectura como número para pasarlo a carácter
            String aux = ""; //Creamos un auxiliar para el programa
            String clave = ""; //Parte "clave" del mapa
            String valor = ""; //Parte "valor" del mapa

            while (true) { //While que funcionará mientars haya algo en el fichero y c no llegué a la coma

                if (c == ',') { //Indicamos que si llega a la coma, guarde la palabra en la parte "clave"
                    clave = aux;
                    aux = ""; //Devolvemos el auxiliar a ser vacío
                } else if (c == '\r' || c == -1) { //Sino, si llega a ser un retorno de carro o llega al final, guardará el auxiliar en la parte "valor"
                    valor = aux;
                    aux = ""; //Devolvemos al auxiliar a su valor por defecto;

                    Traductor.getDiccionario().put(clave, valor); //Guardamos el elemtnos en el mapa

                    if (c == -1) { //Si llega al final del fichero, salimos una vez se guarda el último elemento
                        break;
                    }
                } else if (c == '\n' || c == ' ') { //Sino, si llega a ser salto de línea o espacio en blanco, que devuelva el auxiliar a ser por defecto para quitar el caracter de la cadena
                    aux = "";
                } else { //Si nada se cumple, seguimos guardando caracteres en el auxiliar
                    aux += Character.toString(c);
                }

                c = lector.read(); //Seguimos leyendo
            }

            System.out.println(Traductor.getDiccionario()); //Se muestra el mapa completo una vez se sale del while
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }

        System.out.println(tr1.devolverIngles()); //Mostramos en pantalla el valor del método devolverIngles de la clase Traductor
    }
}
