package org.velazquez.U7.Ligero_Picon_U6U7_Examen;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeriaSevilla implements Serializable{

    private Map<String, Caseta> mapNombreTOCaseta = new HashMap<>();
    private Map<String, Artista> mapNombreArtisticoTOArtista = new HashMap<>();
    private Map<Caseta, List<Artista>> mapCasetaTOListaArtistas = new HashMap<>();
    private Map<Artista, List<Caseta>> mapArtistaTOListaCasetas = new HashMap<>();

    public void addActuacion(Caseta c, Artista a) { // Método para añadir artista y caseta en todos los mapas de la clase
        List<Artista> listaAuxArtistas = new ArrayList<>();
        List<Caseta> listaAuxCasetas = new ArrayList<>();

        // Asegurarse de que existen en sus mapas propios
        if (!mapNombreTOCaseta.containsKey(c.getNombreCaseta())) {
            mapNombreTOCaseta.put(c.getNombreCaseta(), c);
        } else {
            System.out.println("La caseta '"+c.getNombreCaseta()+"' ya estaba en la lista con el mismo nombre.");
        }
        if (!mapNombreArtisticoTOArtista.containsKey(a.getNombreArtisticoArtista())) {
            mapNombreArtisticoTOArtista.put(a.getNombreArtisticoArtista(), a);
        } else {
            System.out.println("El artista '"+a.getNombreArtisticoArtista()+"' ya estaba en la lista con el mismo nombre.");
        }


        // Asegurarse de si están en las  listas correspondientes de cada objeto
        if (!mapCasetaTOListaArtistas.containsKey(c)) {
            mapCasetaTOListaArtistas.put(c, listaAuxArtistas);
        }
        if (!mapArtistaTOListaCasetas.containsKey(a)) {
            mapArtistaTOListaCasetas.put(a, listaAuxCasetas);
        }

        // Meterlos en sus respectivas listas de mapas
        if (!mapCasetaTOListaArtistas.get(c).contains(a)) {
            mapCasetaTOListaArtistas.get(c).add(a);
            System.out.println("Artista '"+a.getNombreArtisticoArtista()+"' añadido correctamente a la lista de artistas de la caseta '"+c.getNombreCaseta()+"'.");
        }
        if (!mapArtistaTOListaCasetas.get(a).contains(c)) {
            mapArtistaTOListaCasetas.get(a).add(c);
            System.out.println("Caseta '"+c.getNombreCaseta()+"' añadido correctamente a la lista de casetas del artista '"+a.getNombreArtisticoArtista()+"'.");
        }
    }
    public List<Artista> getArtistas(Caseta c) { // Método para mostrar la lista de artistas asignados a una caseta
        List<Artista> listaAuxArtistas = new ArrayList<>();

        // Comprobar si la caseta existe en su mapa propio
        if (!mapNombreTOCaseta.containsKey(c.getNombreCaseta())) {
            System.out.println("La caseta '"+c.getNombreCaseta()+"' no está en la lista de casetas de la feria.");
        } else {
            if (mapCasetaTOListaArtistas.get(c).isEmpty()) { // Comprobar si hay artistas en la lista de artistas de la caseta
                System.out.println("En la caseta '"+c.getNombreCaseta()+"' no hay ningún artista aún en la lista.");
            } else {
                listaAuxArtistas = mapCasetaTOListaArtistas.get(c); // Añadir en una lista auxiliar la lista del mapa de la caseta correspondiente
                listaAuxArtistas.sort(new OrdenarArtistasPorNombreArtistico()); // Ordenar por nombre artístico del artista
                System.out.println("En la caseta '"+c.getNombreCaseta()+"' hay una lista de artistas apuntados. Es la siguinte: ");
            }
        }

        return listaAuxArtistas;
    }
    public List<Caseta> getCasetas(Artista a) { // Método para mostrar la lista de casetas asignados a un artista
        List<Caseta> listaAuxCasetas = new ArrayList<>();

        // Comprobar si el artista existe en su mapa propio
        if (!mapNombreArtisticoTOArtista.containsKey(a.getNombreArtisticoArtista())) {
            System.out.println("El artista '"+a.getNombreArtisticoArtista()+"' no está en la lista de artistas de la feria.");
        } else {
            if (mapArtistaTOListaCasetas.get(a).isEmpty()) { // Comprobar si hay artistas en el mapa de artistas con casetas
                System.out.println("Aún no se han asignado casetas al artista '"+a.getNombreArtisticoArtista()+"'.");
            } else {
                listaAuxCasetas = mapArtistaTOListaCasetas.get(a);
                listaAuxCasetas.sort(new OrdenarCasetasPorNombre()); // Ordenar por nombre de casetas
                System.out.println("Se ha encontrado la lista de casetas asignadas al artista '"+a.getNombreArtisticoArtista()+"'. Es la siguiente: ");
            }
        }

        return listaAuxCasetas;
    }
    public Caseta getCaseta(String nombre) { // Método para mostrar una caseta específica a partir de su nombre

        Caseta caseta = null;

        if (!mapNombreTOCaseta.containsKey(nombre)) { // Comprobamos si existe la caseta en su mapa propio
            System.out.println("La caseta '"+nombre+"' no está en la lista de casetas de la feria.");
        } else {
            caseta = mapNombreTOCaseta.get(nombre);
            System.out.println("La caseta '"+nombre+"' está en la lista de casetas de la feria.");
        }

        return caseta;
    }
    public void removeCaseta(String nombre) { // Método para eliminar una caseta de todos los mapas

        // Eliminar la caseta de su mapa propio
        if (!mapNombreTOCaseta.containsKey(nombre)) {
            System.out.println("La caseta '"+nombre+"' no estaba en la lista de casetas de la feria.");
        } else {
            mapNombreTOCaseta.remove(nombre);
            System.out.println("Caseta '"+nombre+"' eliminada correctamente de la lista de casetas de la feria.");
        }

        // Eliminar la caseta del mapa de caseta con lista de artistas
        for (Map.Entry<Caseta, List<Artista>> entrada : mapCasetaTOListaArtistas.entrySet() ) {
            if (entrada.getKey().getNombreCaseta().equals(nombre)) {
                mapCasetaTOListaArtistas.remove(entrada.getKey());
                System.out.println("Caseta '"+nombre+"' eliminada correctamente de la relación de casetas con artistas de la feria.");
                break;
            }
        }

        // Eliminar la caseta del mapa de artista con lista de casetas
        for (Map.Entry<Artista, List<Caseta>> entrada : mapArtistaTOListaCasetas.entrySet()) {

            for (Caseta caseta : entrada.getValue()) {
                if (caseta.getNombreCaseta().equals(nombre)) {
                    entrada.getValue().remove(caseta);
                    System.out.println("Caseta '"+nombre+"' eliminada correctamente de la relación de artistas con casetas de la feria.");
                    break;
                }
            }
        }

    }
    public Artista getArtista(String nombreArtistico) { // Método para mostrar un artista específico de su mapa propio
        Artista artista = null;

        if (!mapNombreArtisticoTOArtista.containsKey(nombreArtistico)) {
            System.out.println("El artista '"+nombreArtistico+"' no está en la lista de artistas de la feria.");
        } else {
            artista = mapNombreArtisticoTOArtista.get(nombreArtistico);
            System.out.println("Artista '"+nombreArtistico+"' encontrado en la lista de artistas de la feria.");
        }

        return artista;
    }
    public void guardarDatos() { // Método para guardar todos los mapas en el fichero .dat
        String enlaceFERIASEVILLADAT = "C:\\Users\\DAW_M\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\Ligero_Picon_U6U7_Examen\\feriasevilla.dat";

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlaceFERIASEVILLADAT));

            escritor.writeObject(mapNombreTOCaseta);
            escritor.writeObject(mapNombreArtisticoTOArtista);
            escritor.writeObject(mapCasetaTOListaArtistas);
            escritor.writeObject(mapArtistaTOListaCasetas);

            escritor.close();

            System.out.println("Estructuras de la feria guardadas correctamente en el fichero 'feriasevilla.dat'.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
    public void cargarDatos() { // Método para cargar todos los mapas del fichero .dat
        String enlaceFERIASEVILLADAT = "C:\\Users\\DAW_M\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\Ligero_Picon_U6U7_Examen\\feriasevilla.dat";

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlaceFERIASEVILLADAT));

            mapNombreTOCaseta = (Map<String, Caseta>) lector.readObject();
            mapNombreArtisticoTOArtista = (Map<String, Artista>) lector.readObject();
            mapCasetaTOListaArtistas = (Map<Caseta, List<Artista>>) lector.readObject();
            mapArtistaTOListaCasetas = (Map<Artista, List<Caseta>>) lector.readObject();

            lector.close();

            System.out.println("Estructuras de la feria cargadas correctamente del fichero 'feriasevilla.dat'.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
