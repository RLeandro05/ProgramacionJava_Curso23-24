package org.velazquez.U5.EntregableU4U52122T;

import java.util.Arrays;
import java.util.Comparator;

public class COAC{
    private AgrupacionOficial[] agrupacionesOficiales = new AgrupacionOficial[0];

    public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        AgrupacionOficial[] nuevaAgrupacionOficial = new AgrupacionOficial[agrupacionesOficiales.length+1];

        for (int i = 0; i < agrupacionesOficiales.length; i++) {
            nuevaAgrupacionOficial[i] = agrupacionesOficiales[i];
        }

        nuevaAgrupacionOficial[agrupacionesOficiales.length] = agrupacion;
        agrupacionesOficiales = nuevaAgrupacionOficial;
    }
    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        int index = -1;
        for (int j = 0; j < agrupacionesOficiales.length; j++) {
            if (agrupacionesOficiales[j].equals(agrupacion)) {
                index = j;
                break;
            }
        }

        if (index != -1) {
            AgrupacionOficial[] nuevaAgrupacionOficial = new AgrupacionOficial[agrupacionesOficiales.length - 1];
            for (int j = 0, k = 0; j < agrupacionesOficiales.length; j++) {
                if (j != index) {
                    nuevaAgrupacionOficial[k++] = agrupacionesOficiales[j];
                }
            }
            agrupacionesOficiales = nuevaAgrupacionOficial;
            return true;
        }

        return false;
    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupacionesOficiales, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
                if (o1.puntos_obtenidos > o2.puntos_obtenidos) {
                    return 1;
                } else if (o1.puntos_obtenidos < o2.puntos_obtenidos) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    public void ordenar_por_nombre() {
        Arrays.sort(agrupacionesOficiales, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        });
    }
    public void ordenar_por_autor() {
        Arrays.sort(agrupacionesOficiales, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
                return o1.autor.compareTo(o2.autor);
            }
        });
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupacionesOficiales=" + Arrays.toString(agrupacionesOficiales) +
                '}';
    }
}
