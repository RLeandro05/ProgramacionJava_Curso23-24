package org.velazquez.U5.ExamenU4U5;

public class Serie extends Multimedia implements Reproducible{
    private String creadorSerie;
    private int numTemporadas;
    String[] capitulos = new String[0];

    //Constructor
    public Serie(String titulo, int anioPublicacionEstreno, String creadorSerie, int numTemporadas) {
        super(titulo, anioPublicacionEstreno);
        this.creadorSerie = creadorSerie;
        this.numTemporadas = numTemporadas;
    }

    public String getCreadorSerie() {
        return creadorSerie;
    }

    public void setCreadorSerie(String creadorSerie) {
        this.creadorSerie = creadorSerie;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    //Método para añadir capítulos a la lista de cadenas de caracteres un nuevo capítulo a la serie
    public void addCapitulo(String capitulo) {

        String[] nuevoCapitulo = new String[capitulos.length+1];

        //Buscamos un nuevo hueco en la lista
        for (int i = 0; i < capitulos.length; i++) {
            nuevoCapitulo[i] = capitulos[i];
        }

        //Una vez hecho, implementamos el valor del capítulo en su nuevo hueco
        nuevoCapitulo[capitulos.length] = capitulo;
        capitulos = nuevoCapitulo;
    }

    //Método para eliminar capítulos en la serie
    public boolean eliminarCapitulo(String capitulo) {
        int index = -1;
        //Buscamos primero en la lista si existe el valor que queremos eliminar
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i].equals(capitulo)) {
                index = i;
                break;
            }
        }

        //Si se encuentra, entramos en el siguiente for, el cual se encargará de eliminar el valor de dicho hueco correspondiente
        if (index != -1) {
            String[] nuevoCapitulo = new String[capitulos.length - 1];
            for (int i = 0, j = 0; i < capitulos.length; i++) {
                if (i != index) {
                    nuevoCapitulo[j++] = capitulos[i];
                }
            }
            capitulos = nuevoCapitulo;

            return true;
        }

        return false;
    }

    //Implementamos el método abstracto para dar por finalizada la serie
    @Override
    public void dar_por_finalizado() {
        System.out.println("Finalizado: "+getTitulo());
    }

    //Implementamos los métodos de la interaz para realizar las diversas acciones según nos convenga. Además, se realizará de manera aleatoria la acción de la serie
    @Override
    public void play() {
        int numMin = 0;
        int numMax = capitulos.length;
        int numAleatorio = (int) (Math.random()*((numMax+1)-numMin))+numMin;

        System.out.println("Reproduciendo serie: "+getTitulo()+", capítulo: "+capitulos[numAleatorio]);
    }

    @Override
    public void pause() {
        int numMin = 0;
        int numMax = capitulos.length;
        int numAleatorio = (int) (Math.random()*((numMax+1)-numMin))+numMin;

        System.out.println("Pausando serie: "+getTitulo()+", capítulo: "+capitulos[numAleatorio]);
    }

    @Override
    public void stop() {
        int numMin = 0;
        int numMax = capitulos.length;
        int numAleatorio = (int) (Math.random()*((numMax+1)-numMin))+numMin;

        System.out.println("Parando serie: "+getTitulo()+", capítulo: "+capitulos[numAleatorio]);
    }

    //Método toString para mostrar por pantalla los valores resultantes
    @Override
    public String toString() {
        return "Serie{" +
                "creadorSerie='" + creadorSerie + '\'' +
                ", numTemporadas=" + numTemporadas +
                super.toString() +
                '}';
    }
}
