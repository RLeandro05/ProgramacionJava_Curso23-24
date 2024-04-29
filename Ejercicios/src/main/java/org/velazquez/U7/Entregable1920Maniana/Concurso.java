package org.velazquez.U7.Entregable1920Maniana;

import java.io.*;
import java.util.*;

public class Concurso implements Serializable{
    Scanner sc = new Scanner(System.in);

    private String enlacePERROSDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Entregable1920\\perros.dat";
    private String nombreConcurso;
    private String localidadConcurso;
    private List<Perro> listaPerros = new ArrayList<>();
    private Map<String, List<Perro>> mapRazaTOListaPerros = new HashMap<>();
    private List<String> listaRazas = new ArrayList<>();

    public Concurso(String nombreConcurso, String localidadConcurso) {
        this.nombreConcurso = nombreConcurso;
        this.localidadConcurso = localidadConcurso;
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidadConcurso() {
        return localidadConcurso;
    }

    public void setLocalidadConcurso(String localidadConcurso) {
        this.localidadConcurso = localidadConcurso;
    }

    public void addDog(String razaPerro, Perro perro) { // Método para añadir un nuevo perro a la lista y mapa

        List<Perro> listaPerrosAux = new ArrayList<>(); // Lista auxiliar de perros

        if (!listaRazas.contains(razaPerro)) { // Si esa raza no estaba en la lista, la añadimos
            listaRazas.add(razaPerro);

        }

        if (!listaPerros.contains(perro)) { // Si el perro no está en la lista de perros, se añade
            listaPerros.add(perro);
        }

        // Mostramos la lista de razas actuales para inscribir
        System.out.println("A partir de la lista de razas actuales de la competición, añada a su perro en la raza correcta: ");
        System.out.println(listaRazas);
        String ingresarPerroEnListaRazas = sc.next();

        while (!ingresarPerroEnListaRazas.equals(razaPerro)) { // Si intenta inscribirlo a otra raza, le aparecerá un error
            System.out.println("La raza escogida no es la de su perro. Por favor, seleccione la correcta.");
            System.out.println(listaRazas);
            ingresarPerroEnListaRazas = sc.next();
        }

        if (!mapRazaTOListaPerros.containsKey(razaPerro)) { // Si su raza no está aún en el mapa, añadimos la raza con la lista vacía
            mapRazaTOListaPerros.put(razaPerro, listaPerrosAux);
        }

        if (!mapRazaTOListaPerros.get(razaPerro).contains(perro)) { // Si en la lista no está su perro especificamente, entonces se añadirá
            mapRazaTOListaPerros.get(razaPerro).add(perro);
            System.out.println("Su perro ha sido inscrito correctamente a la lista de perros y razas."); // Mostramos el mensaje satisfactoriamente
        } else {
            System.out.println("Su perro ya estaba inscrito. No puedes inscribir dos veces al mismo."); // Si ya está el mismo perro, no lo añadimos y se lo comentamos al propietario
        }
    }

    public void disqualifyDog(Perro perro) { // Método para eliminar perros de la lista y del mapa

        // Si el perro no estaba añadido, se lo decimos al propietario
        if (!listaPerros.contains(perro) && !mapRazaTOListaPerros.get(perro.getRazaPerro()).contains(perro)) {
            System.out.println("Su perro "+perro.getNombrePerro()+" no estaba inscrito.");
        } else { // Si estaba añadido, lo eliminamos tanto de la lista de perros, como de la lista del mapa de su raza correspondiente
            listaPerros.remove(perro);
            mapRazaTOListaPerros.get(perro.getRazaPerro()).remove(perro);

            System.out.println("Su perro "+perro.getNombrePerro()+" ha sido descalificado del concurso."); // Se lo comentamos al propietario
        }
    }

    public void ownerDogs(Integer numSocioPropietario) {
        List<Perro> listaPerrosporDuenio = new ArrayList<>(); // Lista de perros donde gaurdamos los perros de dicho dueño

        for (Perro perro : listaPerros) { // Recorremos la lista de todos los perros del concurso
            if (perro.getPropietarioPerro().getNumSocioPropietario() == numSocioPropietario) { // Si el perro es de dicho propietario, lo añadimos a la lista
                listaPerrosporDuenio.add(perro);
            }
        }

        if (listaPerrosporDuenio.isEmpty()) { // Si no tiene perros, la lista estará vacía, y diremos que no hay perros inscritos
            System.out.println("El dueño con número de socio '"+numSocioPropietario+"' no tiene perros inscritos en la competición.");
        } else { // Si tiene alguno, se mostrarán sus perros con su información
            System.out.println("El dueño con número de socio '"+numSocioPropietario+"' tiene los siguientes perros inscritos: ");
            System.out.println(listaPerrosporDuenio);
        }
    }

    public void perrosporPeso(String razaPerro) { // Método para mostrar lista de perros de una raza en concreto en función al peso decrecientemente
        List<Perro> listaPerrosPorPeso = new ArrayList<>(); // Lista para guardar dichos perros

        for (Perro perro : listaPerros) {
            if (perro.getRazaPerro().equals(razaPerro)) { // Si el perro de la lista es la que queremos, lo añadimos
                listaPerrosPorPeso.add(perro);
            }
        }

        listaPerrosPorPeso.sort(new PerrosOrdenadosPorPesoDecreciente()); // Lo ordenamos

        System.out.println("Lista de perros de la raza '"+razaPerro+"' ordenados por peso decrecientemente: ");
        System.out.println(listaPerrosPorPeso); // Lo mostramos por pantalla
    }

    public void perrosporEdad(String razaPerro) { // Método para mostrar lista de perros de una raza en concreto en función a la edad decrecientemente
        List<Perro> listaPerrosPorEdad = new ArrayList<>(); // Lista para guardar dichos perros

        for (Perro perro : listaPerros) {
            if (perro.getRazaPerro().equals(razaPerro)) { // Si el perro de la lista es la que queremos, lo añadimos
                listaPerrosPorEdad.add(perro);
            }
        }

        listaPerrosPorEdad.sort(new PerrosOrdenadosPorEdadDecreciente()); // Lo ordenamos

        System.out.println("Lista de perros de la raza '"+razaPerro+"' ordenados por peso decrecientemente: ");
        System.out.println(listaPerrosPorEdad); // Lo mostramos por pantalla
    }

    public void cargarPerros() { // Método para cargar la lista de perros

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlacePERROSDAT));

            listaPerros = (List<Perro>) lector.readObject();

            for (Perro perro : listaPerros) {
                ingresarPerrosDesdePERROsDAT(perro.getRazaPerro(), perro);
            }

            lector.close();

            System.out.println("Archivo perros.dat cargado correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }

    public void ingresarPerrosDesdePERROsDAT(String razaPerro, Perro perro) { // Método exclusivo proveniente del anterior método cargarPerros()
        List<Perro> listaPerrosAux = new ArrayList<>();

        if (!mapRazaTOListaPerros.containsKey(razaPerro)) { // Si su raza no está aún en el mapa, añadimos la raza con la lista vacía
            mapRazaTOListaPerros.put(razaPerro, listaPerrosAux);
        }

        if (!mapRazaTOListaPerros.get(razaPerro).contains(perro)) { // Si en la lista no está su perro especificamente, entonces se añadirá
            mapRazaTOListaPerros.get(razaPerro).add(perro);
            System.out.println("Su perro ha sido inscrito correctamente a la lista de perros y razas."); // Mostramos el mensaje satisfactoriamente
        } else {
            System.out.println("Su perro ya estaba inscrito. No puedes inscribir dos veces al mismo."); // Si ya está el mismo perro, no lo añadimos y se lo comentamos al propietario
        }
    }

    public void guardarPerros() { // Método para guardar la lista de perros en el archivo .dat

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlacePERROSDAT));

            escritor.writeObject(listaPerros); // lo guardamos

            escritor.close(); // Cerramos

            System.out.println("Lista de perros añadida al archivo perros.dat correctamente.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
