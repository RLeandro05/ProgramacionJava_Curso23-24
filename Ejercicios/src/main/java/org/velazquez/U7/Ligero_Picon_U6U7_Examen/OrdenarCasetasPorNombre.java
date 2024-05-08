package org.velazquez.U7.Ligero_Picon_U6U7_Examen;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarCasetasPorNombre implements Comparator<Caseta>, Serializable {
    @Override
    public int compare(Caseta o1, Caseta o2) {
        return o1.getNombreCaseta().compareTo(o2.getNombreCaseta());
    }
}
