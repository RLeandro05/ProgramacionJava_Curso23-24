package org.velazquez.U7.Entregable2324;

import java.io.Serializable;

public class Atleta implements Serializable {

    private static int inrecementaDorsalAtleta = 1;
    public categoriasAtleta categoriaAtleta;
    private int dorsalAtleta;
    private String nombreAtleta;
    private String paisAtleta;
    private int marcaAtleta; // Al final, se añade una marca con setMarca()
    private boolean acaboAtleta;

    public Atleta(String nombreAtleta, String paisAtleta, int marcaAtleta, boolean acaboAtleta, categoriasAtleta categoriaAtleta) {
        this.dorsalAtleta = inrecementaDorsalAtleta++;
        this.nombreAtleta = nombreAtleta;
        this.paisAtleta = paisAtleta;
        this.marcaAtleta = marcaAtleta;
        this.acaboAtleta = acaboAtleta;
        this.categoriaAtleta = categoriaAtleta;
    }

    public int getDorsalAtleta() {
        return dorsalAtleta;
    }

    public void setDorsalAtleta(int dorsalAtleta) {
        this.dorsalAtleta = dorsalAtleta;
    }

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public String getPaisAtleta() {
        return paisAtleta;
    }

    public void setPaisAtleta(String paisAtleta) {
        this.paisAtleta = paisAtleta;
    }

    public int getMarcaAtleta() {
        return marcaAtleta;
    }

    public void setMarcaAtleta(int marcaAtleta) {
        this.marcaAtleta = marcaAtleta;
    }

    public boolean getAcaboAtleta() {
        return acaboAtleta;
    }

    public void setAcaboAtleta(boolean acaboAtleta) {
        this.acaboAtleta = acaboAtleta;
    }

    public categoriasAtleta getCategoriaAtleta() {
        return categoriaAtleta;
    }

    public void setCategoriaAtleta(categoriasAtleta categoriaAtleta) {
        this.categoriaAtleta = categoriaAtleta;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombreAtleta='" + nombreAtleta + '\'' +
                ", paisAtleta='" + paisAtleta + '\'' +
                ", marcaAtleta=" + marcaAtleta +
                ", acaboAtleta=" + acaboAtleta +
                ", categoriaAtleta=" + categoriaAtleta +
                ", dorsalAtleta=" + dorsalAtleta +
                '}';
    }

    public enum categoriasAtleta {
        SENIOR, JUNIOR, VETERANO
    }


}
