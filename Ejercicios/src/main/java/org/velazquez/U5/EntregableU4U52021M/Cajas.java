package org.velazquez.U5.EntregableU4U52021M;

public class Cajas{
    Prendas[] prendas = new Prendas[0];

    public void addPrenda(Prendas prenda) {
        if (prendas.length <= 5) {
            Prendas[] nuevaPrenda = new Prendas[prendas.length+1];

            for (int i = 0; i < prendas.length; i++) {
                nuevaPrenda[i] = prendas[i];
            }

            nuevaPrenda[prendas.length] = prenda;
            prendas = nuevaPrenda;
        }
    }
    public void eliminarPrenda(Prendas prenda) {
        int index = -1;
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i].equals(prenda)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Prendas[] nuevaPrenda = new Prendas[prendas.length - 1];
            for (int i = 0, j = 0; i < prendas.length; i++) {
                if (i != index) {
                    nuevaPrenda[j++] = prendas[i];
                }
            }
            prendas = nuevaPrenda;
        }
    }
    public int contarPrendas() {
        return prendas.length;
    }
}
