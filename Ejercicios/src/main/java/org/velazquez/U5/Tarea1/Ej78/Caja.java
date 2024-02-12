package org.velazquez.U5.Tarea1.Ej78;

public class Caja {
    public enum Medida {
        M,
        CM
    }
    /*Declaración de los atributos de la clase*/
    protected final double ancho, alto, fondo;
    protected int u;

    /*Creación del constructor de la clase que pie como parámetros las dimensiones y las unidades*/
    public Caja(double ancho, double alto, double fondo, int u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }



    /*Creación del método getVolumen*/
    public double getVolumen() {
        /*Declaramos que retornará el producto de las tres dimensiones de la caja, es decir,
        el volumen*/
        return ancho*fondo*alto;
    }

    /*Creación del método toStirng para mostrar en pantalla los datos de la caja*/
    @Override
    public String toString() {
        return "Caja: " +
                "Ancho:" + ancho + Medida.CM +
                " Alto:" + alto + Medida.CM +
                " Fondo:" + fondo + Medida.CM +
                " Unidades:" + u +
                " Volumen:" + getVolumen() + Medida.CM + "^3";
    }
}
