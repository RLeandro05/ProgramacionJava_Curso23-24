package org.velazquez.U5.EntregableU4U5;

public abstract class Participante {

    protected String nombre_participante;
    private int edad_participante;

    public abstract void hacer_juramento();

    public Participante(String nombre_participante, int edad_participante) {
        this.nombre_participante = nombre_participante;
        this.edad_participante = edad_participante;
    }
}
