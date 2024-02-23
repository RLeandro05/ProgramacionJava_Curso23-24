package org.velazquez.U5.ExamenU4U5;

public abstract class Multimedia {
    private String titulo;
    private int anioPublicacionEstreno;
    protected static int id;

    //Constructor
    public Multimedia(String titulo, int anioPublicacionEstreno) {
        this.titulo = titulo;
        this.anioPublicacionEstreno = anioPublicacionEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacionEstreno() {
        return anioPublicacionEstreno;
    }

    public void setAnioPublicacionEstreno(int anioPublicacionEstreno) {
        this.anioPublicacionEstreno = anioPublicacionEstreno;
    }
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Multimedia.id = id;
    }

    //Creamos el método abstracto para implementar en clases hijas
    public abstract void dar_por_finalizado();

    //Método toString para mostrar por pantalla los valores resultantes
    @Override
    public String toString() {
        return ", titulo='" + titulo + '\'' +
                ", anioPublicacionEstreno=" + anioPublicacionEstreno +
                '}';
    }
}
