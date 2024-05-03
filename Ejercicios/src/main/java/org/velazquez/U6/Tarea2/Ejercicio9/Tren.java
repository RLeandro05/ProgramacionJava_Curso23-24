package org.velazquez.U6.Tarea2.Ejercicio9;

import java.io.Serializable;

public class Tren implements Serializable {

    private int vagones;
    private int numTren;
    private String empresa;

    public Tren(int vagones, int numTren, String empresa) {
        this.vagones = vagones;
        this.numTren = numTren;
        this.empresa = empresa;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public int getNumTren() {
        return numTren;
    }

    public void setNumTren(int numTren) {
        this.numTren = numTren;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "vagones=" + vagones +
                ", numTren=" + numTren +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
