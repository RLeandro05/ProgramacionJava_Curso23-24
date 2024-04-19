package org.velazquez.U7.Tarea5;

import java.io.Serializable;

public class Aspirante implements Serializable {

    // Definimos los atributos
    private int idAspirante; // reamos un id para usarlo como único de cada aspirante
    private static int idAspiranteincrementa = 1; // Creamos un atributo static para incrementar el id único de cada aspirante
    private String nombreAspirante;
    private String dniAspirante;
    private int telAspirante;

    // Creamos un constructor para poder crear nuevos Aspirantes
    public Aspirante(String nombreAspirante, String dniAspirante, int telAspirante) {
        this.idAspirante = idAspiranteincrementa++;
        this.nombreAspirante = nombreAspirante;
        this.dniAspirante = dniAspirante;
        this.telAspirante = telAspirante;
    }

    public int getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(int idAspirante) {
        this.idAspirante = idAspirante;
    }

    public static int getIdAspiranteincrementa() {
        return idAspiranteincrementa;
    }

    public static void setIdAspiranteincrementa(int idAspiranteincrementa) {
        Aspirante.idAspiranteincrementa = idAspiranteincrementa;
    }

    public String getNombreAspirante() {
        return nombreAspirante;
    }

    public void setNombreAspirante(String nombreAspirante) {
        this.nombreAspirante = nombreAspirante;
    }

    public String getDniAspirante() {
        return dniAspirante;
    }

    public void setDniAspirante(String dniAspirante) {
        this.dniAspirante = dniAspirante;
    }

    public int getTelAspirante() {
        return telAspirante;
    }

    public void setTelAspirante(int telAspirante) {
        this.telAspirante = telAspirante;
    }

    // Método toString() para poder mostrar la información del objeto Aspirante por pantalla
    @Override
    public String toString() {
        return "Aspirante{" +
                "nombreAspirante='" + nombreAspirante + '\'' +
                ", dniAspirante='" + dniAspirante + '\'' +
                ", telAspirante=" + telAspirante +
                '}';
    }
}
