package org.velazquez.U7.Entregable1920Maniana;

import java.io.Serializable;
import java.util.Comparator;

public class PerrosOrdenadosPorPesoDecreciente implements Comparator<Perro>, Serializable {
    @Override
    public int compare(Perro o1, Perro o2) {

        return Double.compare(o2.getPesoPerro(), o1.getPesoPerro());

//        if (o2.getPesoPerro() > o1.getPesoPerro()) {
//            return -1;
//        } else if (o2.getPesoPerro() < o1.getPesoPerro()) {
//            return 1;
//        } else {
//            return  0;
//        }
    }
}
