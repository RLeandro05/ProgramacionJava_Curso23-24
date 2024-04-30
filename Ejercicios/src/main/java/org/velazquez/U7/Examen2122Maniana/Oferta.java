package org.velazquez.U7.Examen2122Maniana;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Oferta implements Serializable {

    private int codigoOferta;
    private static int incrementaCodigoOferta = 1;
    private String descripcionOferta;
    private List<Trabajadores> listaTrabajadoresporOferta = new ArrayList<>();
    private boolean cubiertaOferta;

    public Oferta(String descripcionOferta, List<Trabajadores> listaTrabajadoresporOferta, boolean cubiertaOferta) {
        this.codigoOferta = incrementaCodigoOferta++;
        this.descripcionOferta = descripcionOferta;
        this.listaTrabajadoresporOferta = listaTrabajadoresporOferta;
        this.cubiertaOferta = cubiertaOferta;
    }

    public int getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(int codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public String getDescripcionOferta() {
        return descripcionOferta;
    }

    public void setDescripcionOferta(String descripcionOferta) {
        this.descripcionOferta = descripcionOferta;
    }

    public List<Trabajadores> getListaTrabajadoresporOferta() {
        return listaTrabajadoresporOferta;
    }

    public void setListaTrabajadoresporOferta(List<Trabajadores> listaTrabajadoresporOferta) {
        this.listaTrabajadoresporOferta = listaTrabajadoresporOferta;
    }

    public boolean isCubiertaOferta() {
        return cubiertaOferta;
    }

    public void setCubiertaOferta(boolean cubiertaOferta) {
        this.cubiertaOferta = cubiertaOferta;
    }

    public void EliminarRepetidosyOrdenar(int codigoOferta, List<Trabajadores> listaTrabajadoresporOferta) {

        List<Trabajadores> listaTrabajadoresSinRepetir = new ArrayList<>();

        listaTrabajadoresSinRepetir = listaTrabajadoresporOferta.stream().
                                        distinct().collect(Collectors.toList());

        listaTrabajadoresSinRepetir.sort(new OrdenarTrabajadoresPorApellidos());

        System.out.println("Lista de trabajadores sin repetir de la oferta con código '"+codigoOferta+"': ");
        System.out.println(listaTrabajadoresSinRepetir);
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "codigoOferta=" + codigoOferta +
                ", descripcionOferta='" + descripcionOferta + '\'' +
                ", listaTrabajadoresporOferta=" + listaTrabajadoresporOferta +
                ", cubiertaOferta=" + cubiertaOferta +
                '}';
    }
}
