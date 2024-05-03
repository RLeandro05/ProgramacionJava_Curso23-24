package org.velazquez.U7.Tarea5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class IntroducirAspirantes implements Serializable {
    Scanner sc = new Scanner(System.in);

    // Creamos una lista de Aspirantes donde guardaremos cada objeto Aspirante creado
    private List<Aspirante> listaAspirantes = new ArrayList<>();
    Map<Integer, Aspirante> mapAspirantes = new LinkedHashMap<>();

    public void InsertaAspirante () { // Definimos el método "InsertaAspirante"
        String respuesta;

        do {
            // En un do-while, añadimos la información del nuevo aspirante
            System.out.println("Introduzca el nombre del aspirante: ");
            String nombreAspirante = sc.nextLine();
            System.out.println("Introduzca el dni del aspirante: ");
            String dniAspirante = sc.nextLine();
            System.out.println("Introduzca el teléfono del aspirante: ");
            int telAspirante = sc.nextInt();
            sc.nextLine();

            // Creamos el aspirante como un nuevo objeto
            Aspirante aspirante = new Aspirante(nombreAspirante, dniAspirante, telAspirante);

            // Lo añadimos a la lista previamente creada
            listaAspirantes.add(aspirante);

            // Decidimos si queremos seguir insertando nuevos aspirantes
            System.out.println("¿Desea seguir insertantando Aspirantes? (s/n)");
            respuesta = sc.nextLine().toUpperCase();

        } while (!respuesta.equals("N")); // En cuanto queramos dejar de insertar nuevos aspirantes, salimos del bucle y terminamos el método
    }
    public void guardarFicheros (List<Aspirante> listaAspirantes) { // Definimos la función "gurdarFicheros", al que le pasaremos la lista de Aspirantes previamente hecha en la clase

        // Creamos dos ficheros
        String aspirantesDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea5\\aspirantes.dat";
        String ids_aspirantesDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea5\\ids_aspirantes.dat";

        // En un for-each, añadimos al mapa el id del aspirante y luego el objeto entero con la información del aspirante
        for (Aspirante elemento : listaAspirantes) {
            mapAspirantes.put(elemento.getIdAspirante(), elemento);
        }

        List<Integer> listaIdsAspirantes = new ArrayList<>(); // Creamos una lista para guardar únicamente los ids de los aspirantes

        // En un for-each, añadimos a la nueva lista los ids de cada aspirante
        for (Aspirante elemento : listaAspirantes) {
            listaIdsAspirantes.add(elemento.getIdAspirante());
        }

        try (ObjectOutputStream escritor1 = new ObjectOutputStream(new FileOutputStream(aspirantesDAT));
            ObjectOutputStream escritor2 = new ObjectOutputStream(new FileOutputStream(ids_aspirantesDAT))){

            // Añadimos el mapa al primer fichero
            escritor1.writeObject(mapAspirantes);

            // Añadimos la lista al segundo fichero
            escritor2.writeObject(listaIdsAspirantes);

            // Comentamos que los datos se insertaron correctamente
            System.out.println("Información de los aspirantes guardada correctamente en los ficheros 'aspirantes.dat' y 'ids_aspirantes.dat'.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }

    public List<Aspirante> getListaAspirantes() {
        return listaAspirantes;
    }

    public void setListaAspirantes(List<Aspirante> listaAspirantes) {
        this.listaAspirantes = listaAspirantes;
    }
}
