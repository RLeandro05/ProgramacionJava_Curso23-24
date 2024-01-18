package org.velazquez.U4.Tarea1.Ejercicio9.Maquinaria;

import org.velazquez.U4.Tarea1.Ejercicio9.Personal.Maquinistas;

public class Trenes {

    public Locomotoras locomotora;
    public Vagones vagon1;
    public Vagones vagon2;
    public Maquinistas maquinista;

    public Trenes() {
        this.locomotora = new Locomotoras("7899 FLP", 400, 1989);
        this.vagon1 = new Vagones(200, "Carbón");
        this.vagon2 = new Vagones(450, "Hierro");
        this.maquinista = new Maquinistas("Alfonso Martínez Pérez", "78997766P", "Jefe de Maquinistas");
    }

    @Override
    public String toString() {
        return "Trenes{" +
                "locomotora=" + locomotora +
                ", vagon1=" + vagon1 +
                ", vagon2=" + vagon2 +
                '}';
    }
}
