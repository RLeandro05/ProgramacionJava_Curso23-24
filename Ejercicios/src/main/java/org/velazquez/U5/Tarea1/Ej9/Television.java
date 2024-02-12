package org.velazquez.U5.Tarea1.Ej9;

public class Television extends Electrodomestico{

    /*Definición de dos nuevos atributos para la clase Television*/
    protected double resolucion;
    protected boolean sintonizadorTDT;

    public Television() {
        resolucion = 20;
        sintonizadorTDT = false;
    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);
        consumo_energetico = Consumo.F;
        color = Color.Blanco;
        resolucion = 20;
        sintonizadorTDT = false;
    }

    public Television(Consumo consumo, Color color, double precio_base, double peso, double pulgadas, boolean sintonizadorTDT) {
        super(consumo, color, precio_base, peso);
        this.resolucion = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //USO REDUNDANTE DE GETTER PERO USABLE
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    //USO REDUNDANTE DE GETTER PERO USABLE

    /*Creación del método getPrecioFinal que calcula en base a los atributos del electrodoméstico + los de la televisión
    el precio final de la televisión*/
    public double getPrecioFinal() {
        double precioFinal;

        precioFinal = super.getPrecioFinal();

        if (resolucion > 40) {
            precioFinal += 0.3 * precioFinal;
        }

        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }

    /*Creación del método toString para mostrar en pantalla la información de la televisión sumando al electrodoméstico*/
    @Override
    public String toString() {
        return "Television{" +
                "resolucion:" + resolucion + " pulgadas" +
                ", sintonizadorTDT:" + sintonizadorTDT + " " +
                super.toString() +
                '}';
    }
}
