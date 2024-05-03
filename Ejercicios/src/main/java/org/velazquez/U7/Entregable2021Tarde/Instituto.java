package org.velazquez.U7.Entregable2021Tarde;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Instituto {

    List<Alumno> listaAlumnos = new ArrayList<>(); // Guardamos objetos tipo Alumno
    Map<Integer, String> mapIdAlumno_NombreUnidad = new HashMap<>(); // Guardamos un mapa con el ID de Alumno como clave y el nombre de su unidad como Elemento
    Map<String, List<Alumno>> mapNombreUnidad_ListaAlumnos = new HashMap<>(); // Guardamos un mapa con el nombre de la unidad como clave y la lista de alumnos como elemento, la cual estará asignada a dicha unidad

    String enlaceAlumnosDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Entregable2021Tarde\\alumnos.dat";
    String nombreInstituto;

    public Instituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public void mostrarTodosAlumnosOrdenados() { // Muestra la lista ordenada por apellido
        listaAlumnos.sort(new OrdenarAlumnosporApellido());
        System.out.println("Lista de Alumnos ordenada por apellido: "+listaAlumnos);
    }
    public String obtenerUnidadAlumno(Integer idAlumno) { // Devuelve su unidad en la que está matriculado
        if (!mapIdAlumno_NombreUnidad.containsKey(idAlumno)) {
            return "No hay un alumno con id '"+idAlumno+"'.";
        }

        return "La unidad del alumno con id '"+idAlumno+"' es: "+mapIdAlumno_NombreUnidad.get(idAlumno)+".";
    }
    public void mostrarAlumnosUnidad(String nombreUnidad) { // Muestra el mapa de las unidades con sus alumnos ordenados por DNI
        listaAlumnos.sort(new OrdenarAlumnosporDNI());
        System.out.println(mapNombreUnidad_ListaAlumnos);
    }
    public void addAlumnoUnidad(Alumno alumno, String nombreUnidad) { // Para añadir en el mapa un nuevo alumno a la unidad si esta ya existe
        insertarAlumnoenLista(alumno);
        insertarAlumnoyUnidadenMapa(alumno, nombreUnidad);
    }
    public void insertarAlumnoenLista(Alumno alumno) { // Para insertar un nuevo alumno en la lista de alumnos

        if (!listaAlumnos.contains(alumno)) {
            listaAlumnos.add(alumno);
            System.out.println("Alumno añadido correctamente a la lista de alumnos.");
        } else {
            System.out.println("El alumno ya estaba en la lista de alumnos.");
        }
    }
    public void insertarAlumnoyUnidadenMapa(Alumno alumno, String nombreUnidad) {

        List<Alumno> listaAuxAlumnos = new ArrayList<>(); // Lista auxiliar de alumnos

        if (!mapNombreUnidad_ListaAlumnos.containsKey(nombreUnidad)) { // Si esa unidad nunca estuvo, la añadimos junto a la lista
            mapNombreUnidad_ListaAlumnos.put(nombreUnidad, listaAuxAlumnos);
        }

        if (!listaAlumnos.contains(alumno)) {
            listaAlumnos.add(alumno);
            System.out.println("Alumno añadido correctamente a la lista de alumnos.");
        }

        for (Alumno al : listaAlumnos) { // Recorremos la lista completa de alumnos
            if (al.getUnidadAlumno().getNombreUnidad().equals(nombreUnidad)) { // En cuanto encuentre a un alumno con esa unidad, entra
                if (!mapNombreUnidad_ListaAlumnos.get(nombreUnidad).contains(al)) { // Como queremos añadir únicamente a ese nuevo alumno, buscamos el alumno que no esté en esa lista de esa unidad
                    mapNombreUnidad_ListaAlumnos.get(nombreUnidad).add(al); // En cuanto la lista vea que ese nuevo alumno con esa unidad no esté en su lista, la añade
                }
            }
        }

        System.out.println("Añadido el alumno y la unidad correspondiente al mapa.");
    }
    public void cargarAlumnos() {

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlaceAlumnosDAT));

            listaAlumnos = (List<Alumno>) lector.readObject();

            lector.close();

            for (Alumno alumno : listaAlumnos) {
                if (!mapNombreUnidad_ListaAlumnos.get(alumno.getUnidadAlumno().getNombreUnidad()).contains(alumno)) {
                    mapNombreUnidad_ListaAlumnos.get(alumno.getUnidadAlumno().getNombreUnidad()).add(alumno);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
    public void guardarAlumnos() {

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlaceAlumnosDAT));

            escritor.writeObject(listaAlumnos);

            escritor.close();
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
