package org.velazquez.U4.EntregableU4_Corregido;

import java.util.Arrays;

public class Concierto {
    private String nombre_concierto;
    private String fecha_concierto;
    private Escenario lista_escenarios[];
    private static String nombre_organizador = "Pepe Orihuela";

    public static String getNombre_organizador() {
        return nombre_organizador;
    }

    public static void setNombre_organizador(String nombre_organizador) {
        Concierto.nombre_organizador = nombre_organizador;
    }

    public String getNombre_concierto() {
        return nombre_concierto;
    }

    public void setNombre_concierto(String nombre_concierto) {
        this.nombre_concierto = nombre_concierto;
    }

    public String getFecha_concierto() {
        return fecha_concierto;
    }

    public void setFecha_concierto(String fecha_concierto) {
        this.fecha_concierto = fecha_concierto;
    }

    public Escenario[] getLista_escenarios() {
        return lista_escenarios;
    }

    public void setLista_escenarios(Escenario[] lista_escenarios) {
        this.lista_escenarios = lista_escenarios;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "nombre_concierto='" + nombre_concierto + '\'' +
                ", fecha_concierto='" + fecha_concierto + '\'' +
                ", lista_escenarios=" + Arrays.toString(lista_escenarios) +
                '}';
    }
}
