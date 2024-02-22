package org.velazquez.U5.EntregableU4U51920M;

public class Guerreros extends Hombres implements Atacar{
    private int edad;
    public Guerreros(String nombre, int energia, int ataque, int defensa, boolean encantado, int edad) {
        super(nombre, energia, ataque, defensa, encantado);
        this.edad = edad;
    }

    @Override
    public void atacarPersonaje(Personajes personaje) {
        System.out.println(nombre + " - ATACANDO");

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
        return "Guerreros{" +
                "edad=" + edad +
                super.toString() +
                '}';
    }


}
