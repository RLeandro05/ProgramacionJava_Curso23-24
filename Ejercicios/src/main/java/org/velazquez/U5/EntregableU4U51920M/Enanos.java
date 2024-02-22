package org.velazquez.U5.EntregableU4U51920M;

public class Enanos extends Personajes implements Atacar{
    private float altura;
    public Enanos(String nombre, int energia, int ataque, int defensa, boolean encantado, float altura) {
        super(nombre, energia, ataque, defensa, encantado);
        this.altura = altura;
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - EMPUJANDO");

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
        return "Enanos{" +
                "altura=" + altura +
                super.toString() +
                '}';
    }


}
