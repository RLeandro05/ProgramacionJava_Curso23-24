package org.velazquez.U5.Tarea1.Ej1234.Ejercicio2;

import org.velazquez.U5.Tarea1.Ej1234.Ejercicio1.Hora;

public class Hora12 extends Hora {

    public enum Mediodia {
        AM, PM
    }
    private Mediodia mediodia;

    /*En este constructor, incluímos los datos de los atributos de la otra clase en esta con "super"*/
    public Hora12 (int hora, int minutos) {
        super(hora, minutos);
    }

    public void setMediodia(Mediodia mediodia) {
        this.mediodia = mediodia;
    }

    public Mediodia getMediodia() {
        return mediodia;
    }

    public void sethora(int hora) {
        if (hora < 12) {
            super.setHora(hora);
            setMediodia(Mediodia.AM);
        } else if (hora > 12 && hora < 24) {
            super.setHora(hora-12);
            setMediodia(Mediodia.PM);
        }
    }


}
