package org.velazquez.U7.Ligero_Picon_U6U7_Entregable;

import java.io.*;
import java.util.*;

public class Maraton implements Serializable {
    Scanner sc = new Scanner(System.in);

    String enlaceMARATONDAT = "C:\\Users\\DAW_M\\Desktop\\programacion_23_24\\ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Entregable2324\\maraton.dat";

    Map<Integer, Atleta> mapDorsalTOAtleta = new HashMap<>();

    public void cargarAtletas() { // Método para cargar del fichero la lista de atletas guardados

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlaceMARATONDAT));

            mapDorsalTOAtleta = (Map<Integer, Atleta>) lector.readObject();

            lector.close();

            System.out.println("Lista de atletas cargados correctamente del fichero 'maraton.dat'.");
            System.out.println(mapDorsalTOAtleta);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: " + e.getMessage());
        }
    }

    public void guardarAtletas() { // Método para guardar la lista de atletas de la maratón en un fichero

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlaceMARATONDAT));

            escritor.writeObject(mapDorsalTOAtleta);

            escritor.close();

            System.out.println("La lista de atletas de la maratón han sido guardados en el fichero 'maraton.dat' correctamente.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: " + e.getMessage());
        }
    }

    public void inscribirAtleta() { // Método para inscribir un nuevo atleta a la competición

        System.out.println("Introduzca el nombre del atleta: ");
        String nombre = sc.next();

        System.out.println("Introduzca el país del atleta: ");
        String pais = sc.next();

        int marca = 0;

        System.out.println("Introduzca la categoría del atleta (SENIOR, JUNIOR O VETERANO): ");
        String cat = sc.next();
        Atleta.categoriasAtleta categoria = Atleta.categoriasAtleta.valueOf(cat);

        Atleta atleta = null;

        switch (categoria) {
            case SENIOR:
                atleta = new Atleta(nombre, pais, marca, false, Atleta.categoriasAtleta.SENIOR);
                break;
            case JUNIOR:
                atleta = new Atleta(nombre, pais, marca, false, Atleta.categoriasAtleta.JUNIOR);
                break;
            case VETERANO:
                atleta = new Atleta(nombre, pais, marca, false, Atleta.categoriasAtleta.VETERANO);
                break;
        }

        if (!mapDorsalTOAtleta.containsKey(atleta.getDorsalAtleta())) {
            mapDorsalTOAtleta.put(atleta.getDorsalAtleta(), atleta);
        }

        System.out.println("El atleta '" + atleta.getNombreAtleta() + "' ha sido incluido en la maratón correctamente.");

        System.out.println("Hay '" + mapDorsalTOAtleta.size() + "' atletas en la lista.");
    }

    public void guardarTiempo(int dorsalAtleta, int marcaAtleta) { // Método para insertar finisher y marca de un atleta de la maratón

        if (mapDorsalTOAtleta.containsKey(dorsalAtleta)) {
            mapDorsalTOAtleta.get(dorsalAtleta).setMarcaAtleta(marcaAtleta);
            mapDorsalTOAtleta.get(dorsalAtleta).setAcaboAtleta(true);

            System.out.println("Atleta con dorsal '" + dorsalAtleta + "' ha terminado la maratón.");
        } else {
            System.out.println("El atleta con dorsal '" + dorsalAtleta + "' no estaba en la lista de atletas de la maratón.");
        }


    }

    public void borrarAtleta(int dorsalAtleta) { // Método para quitar un atleta de la lista de atletas de la maratón

        if (mapDorsalTOAtleta.containsKey(dorsalAtleta)) {
            mapDorsalTOAtleta.remove(dorsalAtleta);
            System.out.println("El atleta con dorsal '" + dorsalAtleta + "' ha sido dado de baja.");
        } else {
            System.out.println("El atleta con dorsal '" + dorsalAtleta + "' no estaba en la lista de atletas de la maratón.");
        }

    }

    public void MostrarListaFinishers() { // Método que muestra una lista de finishers ordenados por tiempo
        List<Atleta> listaFinishers = new ArrayList<>();

        for (Map.Entry<Integer, Atleta> entrada : mapDorsalTOAtleta.entrySet()) {
            if (entrada.getValue().getAcaboAtleta()) {
                listaFinishers.add(entrada.getValue());
            }
        }

        listaFinishers.sort(new AtletasOrdenadosPorTiempo());

        System.out.println("Lista de atletas que acabaron la maratón por orden de tiempo: ");
        System.out.println(listaFinishers);
    }

    public void MostrarListaCategoria(Atleta.categoriasAtleta categoriaAtleta) { // Método para mostrar la lista de atletas por categoría ordenados por tiempo
        List<Atleta> listaAtletasPorCategoria = new ArrayList<>();

        for (Map.Entry<Integer, Atleta> entrada : mapDorsalTOAtleta.entrySet()) {
            if (entrada.getValue().getCategoriaAtleta().equals(categoriaAtleta)) {
                listaAtletasPorCategoria.add(entrada.getValue());
            }
        }

        listaAtletasPorCategoria.sort(new AtletasOrdenadosPorTiempo());

        System.out.println("Lista de atletas de la categoría '" + categoriaAtleta + "' ordenados por tiempo: ");
        System.out.println(listaAtletasPorCategoria);
    }

    public void ParticipantesPorPais(String paisAtleta) { // Método para mostrar una lista de participantes por país

        System.out.println("Lista de atletas del país '" + paisAtleta + "': ");

        for (Map.Entry<Integer, Atleta> entrada : mapDorsalTOAtleta.entrySet()) {
            if (entrada.getValue().getPaisAtleta().equals(paisAtleta)) {
                System.out.println(entrada.getValue());
            }
        }

    }

    public void ingresarPreCreados(Atleta atleta) { // Método exclusivo que añade atletas precreados para el entregable

        if (!mapDorsalTOAtleta.containsKey(atleta.getDorsalAtleta())) {
            mapDorsalTOAtleta.put(atleta.getDorsalAtleta(), atleta);
        }

        System.out.println("El atleta '" + atleta.getNombreAtleta() + "' ha sido incluido en la maratón correctamente.");

    }
}
