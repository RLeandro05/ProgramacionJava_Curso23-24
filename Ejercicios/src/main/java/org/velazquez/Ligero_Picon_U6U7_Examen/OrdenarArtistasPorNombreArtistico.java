package org.velazquez.Ligero_Picon_U6U7_Examen;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarArtistasPorNombreArtistico implements Comparator<Artista>, Serializable {
    @Override
    public int compare(Artista o1, Artista o2) {
        return o1.getNombreArtisticoArtista().compareTo(o2.getNombreArtisticoArtista());
    }
}
