package org.velazquez.U5.EntregableU4U52122T;

public abstract class AgrupacionOficial extends Agrupacion{
    protected int puntos_obtenidos;
    protected String nombre;
    protected String autor;
    private Integrante[] integrantes = new Integrante[0];

    public AgrupacionOficial(int puntos_obtenidos, String nombre, String autor) {
        this.puntos_obtenidos = puntos_obtenidos;
        this.nombre = nombre;
        this.autor = autor;
    }

    public void insertarIntegrante(Integrante i) {
        Integrante[] nuevoIntegrante = new Integrante[integrantes.length+1];

        for (int j = 0; j < integrantes.length; j++) {
            nuevoIntegrante[j] = integrantes[j];
        }

        nuevoIntegrante[integrantes.length] = i;
        integrantes = nuevoIntegrante;
    }
    public boolean eliminarIntegrante(Integrante i) {
        int index = -1;
        for (int j = 0; j < integrantes.length; j++) {
            if (integrantes[j].equals(i)) {
                index = j;
                break;
            }
        }

        if (index != -1) {
            Integrante[] nuevoIntegrante = new Integrante[integrantes.length - 1];
            for (int j = 0, k = 0; j < integrantes.length; j++) {
                if (j != index) {
                    nuevoIntegrante[k++] = integrantes[j];
                }
            }
            integrantes = nuevoIntegrante;
            return true;
        }

        return false;
    }

    public abstract void caminito_del_falla();

    @Override
    public String toString() {
        return ", puntos_obtenidos=" + puntos_obtenidos +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
