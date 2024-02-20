package org.velazquez.U5.EntregableU4U52122M;

public class Persona {
    private String NIF;
    private String nombre_completo;

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Persona(String NIF, String nombre_completo) {
        this.NIF = NIF;
        this.nombre_completo = nombre_completo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "NIF='" + NIF + '\'' +
                ", nombre_completo='" + nombre_completo + '\'' +
                '}';
    }
}
