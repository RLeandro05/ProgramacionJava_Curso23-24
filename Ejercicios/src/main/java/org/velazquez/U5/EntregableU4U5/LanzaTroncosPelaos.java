package org.velazquez.U5.EntregableU4U5;

public class LanzaTroncosPelaos extends Deportes{

    private int num_pruebas;

    public LanzaTroncosPelaos(DEPORTES nombre_deporte, String nombre_pabellon, int num_pruebas) {
        super(nombre_deporte, nombre_pabellon);
        this.num_pruebas = num_pruebas;
    }
}
