package org.velazquez.U5.EntregableU4U5;

public class Baloncestitas extends Participante implements Comparable <Baloncestitas>{
    private double estatura;
    public Baloncestitas(String nombre_participante, int edad_participante) {
        super(nombre_participante, edad_participante);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo XXXXX, como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    public void encestar() {
        System.out.println("2 puntos!!");
    }

    @Override
    public int compareTo(Baloncestitas o) {
        if (this.estatura < o.estatura) {
            return -1;
        } else if (this.estatura > o.estatura) {
            return 1;
        }

        return 0;
    }
}
