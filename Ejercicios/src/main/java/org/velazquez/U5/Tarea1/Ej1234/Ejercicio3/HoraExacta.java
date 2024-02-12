package org.velazquez.U5.Tarea1.Ej1234.Ejercicio3;

import org.velazquez.U5.Tarea1.Ej1234.Ejercicio1.Hora;

public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundos(segundos);
    }

    /*Método para introducir un valor a los segundos*/
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }

    /*Método para incrementar en 1 los segundos de la hora*/
    public void inc() {
        if (segundos + 1 < 60) {
            segundos++;
        } else {
            super.inc();
        }
    }
}
