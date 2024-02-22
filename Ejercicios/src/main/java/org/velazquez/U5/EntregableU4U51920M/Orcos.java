package org.velazquez.U5.EntregableU4U51920M;

public class Orcos extends Personajes implements Atacar{
    private int tonelaje;


    public Orcos(String nombre, int energia, int ataque, int defensa, boolean encantado, int tonelaje) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tonelaje = tonelaje;
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - DESTRUYENDO");

        int energia_faltante = 0;

        if (this.getClass() == personaje.getClass()) {
            System.out.println("NO HAY DAÑO");
        } else {
            if (personaje.encantado) {
                energia_faltante = personaje.energia - ((personaje.ataque- personaje.defensa)*2);
            } else {
                energia_faltante = personaje.energia - (personaje.ataque- personaje.defensa);
            }
        }

        personaje.energia = energia_faltante;
    }

    @Override
    public String toString() {
        return "Orcos{" +
                "tonelaje=" + tonelaje +
                super.toString() +
                '}';
    }
}
