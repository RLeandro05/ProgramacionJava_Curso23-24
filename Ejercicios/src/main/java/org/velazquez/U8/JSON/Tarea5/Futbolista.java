package org.velazquez.U8.JSON.Tarea5;

import java.util.ArrayList;
import java.util.List;

public class Futbolista {

    private int dorsalFutbolista;
    private String nombreFutbolista;
    private List<String> listaDermacaciones = new ArrayList<>();
    private String equipoFutbolista;

    public Futbolista(int dorsalFutbolista, String nombreFutbolista, List<String> listaDermacaciones, String equipoFutbolista) {
        this.dorsalFutbolista = dorsalFutbolista;
        this.nombreFutbolista = nombreFutbolista;
        this.listaDermacaciones = listaDermacaciones;
        this.equipoFutbolista = equipoFutbolista;
    }

    public int getDorsalFutbolista() {
        return dorsalFutbolista;
    }

    public void setDorsalFutbolista(int dorsalFutbolista) {
        this.dorsalFutbolista = dorsalFutbolista;
    }

    public String getNombreFutbolista() {
        return nombreFutbolista;
    }

    public void setNombreFutbolista(String nombreFutbolista) {
        this.nombreFutbolista = nombreFutbolista;
    }

    public List<String> getListaDermacaciones() {
        return listaDermacaciones;
    }

    public void setListaDermacaciones(List<String> listaDermacaciones) {
        this.listaDermacaciones = listaDermacaciones;
    }

    public String getEquipoFutbolista() {
        return equipoFutbolista;
    }

    public void setEquipoFutbolista(String equipoFutbolista) {
        this.equipoFutbolista = equipoFutbolista;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsalFutbolista=" + dorsalFutbolista +
                ", nombreFutbolista='" + nombreFutbolista + '\'' +
                ", listaDermacaciones=" + listaDermacaciones +
                ", equipoFutbolista='" + equipoFutbolista + '\'' +
                '}';
    }
}
