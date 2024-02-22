package org.velazquez.U5.EntregableU4U51920M;

public class Elfos extends Personajes implements Atacar{

    public enum TIPO {
        BOSQUE, COSTA
    }
    private TIPO tipo;
    public Elfos(String nombre, int energia, int ataque, int defensa, boolean encantado, TIPO tipo) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tipo = tipo;
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - DISPARANDO");

        int energia_faltante = 0;

        if (this.getClass() == personaje.getClass()) {
            System.out.println("NO HAY DAÑO");
        } else {
            if (personaje.encantado) {
                energia_faltante = personaje.energia - ((personaje.ataque- personaje.defensa)*2);
            } else {
                energia_faltante = personaje.energia - (personaje.ataque- personaje.defensa);
            }

            personaje.energia = energia_faltante;
        }
    }

    @Override
    public String toString() {
        return "Elfos{" +
                "tipo=" + tipo +
                super.toString() +
                '}';
    }
}
