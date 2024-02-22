package org.velazquez.U5.EntregableU4U52122T;

public class Chirigota extends AgrupacionOficial implements Callejera, Comparable<Chirigota> {
    private String autorMusica_chirigota;
    private String autorLetras_chirigota;
    private String tipoDisfraz_chirigota;
    private int numCuples_chirigota;

    public Chirigota(int puntos_obtenidos, String nombre, String autor, String autorMusica_chirigota, String autorLetras_chirigota, String tipoDisfraz_chirigota, int numCuples_chirigota) {
        super(puntos_obtenidos, nombre, autor);
        this.autorMusica_chirigota = autorMusica_chirigota;
        this.autorLetras_chirigota = autorLetras_chirigota;
        this.tipoDisfraz_chirigota = tipoDisfraz_chirigota;
        this.numCuples_chirigota = numCuples_chirigota;
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota "+nombre);
    }
    @Override
    public void hacer_tipo() {
        System.out.println("La Chirigota "+nombre+" va de "+tipoDisfraz_chirigota);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La Chirigota "+nombre+" va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota "+nombre);
    }

    @Override
    public int compareTo(Chirigota o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "autorMusica_chirigota='" + autorMusica_chirigota + '\'' +
                ", autorLetras_chirigota='" + autorLetras_chirigota + '\'' +
                ", tipoDisfraz_chirigota='" + tipoDisfraz_chirigota + '\'' +
                ", numCuples_chirigota=" + numCuples_chirigota +
                super.toString() +
                '}';
    }
}
