package org.velazquez.U5.EntregableU4U52122T;

public class Cuarteto extends AgrupacionOficial implements Callejera, Comparable<Cuarteto> {
    private String autorMusica_cuarteto;
    private String autorLetras_cuarteto;
    private String tipoDisfraz_cuarteto;
    private int numMiembros_cuarteto;

    public Cuarteto(int puntos_obtenidos, String nombre, String autor, String autorMusica_cuarteto, String autorLetras_cuarteto, String tipoDisfraz_cuarteto, int numMiembros_cuarteto) {
        super(puntos_obtenidos, nombre, autor);
        this.autorMusica_cuarteto = autorMusica_cuarteto;
        this.autorLetras_cuarteto = autorLetras_cuarteto;
        this.tipoDisfraz_cuarteto = tipoDisfraz_cuarteto;
        this.numMiembros_cuarteto = numMiembros_cuarteto;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto "+nombre);
    }
    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto "+nombre+" va de "+tipoDisfraz_cuarteto);
    }
    @Override
    public void caminito_del_falla() {
        System.out.println("El Cuarteto "+nombre+" va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto "+nombre);
    }

    @Override
    public int compareTo(Cuarteto o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "autorMusica_cuarteto='" + autorMusica_cuarteto + '\'' +
                ", autorLetras_cuarteto='" + autorLetras_cuarteto + '\'' +
                ", tipoDisfraz_cuarteto='" + tipoDisfraz_cuarteto + '\'' +
                ", numMiembros_cuarteto=" + numMiembros_cuarteto +
                super.toString() +
                '}';
    }
}
