package org.velazquez.U7.Examen2122Maniana;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarOfertasporNumTrabajadores implements Comparator<Oferta>, Serializable {
    @Override
    public int compare(Oferta o1, Oferta o2) {
        return Integer.compare(o1.getListaTrabajadoresporOferta().size(), o2.getListaTrabajadoresporOferta().size());
    }
}
