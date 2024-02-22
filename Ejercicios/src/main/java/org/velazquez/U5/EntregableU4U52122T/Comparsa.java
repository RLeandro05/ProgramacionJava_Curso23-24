package org.velazquez.U5.EntregableU4U52122T;

public class Comparsa extends AgrupacionOficial implements Comparable<Comparsa> {
    private String autorMusica_comparsa;
    private String autorLetras_comparsa;
    private String tipoDisfraz_comparsa;
    private String empresaAtrezzo_comparsa;

    public Comparsa(int puntos_obtenidos, String nombre, String autor, String autorMusica_comparsa, String autorLetras_comparsa, String tipoDisfraz_comparsa, String empresaAtrezzo_comparsa) {
        super(puntos_obtenidos, nombre, autor);
        this.autorMusica_comparsa = autorMusica_comparsa;
        this.autorLetras_comparsa = autorLetras_comparsa;
        this.tipoDisfraz_comparsa = tipoDisfraz_comparsa;
        this.empresaAtrezzo_comparsa = empresaAtrezzo_comparsa;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa "+nombre);
    }
    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa "+nombre+" va de "+tipoDisfraz_comparsa);
    }
    @Override
    public void caminito_del_falla() {
        System.out.println("La Comparsa "+nombre+" va caminito del falla");
    }

    @Override
    public int compareTo(Comparsa o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "autorMusica_comparsa='" + autorMusica_comparsa + '\'' +
                ", autorLetras_comparsa='" + autorLetras_comparsa + '\'' +
                ", tipoDisfraz_comparsa='" + tipoDisfraz_comparsa + '\'' +
                ", empresaAtrezzo_comparsa='" + empresaAtrezzo_comparsa + '\'' +
                super.toString() +
                '}';
    }
}
