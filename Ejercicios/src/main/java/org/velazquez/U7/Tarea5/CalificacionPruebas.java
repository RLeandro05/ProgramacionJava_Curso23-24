package org.velazquez.U7.Tarea5;

import java.io.*;
import java.util.*;

public class CalificacionPruebas implements Serializable {
    Scanner sc = new Scanner(System.in);

    private Map<Integer, List<Double>> mapaCalificaciones = new HashMap<>();

    public void insertarCalificaciones (int idAspirante, double calificacionAspirante) {

        if (mapaCalificaciones.containsKey(idAspirante)) {
            mapaCalificaciones.get(idAspirante).add(calificacionAspirante);
        } else {
            List<Double> listaAuxCalificaciones = new ArrayList<>();
            listaAuxCalificaciones.add(calificacionAspirante);

            mapaCalificaciones.put(idAspirante, listaAuxCalificaciones);
        }
    }
    public void guardarFichero () {
        // Creamos un nuevo fichero para guardar los ids y las calificaciones
        String calificacionesDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea5\\calificaciones.dat";

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(calificacionesDAT));

            escritor.writeObject(mapaCalificaciones); // Almacenamos el mapa en el archivo

            escritor.close(); // Cerramos

            System.out.println("Calificaciones guardadas correctamente.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }

    public Map<Integer, List<Double>> getMapaCalificaciones() {
        return mapaCalificaciones;
    }

    public void setMapaCalificaciones(Map<Integer, List<Double>> mapaCalificaciones) {
        this.mapaCalificaciones = mapaCalificaciones;
    }
}
