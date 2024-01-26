package org.velazquez.U4.EntregableU4.Festival;

public class Cancion {

    private String titulo;
    private int duracion;
    private String genero;
    private Cantante cantante;

    public Cancion(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.cantante = new Cantante("Benito Antonio", "Bad Bunny", 29, "Almirante Sur, Puerto Rico");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                '}';
    }
}
