package org.velazquez.U5.EntregableU4U5;

public class LanzadoresTroncos extends Participante{

    public enum PRUEBA {
        PINO, ROBLE, OLIVO
    };
    private PRUEBA nombre_prueba;

    public LanzadoresTroncos(String nombre_participante, int edad_participante) {
        super(nombre_participante, edad_participante);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo XXXXX, como lanzador, juro los valores deportivos mundiales");
    }

    public void lanzar() {
        System.out.println("Voy a lanzar");
    }
}
