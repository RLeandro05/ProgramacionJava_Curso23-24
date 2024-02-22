package org.velazquez.U5.EntregableU4U51920M;

public class Magos extends Hombres implements Magia{
    private float longitud_barba;
    public Magos(String nombre, int energia, int ataque, int defensa, boolean encantado, float longitud_barba) {
        super(nombre, energia, ataque, defensa, encantado);
        this.longitud_barba = longitud_barba;
    }

    @Override
    public void Encantar(Personajes personaje) {
        if (!encantado) {
            encantado = true;
        }
    }

    @Override
    public void Desencantar(Personajes personaje) {
        if (encantado) {
            encantado = false;
        }
    }

    @Override
    public String toString() {
        return "Magos{" +
                "longitud_barba=" + longitud_barba +
                super.toString() +
                '}';
    }
}
