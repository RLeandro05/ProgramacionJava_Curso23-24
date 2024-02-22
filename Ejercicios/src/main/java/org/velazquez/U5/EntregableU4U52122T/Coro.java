package org.velazquez.U5.EntregableU4U52122T;

public class Coro extends AgrupacionOficial implements Comparable<Coro> {
    private String autorMusica_coro;
    private String autorLetras_coro;
    private String tipoDisfraz_coro;
    private int numBandurrias_coro;
    private int numGuitarras_coro;

    public Coro(int puntos_obtenidos, String nombre, String autor, String autorMusica_coro, String autorLetras_coro, String tipoDisfraz_coro, int numBandurrias_coro, int numGuitarras_coro) {
        super(puntos_obtenidos, nombre, autor);
        this.autorMusica_coro = autorMusica_coro;
        this.autorLetras_coro = autorLetras_coro;
        this.tipoDisfraz_coro = tipoDisfraz_coro;
        this.numBandurrias_coro = numBandurrias_coro;
        this.numGuitarras_coro = numGuitarras_coro;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro "+nombre);
    }
    @Override
    public void hacer_tipo() {
        System.out.println("El Coro "+nombre+" va de "+tipoDisfraz_coro);
    }
    @Override
    public void caminito_del_falla() {
        System.out.println("El Coro "+nombre+" va caminito del falla");
    }

    @Override
    public int compareTo(Coro o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Coro{" +
                "autorMusica_coro='" + autorMusica_coro + '\'' +
                ", autorLetras_coro='" + autorLetras_coro + '\'' +
                ", tipoDisfraz_coro='" + tipoDisfraz_coro + '\'' +
                ", numBandurrias_coro=" + numBandurrias_coro +
                ", numGuitarras_coro=" + numGuitarras_coro +
                super.toString() +
                '}';
    }
}
