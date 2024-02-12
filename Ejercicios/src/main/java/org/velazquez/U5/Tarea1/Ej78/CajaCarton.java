package org.velazquez.U5.Tarea1.Ej78;

public class CajaCarton extends Caja{

    /*Creación de un constructor que guarde la información de los atributos como parámetros del archivo padre,
    además de dos métodos que traerán el valor de los atributos adicionales*/
    public CajaCarton(double ancho, double alto, double fondo, int u) {
        super(ancho, alto, fondo, u);
    }

    /*Creación del método getVolumen_usado para calcular el 80% del volumen que se usa en cada caja de cartón*/
    public double getVolumen_usado() {
        return 0.8*getVolumen();
    }

    /*Creación del método getSuperficie_usada para saber la superficie total de cartón que se usa y aplicarlo
    al método getTotal_usado*/
    public double getSuperficie_usada() {
        return 0.8*(ancho*alto*6);
    }

    /*Creación del método getTotal_usado para calcular en proporción al número de cajas necesarias, el total
    de volumen usado que necesita saber la empresa*/
    public double getTotal_usado() {
        return u * getSuperficie_usada();
    }

    /*Creación de un toString para mostrar en pantalla el volumen usado y el total de volumen usado*/
    @Override
    public String toString() {
        return " Volumen_usado(80%):" + getVolumen_usado() + Medida.CM + "^3" +
                " Total_usado:" + getTotal_usado() + Medida.CM + "^2";
    }
}