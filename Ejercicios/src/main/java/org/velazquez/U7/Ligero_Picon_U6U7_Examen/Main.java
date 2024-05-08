package org.velazquez.U7.Ligero_Picon_U6U7_Examen;

import java.io.Serializable;
import java.util.List;

public class Main implements Serializable {
    public static void main(String[] args) {

        FeriaSevilla feria = new FeriaSevilla();

        Caseta c1 = new Caseta("Caseta1", "Ubicacion1", 1000);
        Caseta c2 = new Caseta("Caseta2", "Ubicacion2", 2000);
        Caseta c3 = new Caseta("Caseta3", "Ubicacion3", 3000);
        Caseta c4 = new Caseta("Caseta4", "Ubicacion4", 4000);
        Caseta c5 = new Caseta("Caseta5", "Ubicacion5", 5000);
        Caseta c6 = new Caseta("Caseta5", "Ubicacion6", 6000);


        Artista a1 = new Artista("Artista1", "Genero1", "Nacinalidad1");
        Artista a2 = new Artista("Artista2", "Genero2", "Nacinalidad2");
        Artista a3 = new Artista("Artista3", "Genero3", "Nacinalidad3");
        Artista a6 = new Artista("Artista3", "Genero6", "Nacinalidad6");
        Artista a4 = new Artista("Artista4", "Genero4", "Nacinalidad4");
        Artista a5 = new Artista("Artista5", "Genero5", "Nacinalidad5");

        System.out.println();

        feria.addActuacion(c1, a1);
        System.out.println("-------------------------------------------------------------------------------------------");
        feria.addActuacion(c2, a3);
        System.out.println("-------------------------------------------------------------------------------------------");
        feria.addActuacion(c3, a5);
        System.out.println("-------------------------------------------------------------------------------------------");
        feria.addActuacion(c4, a6);
        System.out.println("-------------------------------------------------------------------------------------------");
        feria.addActuacion(c5, a4);
        System.out.println("-------------------------------------------------------------------------------------------");
        feria.addActuacion(c6, a2);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        List<Artista> listaArtistasC3 = feria.getArtistas(c3);
        System.out.println(listaArtistasC3);
        System.out.println("-------------------------------------------------------------------------------------------");
        List<Artista> listaArtistasC5 = feria.getArtistas(c5);
        System.out.println(listaArtistasC5);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        List<Caseta> listaCasetasA2 = feria.getCasetas(a2);
        System.out.println(listaCasetasA2);
        System.out.println("-------------------------------------------------------------------------------------------");
        List<Caseta> listaCasetasA4 = feria.getCasetas(a4);
        System.out.println(listaCasetasA4);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        Caseta caseta1 = feria.getCaseta(c1.getNombreCaseta());
        System.out.println(caseta1);
        System.out.println("-------------------------------------------------------------------------------------------");
        Caseta caseta3 = feria.getCaseta(c3.getNombreCaseta());
        System.out.println(caseta3);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        feria.removeCaseta(c5.getNombreCaseta());
        System.out.println("-------------------------------------------------------------------------------------------");
        feria.removeCaseta(c2.getNombreCaseta());
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        Artista artista3 = feria.getArtista(a3.getNombreArtisticoArtista());
        System.out.println(artista3);
        System.out.println("-------------------------------------------------------------------------------------------");
        Artista artista1 = feria.getArtista(a1.getNombreArtisticoArtista());
        System.out.println(artista1);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        feria.guardarDatos();
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println();

        feria.cargarDatos();
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
