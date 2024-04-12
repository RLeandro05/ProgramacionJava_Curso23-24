package org.velazquez.U6.Tarea3.Ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MiExcepcion extends Exception{ //Definimos la excepción propia

    private int codigoError; //Añadimos un atributo

    //Creamos un constructor en el que heredamos todo de la clase Excepción y añadimos el atributo nuevo
    public MiExcepcion(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() { //Definimos un método para devolver un mensaje

        String fechaHoraActual = java.time.LocalDateTime.now().toString(); //Añadimos la fecha y hora actual

        String enlace1 = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea3\\Ejercicio2\\error111.txt";
        String enlace2 = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6\\Tarea3\\Ejercicio2\\error222.txt";

        String mensaje = "";

        switch (codigoError) {

            case 111:
                try {
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(enlace1));

                    mensaje = fechaHoraActual+" Error " +111+ ": La edad no puede ser negativa o mayor a 100. Edad introducida: ("+Cliente.getEdad()+")"; //En el primer caso, devolverá lo siguiente
                    escritor.write(mensaje);

                    escritor.close(); //Cerramos
                } catch (IOException e) {
                    System.out.println("Hubo errores en: "+e.getMessage());
                }
                break;
            case 222:
                try {
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(enlace2));

                    mensaje = fechaHoraActual+" Error " +222+ ": No puede ingresar a un menor de edad. Edad introducida: ("+Cliente.getEdad()+")"; //En el segundo caso, devolverá lo siguiente
                    escritor.write(mensaje);

                    escritor.close(); //Cerramos
                } catch (IOException e) {
                    System.out.println("Hubo errores en: "+e.getMessage());
                }
                break;
        }

        return "";
    }
}
