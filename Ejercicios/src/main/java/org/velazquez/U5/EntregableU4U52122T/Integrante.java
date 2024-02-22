package org.velazquez.U5.EntregableU4U52122T;

public class Integrante {
    private int numParticipante;
    private String nombre_participante;
    private int edad_participante;
    private String localidad_participante;

    public Integrante(int numParticipante, String nombre_participante, int edad_participante, String localidad_participante) {
        this.numParticipante = numParticipante;
        this.nombre_participante = nombre_participante;
        this.edad_participante = edad_participante;
        this.localidad_participante = localidad_participante;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numParticipante=" + numParticipante +
                ", nombre_participante='" + nombre_participante + '\'' +
                ", edad_participante=" + edad_participante +
                ", localidad_participante='" + localidad_participante + '\'' +
                '}';
    }
}
