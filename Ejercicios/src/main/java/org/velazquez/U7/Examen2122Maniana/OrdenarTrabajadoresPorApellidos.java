package org.velazquez.U7.Examen2122Maniana;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenarTrabajadoresPorApellidos implements Comparator<Trabajadores>, Serializable {
    @Override
    public int compare(Trabajadores o1, Trabajadores o2) {
        if (o1.getApellidosTrabajador().compareTo(o2.getApellidosTrabajador()) > 0) {
            return 1;
        } else if (o1.getApellidosTrabajador().compareTo(o2.getApellidosTrabajador()) < 0) {
            return -1;
        } else {
            return o1.getNombreTrabajador().compareTo(o2.getNombreTrabajador());
        }
    }
}
