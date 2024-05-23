package org.velazquez.U8.Entregable2122Maniana;

import java.util.Comparator;

public class OrdenarAlumnosPorDNI implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getDniAlumno().compareTo(o2.getDniAlumno());
    }
}
