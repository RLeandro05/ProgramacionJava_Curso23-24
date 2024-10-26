package org.velazquez.U4.EntregableU4_Corregido;

public class Cancion {
    private String titulo_cancion;
    private int duracion_cancion;
    private Generos genero;
    private Cantante autor;

    public Cancion(String titulo_cancion, int duracion_cancion, Generos genero) {
        this.titulo_cancion = titulo_cancion;
        this.duracion_cancion = duracion_cancion;
        this.genero = genero;
    }

    public String getTitulo_cancion() {
        return titulo_cancion;
    }

    public void setTitulo_cancion(String titulo_cancion) {
        this.titulo_cancion = titulo_cancion;
    }

    public int getDuracion_cancion() {
        return duracion_cancion;
    }

    public void setDuracion_cancion(int duracion_cancion) {
        this.duracion_cancion = duracion_cancion;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public Cantante getAutor() {
        return autor;
    }

    public void setAutor(Cantante autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo_cancion='" + titulo_cancion + '\'' +
                ", duracion_cancion=" + duracion_cancion +
                ", genero=" + genero;
    }
}
