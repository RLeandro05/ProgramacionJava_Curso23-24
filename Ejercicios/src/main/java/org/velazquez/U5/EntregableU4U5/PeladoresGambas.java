package org.velazquez.U5.EntregableU4U5;

public class PeladoresGambas extends Participante{

    private int peso_categoria;
    public PeladoresGambas(String nombre_participante, int edad_participante) {
        super(nombre_participante, edad_participante);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo XXXXX, como pelador, juro los valores deportivos mundiales");
    }

    public void pelar() {
        System.out.println("Voy a pelar mis gambas");
    }
}
