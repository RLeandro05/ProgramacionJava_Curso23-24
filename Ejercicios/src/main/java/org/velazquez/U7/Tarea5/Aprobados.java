package org.velazquez.U7.Tarea5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aprobados implements Serializable {
    private Map<Integer, List<Double>> mapCalificaciones = new HashMap<>(); // Creamos un mapa de calificaciones que lea el archivo donde lea el mismo mapade Calificaciones
    private Map<Integer, Aspirante> mapAspirantes = new HashMap<>(); // Creamos un mapa de aspirantes que lea el mismo archivo de los aspirantes
    private Map<Integer, Double> calificacionMedia = new HashMap<>(); // Creamos un mapa donde se guarden el id y su media equivalente

    public void cargarCalificaciones() {

        String calificacionesDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea5\\calificaciones.dat";

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(calificacionesDAT));

            mapCalificaciones = (Map<Integer, List<Double>>) lector.readObject(); // Copiamos en el mapa de calificaciones la lectura al rchivo donde se sitúa el mapa original

            lector.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: "+e.getMessage());;
        }
    }

    public void cargarAspirantes() {

        String aspirantesDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea5\\aspirantes.dat";

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(aspirantesDAT));

            mapAspirantes = (Map<Integer, Aspirante>) lector.readObject(); // Copiamos en el mapa de los aspirantes la lectura del mapa original en el fichero

            lector.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }

    public double calcularMedia (int idAspirante) {

        // Creamos una lista auxiliar que saque la lista de las calificaciones según el id del aspirantes
        List<Double> listaAuxCalificaciones = mapCalificaciones.get(idAspirante);

        double suma = 0;

        for (double elemento : listaAuxCalificaciones) {
            suma += elemento; // Sumamos todas las notas presentes en la lista
        }

        double media;

        return media = suma/ listaAuxCalificaciones.size(); // Devolvemos la división entre el número de notas
    }

    public void guardarNombresDNIsMedias () {

        //Creamos un nuevo mapa donde guarde por una parte el id y por otra el nombre, dni y media asociada al id
        Map<Integer, List<String>> mapaNombresDNIsMedias = new HashMap<>();

        for (int idAspirante = 0; idAspirante <= mapAspirantes.size()+100; idAspirante++) {
            Aspirante aspirante = mapAspirantes.get(idAspirante); // Creamos un objeto aspirante auxiliar para poder sacar el nombre y dni

            // Si el mapa nuevo no contiene ese id y además ese id está en el mapa donde se guardan los aspirantes apuntados, entra
            if (!mapaNombresDNIsMedias.containsKey(idAspirante) && mapAspirantes.containsKey(idAspirante)) {
                double media = calcularMedia(idAspirante); // Se calcula la media

                List<String> listaAux = new ArrayList<>(); // Creamos una lista auxiliar
                listaAux.add(aspirante.getNombreAspirante()); // Añadimos el nombre
                listaAux.add(aspirante.getDniAspirante()); // Añadimos el dni
                listaAux.add(String.valueOf(media)); // Añadimos la media como String

                mapaNombresDNIsMedias.put(idAspirante, listaAux); // Metemos la lista al lado del id del aspirante que se le pasó
            }
        }

        System.out.println(mapaNombresDNIsMedias); // Mostramos por pantalla el mapa de los aspirantes junto con sus datos finales principales
    }
}
