package org.velazquez.U5.EntregableU4U52122M;

import java.util.Arrays;
import java.util.Comparator;

public class Registro {
    private Propiedad[] propiedad = new Propiedad[0];

    public Propiedad[] getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad[] propiedad) {
        this.propiedad = propiedad;
    }

    public void addPropiedad(Propiedad propiedadd) {

        Propiedad[] nuevaPropiedad = new Propiedad[propiedad.length+1];

        for (int i = 0; i < propiedad.length; i++) {
            nuevaPropiedad[i] = propiedad[i];
        }

        nuevaPropiedad[propiedad.length] = propiedadd;
        propiedad = nuevaPropiedad;
    }

    public void eliminarPropiedad(Propiedad propiedadd) {
        boolean eliminado = false;

        int index = -1;
        for (int i = 0; i < propiedad.length; i++) {
            if (propiedad[i].equals(propiedadd)) {
                index = i;
                eliminado = true;
                System.out.println(eliminado);
                break;
            } else {
                System.out.println(eliminado);
            }
        }

        if (index != -1) {
            Propiedad[] nuevaPropiedad = new Propiedad[propiedad.length - 1];
            for (int i = 0, j = 0; i < propiedad.length; i++) {
                if (i != index) {
                    nuevaPropiedad[j++] = propiedad[i];
                }
            }
            propiedad = nuevaPropiedad;
        }
    }

    public void informeSuperficie () {
        Arrays.sort(propiedad, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad o1, Propiedad o2) {
                if (o1.metros_cuadrados > o2.metros_cuadrados) {
                    return 1;
                } else if (o1.metros_cuadrados < o2.metros_cuadrados) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < propiedad.length; i++) {
            System.out.println(propiedad[i]);
        }
    }

    public void informeAntiguedad () {
        Arrays.sort(propiedad, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad o1, Propiedad o2) {
                if (o1.anio_construccion > o2.anio_construccion) {
                    return -1;
                } else if (o1.anio_construccion < o2.anio_construccion) {
                    return 1;
                } else {
                    informeSuperficie();
                    return 0;
                }
            }
        });

        for (int i = 0; i < propiedad.length; i++) {
            System.out.println(propiedad[i]);
        }
    }

    @Override
    public String toString() {
        return "Registro{}";
    }
}
