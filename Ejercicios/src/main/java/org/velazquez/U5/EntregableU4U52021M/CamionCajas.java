package org.velazquez.U5.EntregableU4U52021M;

import java.util.Arrays;
import java.util.Comparator;

public class CamionCajas extends FlotaVehiculos implements Comparable<CamionCajas>{
    Cajas[] cajas = new Cajas[0];

    public CamionCajas(String matricula, int cargaMaxima, String conductor) {
        super(matricula, cargaMaxima, conductor);
    }
    @Override
    public void descargar() {
        System.out.println("Descargando "+contarCajas()+" cajas y Y prendas");
    }

    public void addCaja(Cajas caja) {
        if (cajas.length <= getCargaMaxima()) {
            Cajas[] nuevaCaja = new Cajas[cajas.length+1];

            for (int i = 0; i < cajas.length; i++) {
                nuevaCaja[i] = cajas[i];
            }

            nuevaCaja[cajas.length] = caja;
            cajas = nuevaCaja;
        }
    }
    public void eliminarCaja(Cajas caja) {
        int index = -1;
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i].equals(caja)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Cajas[] nuevaCaja = new Cajas[cajas.length - 1];
            for (int i = 0, j = 0; i < cajas.length; i++) {
                if (i != index) {
                    nuevaCaja[j++] = cajas[i];
                }
            }
            cajas = nuevaCaja;
        }
    }
    public int contarCajas() {
        return cajas.length;
    }


    @Override
    public int compareTo(CamionCajas o) {
        if (this.contarCajas() < o.contarCajas()) {
            return -1;
        } else if (this.contarCajas() > o.contarCajas()) {
            return 1;
        } else {
            return 0;
        }
    }
}
