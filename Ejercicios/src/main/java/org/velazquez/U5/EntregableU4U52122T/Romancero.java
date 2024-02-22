package org.velazquez.U5.EntregableU4U52122T;

public class Romancero extends Agrupacion implements Callejera, Comparable<Romancero> {
    private String nombre_romancero;
    private String autor_romancero;
    private String autorMusica_romancero;
    private String autorLetras_romancero;
    private String tipoDisfraz_romancero;
    private String tematicaCartelon_romancero;

    public Romancero(String nombre_romancero, String autor_romancero, String autorMusica_romancero, String autorLetras_romancero, String tipoDisfraz_romancero, String tematicaCartelon_romancero) {
        this.nombre_romancero = nombre_romancero;
        this.autor_romancero = autor_romancero;
        this.autorMusica_romancero = autorMusica_romancero;
        this.autorLetras_romancero = autorLetras_romancero;
        this.tipoDisfraz_romancero = tipoDisfraz_romancero;
        this.tematicaCartelon_romancero = tematicaCartelon_romancero;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero "+nombre_romancero);
    }
    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero "+nombre_romancero+" va de "+tipoDisfraz_romancero);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero "+nombre_romancero);
    }

    @Override
    public int compareTo(Romancero o) {
        return this.nombre_romancero.compareTo(o.nombre_romancero);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "nombre_romancero='" + nombre_romancero + '\'' +
                ", autor_romancero='" + autor_romancero + '\'' +
                ", autorMusica_romancero='" + autorMusica_romancero + '\'' +
                ", autorLetras_romancero='" + autorLetras_romancero + '\'' +
                ", tipoDisfraz_romancero='" + tipoDisfraz_romancero + '\'' +
                ", tematicaCartelon_romancero='" + tematicaCartelon_romancero + '\'' +
                '}';
    }
}
