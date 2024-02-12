package org.velazquez.U5.Tarea1.Ej9;

public class Lavadora extends Electrodomestico implements Comparable <Lavadora>{

    /*Definición de un nuevo atributo además de tener los atributos heredades de la clase padre*/
    private double carga; //Por defecto es 5 kg

    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
        this.carga = 5;
    }

    public Lavadora(Consumo consumo, Color color, double precio_base, double peso, double carga) {
        super(consumo, color, precio_base, peso);
        this.carga = carga;
    }

    //USO REDUNDANTE DE GETTER PERO USABLE
    public double getCarga() {
        return carga;
    }
    //USO REDUNDANTE DE GETTER PERO USABLE

    /*Creación del método getPrecioFinal para implementar un mayor aumento al precio según la carga de la lavadora*/
    @Override
    public double getPrecioFinal() {
        double precioFinal;

        precioFinal = super.getPrecioFinal();

        if (carga > 30) {
            precioFinal+=50;
        }

        return precioFinal;
    }

    /*Creación del método toString con implementación al otro de la clase padre*/
    @Override
    public String toString() {
        return "Lavadora{" +
                "carga:" + carga + "kg " +
                super.toString() +
                '}';
    }

    /*Creación del método compareTo para comparar otras lavadoras según la carga que lleve cada una*/
    @Override
    public int compareTo(Lavadora o) {
        if (this.getCarga() > o.getCarga()) {
            return 1;
        } else if (this.getCarga() < o.getCarga()) {
            return -1;
        }
        return 0;
    }
}
