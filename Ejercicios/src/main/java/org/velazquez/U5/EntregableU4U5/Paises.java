package org.velazquez.U5.EntregableU4U5;

public class Paises implements Comparable <Paises>{

    protected String nombre_pais;
    private int num_participantes;

    public Paises(String nombre_pais, int num_participantes) {
        this.nombre_pais = nombre_pais;
        this.num_participantes = num_participantes;
    }

    @Override
    public int compareTo(Paises pais) {
        if (this.num_participantes < pais.num_participantes) {
            return -1;
        } else if (this.num_participantes > pais.num_participantes) {
            return 1;
        }
        return 0;
    }
}
