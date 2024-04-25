package org.velazquez.U7.Tarea7.Ejercicio7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio {

    private String dniSocio;
    private String nombreSocio;
    private LocalDate fechaNacimientoSocio;
    private LocalDate fechaAltaSocio;
    private int cuotaSocio;
    private int numFamiliaresSocio;

    // Constructor que usa TODOS los atributos de la clase
    public Socio(String dniSocio, String nombreSocio, LocalDate fechaNacimientoSocio, LocalDate fechaAltaSocio, int cuotaSocio, int numFamiliaresSocio) {
        this.dniSocio = dniSocio;
        this.nombreSocio = nombreSocio;
        this.fechaNacimientoSocio = fechaNacimientoSocio;
        this.fechaAltaSocio = fechaAltaSocio;
        this.cuotaSocio = cuotaSocio;
        this.numFamiliaresSocio = numFamiliaresSocio;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public LocalDate getFechaNacimientoSocio() {
        return fechaNacimientoSocio;
    }

    public void setFechaNacimientoSocio(LocalDate fechaNacimientoSocio) {
        this.fechaNacimientoSocio = fechaNacimientoSocio;
    }

    public LocalDate getFechaAltaSocio() {
        return fechaAltaSocio;
    }

    public void setFechaAltaSocio(LocalDate fechaAltaSocio) {
        this.fechaAltaSocio = fechaAltaSocio;
    }

    public int getCuotaSocio() {
        return cuotaSocio;
    }

    public void setCuotaSocio(int cuotaSocio) {
        this.cuotaSocio = cuotaSocio;
    }

    public int getNumFamiliaresSocio() {
        return numFamiliaresSocio;
    }

    public void setNumFamiliaresSocio(int numFamiliaresSocio) {
        this.numFamiliaresSocio = numFamiliaresSocio;
    }

    @Override
    public boolean equals(Object o) { // Implementación del equals() para comaprar únicamente los DNIs de la lista de los socios
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(dniSocio, socio.dniSocio);
    }

    // Implementación de compareTo() para tener una segunda opción de comparación de DNIs de los socios
    public int compareTo(String dniSocio) {
        return this.getDniSocio().compareTo(dniSocio);
    }

    public int edad(Socio socio) {

        int edad = socio.getFechaAltaSocio().getYear() - socio.getFechaNacimientoSocio().getYear();

        return edad;
    }

    public long antiguedad (Socio socio) {

        long antiguedad = ChronoUnit.MONTHS.between(socio.getFechaNacimientoSocio(), socio.getFechaAltaSocio());

        return antiguedad;
    }

    @Override
    public String toString() { // Implementación de toString() para mostrar por pantalla los valores de los atributos asociados a cada socio de la lista creada
        return "Socio{" +
                "dniSocio='" + dniSocio + '\'' +
                ", nombreSocio='" + nombreSocio + '\'' +
                ", fechaNacimientoSocio=" + fechaNacimientoSocio +
                ", fechaAltaSocio=" + fechaAltaSocio +
                ", cuotaSocio=" + cuotaSocio +
                ", numFamiliaresSocio=" + numFamiliaresSocio +
                '}';
    }
}
