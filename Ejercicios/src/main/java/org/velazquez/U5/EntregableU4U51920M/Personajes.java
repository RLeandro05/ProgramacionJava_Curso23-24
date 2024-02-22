package org.velazquez.U5.EntregableU4U51920M;

public abstract class Personajes {
    protected String nombre;
    protected int energia; //0-1000
    protected int ataque; //0-100
    protected int defensa; //0-100
    protected boolean encantado; //true-false

    public Personajes(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.encantado = encantado;
    }

    @Override
    public String toString() {
        return ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}