package org.velazquez.U5.EntregableU4U5;

public class PeladoDeGambas extends Deportes{

    private int num_puestos;

    public PeladoDeGambas(DEPORTES nombre_deporte, String nombre_pabellon, int num_puestos) {
        super(nombre_deporte, nombre_pabellon);
        this.num_puestos = num_puestos;
    }
}
