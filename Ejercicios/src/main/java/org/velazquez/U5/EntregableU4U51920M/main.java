package org.velazquez.U5.EntregableU4U51920M;

public class main {
    public static void main(String[] args) {

        RPG rpg = new RPG();
        Personajes p1 = new Elfos("Maglo", 87, 64, 30, true, Elfos.TIPO.BOSQUE);
        Personajes p2 = new Elfos("Lotup", 0, 23, 92, false, Elfos.TIPO.BOSQUE);

        rpg.addPersonaje(p1);
        rpg.addPersonaje(p2);

        rpg.borrarMuertos(p1);
        rpg.mostrarEstado();
    }
}
