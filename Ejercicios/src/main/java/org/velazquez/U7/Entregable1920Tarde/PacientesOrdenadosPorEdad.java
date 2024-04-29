package org.velazquez.U7.Entregable1920Tarde;

import java.io.Serializable;
import java.util.Comparator;

public class PacientesOrdenadosPorEdad implements Comparator<Paciente>, Serializable {
    @Override
    public int compare(Paciente o1, Paciente o2) {
        return Integer.compare(o2.getEdadPaciente(), o1.getEdadPaciente());
    }
}
