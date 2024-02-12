package org.velazquez.U5.Tarea1.Ej1234.Ejercicio1;

public class Hora {
    private int hora;
    private int minutos;

    /*Creamos constructor con parámetros que se escriben desde el main*/
    public Hora(int hora, int minutos) {
        setHora(hora);
        setMinutos(minutos);
    }


    /*Creamos un método el cual incrementará en 1 el minuto. Si se pasa, sumamos una hora
    y reseteamos los minutos*/
    public void inc() {
        if (minutos +1 < 60) {
            minutos++;
        } else {
            if (hora + 1 < 24) {
                hora++;
            } else {
                hora = 0;
            }
            minutos = 0;
        }
    }

    /*Creamos un método para aplicar un valor a los minutos del reloj*/
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }

    /**/
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minutos;
    }
}
