package org.velazquez.Ligero_Picon_U6U7_Examen;

import java.io.Serializable;

public class Artista implements Serializable {

    private String nombreArtisticoArtista;
    private String generoMusicalArtista;
    private String nacionalidadArtista;
    private int idArtista;
    private static int idArtistaIncrementa = 1;

    public Artista(String nombreArtisticoArtista, String generoMusicalArtista, String nacionalidadArtista) {
        this.idArtista = idArtistaIncrementa++;
        this.nombreArtisticoArtista = nombreArtisticoArtista;
        this.generoMusicalArtista = generoMusicalArtista;
        this.nacionalidadArtista = nacionalidadArtista;
    }

    public String getNombreArtisticoArtista() {
        return nombreArtisticoArtista;
    }

    public void setNombreArtisticoArtista(String nombreArtisticoArtista) {
        this.nombreArtisticoArtista = nombreArtisticoArtista;
    }

    public String getGeneroMusicalArtista() {
        return generoMusicalArtista;
    }

    public void setGeneroMusicalArtista(String generoMusicalArtista) {
        this.generoMusicalArtista = generoMusicalArtista;
    }

    public String getNacionalidadArtista() {
        return nacionalidadArtista;
    }

    public void setNacionalidadArtista(String nacionalidadArtista) {
        this.nacionalidadArtista = nacionalidadArtista;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtisticoArtista='" + nombreArtisticoArtista + '\'' +
                ", generoMusicalArtista='" + generoMusicalArtista + '\'' +
                ", nacionalidadArtista='" + nacionalidadArtista + '\'' +
                ", idArtista=" + idArtista +
                '}';
    }
}
