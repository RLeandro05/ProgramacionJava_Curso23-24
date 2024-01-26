package org.velazquez.U4.EntregableU4.Festival;

public class Cantante {

    private String nombre_real;
    private String nombre_artistico;
    private int edad;
    private String ciudad_origen;
    private Cancion cancion1;
    private Cancion cancion2;

    public Cantante(String nombre_real, String nombre_artistico, int edad, String ciudad_origen) {
        this.nombre_real = nombre_real;
        this.nombre_artistico = nombre_artistico;
        this.edad = edad;
        this.ciudad_origen = ciudad_origen;
        this.cancion1 = new Cancion("Bufarracas", 3, "Trap");
        this.cancion2 = new Cancion("Emos always", 5, "Emorap");
    }

    public String getNombre_real() {
        return nombre_real;
    }

    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }

    public String getNombre_artistico() {
        return nombre_artistico;
    }

    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }
}
