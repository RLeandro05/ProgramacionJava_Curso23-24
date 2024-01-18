package org.velazquez.U4.Tarea1.Ejercicio9.Maquinaria;

class Vagones {
    private final int capacidad_max;
    private int carga;
    private String tipo_carga;

    public Vagones(int carga, String tipo_carga) {
        this.capacidad_max = 1000;
        this.carga = carga;
        this.tipo_carga = tipo_carga;
    }

    @Override
    public String toString() {
        return "Vagones{" +
                "capacidad_max=" + capacidad_max +
                ", carga=" + carga +
                ", tipo_carga='" + tipo_carga + '\'' +
                '}';
    }
}
