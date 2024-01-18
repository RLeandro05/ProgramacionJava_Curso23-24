package org.velazquez.U4.Tarea1.Ejercicio8;

public class Principal {
    public static void main(String[] args) {

        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();

        b1.mostrarEstado(true);
        b2.mostrarEstado(false);
        b3.mostrarEstado(true);

        System.out.println();

        b1.mostrarEstado(true);
        b2.mostrarEstado(false);
        b3.mostrarEstado(false);

        Bombilla.apagon();
        System.out.println();

        b1.mostrarEstado(true);
        b2.mostrarEstado(false);
        b3.mostrarEstado(false);

        Bombilla.apagon();
        System.out.println();

        b1.mostrarEstado(true);
        b2.mostrarEstado(false);
        b3.mostrarEstado(false);

    }
}
