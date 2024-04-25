package org.velazquez.U7.Entregable2021Tarde;

import java.util.Comparator;

public class OrdenarAlumnosporApellido implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellidoAlumno().compareTo(o2.getApellidoAlumno());
    }
}
