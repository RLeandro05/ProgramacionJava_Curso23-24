package org.velazquez.U7.Entregable1920Tarde;

import java.io.Serializable;
import java.util.Comparator;

public class PacientesOrdenadosPorPeso implements Comparator<Paciente>, Serializable {
    @Override
    public int compare(Paciente o1, Paciente o2) {
        return Double.compare(o2.getPesoPaciente(), o1.getPesoPaciente());
    }
}
