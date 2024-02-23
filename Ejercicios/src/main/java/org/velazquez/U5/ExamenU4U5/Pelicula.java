package org.velazquez.U5.ExamenU4U5;

public class Pelicula extends Multimedia implements Reproducible{
    private String director_a;
    private int duracion;
    private String productora;
    private String pais;

    //Constructor
    public Pelicula(String titulo, int anioPublicacionEstreno, String director_a, int duracion, String productora, String pais) {
        super(titulo, anioPublicacionEstreno);
        this.director_a = director_a;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    public String getDirector_a() {
        return director_a;
    }

    public void setDirector_a(String director_a) {
        this.director_a = director_a;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Implementamos el método abstracto para dar por finalizada la película
    @Override
    public void dar_por_finalizado() {
        System.out.println("Finalizado: "+getTitulo());
    }

    //Implementamos de la interfaz los tres métodos para indicar las acciones que realizamos en la película según nos convenga
    @Override
    public void play() {
        System.out.println("Reproduciendo película: "+getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando película: "+getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando película: "+getTitulo());
    }

    //Método toString para mostrar por pantalla los valores resultantes
    @Override
    public String toString() {
        return "Pelicula{" +
                "director_a='" + director_a + '\'' +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                super.toString() +
                '}';
    }
}
