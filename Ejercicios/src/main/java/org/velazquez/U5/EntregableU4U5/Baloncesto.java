package org.velazquez.U5.EntregableU4U5;

public class Baloncesto extends Deportes{

    private int num_equipos;

    public Baloncesto(DEPORTES nombre_deporte, String nombre_pabellon, int num_equipos) {
        super(nombre_deporte, nombre_pabellon);
        this.num_equipos = num_equipos;
    }
}
