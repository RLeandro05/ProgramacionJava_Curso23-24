package org.velazquez.U4.Tarea1.Ejercicio10;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    private int n;

    public int getHora(int hora) {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto(int minuto) {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo(int segundo) {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    public int getN(int n) {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public void nuevaHora() {
        if (n+segundo >= 60) {
            minuto = minuto+1;
            segundo = n-segundo;

        }

        if (minuto == 60) {
            hora = hora+1;
            minuto = 0;
        }

        if (hora == 24) {
            segundo = 0;
            minuto = 0;
            hora = 0;
        }
    }

    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }
}
