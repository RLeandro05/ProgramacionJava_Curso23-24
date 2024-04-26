package org.velazquez.U7.Entregable2324;

import java.io.Serializable;
import java.util.Comparator;

public class AtletasOrdenadosPorTiempo implements Comparator<Atleta>, Serializable { // Comparador que ordena los atletas por tiempo
    @Override
    public int compare(Atleta o1, Atleta o2) {
        return Integer.compare(o1.getMarcaAtleta(), o2.getMarcaAtleta());
    }
}
