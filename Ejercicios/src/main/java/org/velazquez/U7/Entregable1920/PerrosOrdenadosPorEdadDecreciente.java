package org.velazquez.U7.Entregable1920;

import java.io.Serializable;
import java.util.Comparator;

public class PerrosOrdenadosPorEdadDecreciente implements Comparator<Perro>, Serializable {
    @Override
    public int compare(Perro o1, Perro o2) {

        return Integer.compare(o2.getEdadPerro(), o1.getEdadPerro());

//        if (o2.getEdadPerro() > o1.getEdadPerro()) {
//            return -1;
//        } else if (o2.getEdadPerro() < o1.getEdadPerro()) {
//            return 1;
//        } else {
//            return  0;
//        }
    }
}
