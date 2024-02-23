package org.velazquez.U5.ExamenU4U5;

public class Libro extends Multimedia{
    private String autor;
    private String editorial;
    private long ISBN;
    private int numPaginas;

    //Constructor
    public Libro(String titulo, int anioPublicacionEstreno, String autor, String editorial, long ISBN, int numPaginas) {
        super(titulo, anioPublicacionEstreno);
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //Implementamos el método abstracto para dar por finalizado el libro
    @Override
    public void dar_por_finalizado() {
        System.out.println("Finalizado: "+getTitulo());
    }

    //Método toString para mostrar en pantalla los valores resultantes
    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", ISBN=" + ISBN +
                ", numPaginas=" + numPaginas +
                super.toString() +
                '}';
    }
}
