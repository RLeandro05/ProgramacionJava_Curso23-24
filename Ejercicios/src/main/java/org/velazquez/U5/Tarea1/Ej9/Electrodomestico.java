package org.velazquez.U5.Tarea1.Ej9;

class Electrodomestico {
    /*Creación de dos enumerados*/
    public enum Consumo {
        A, B, C, D, E, F
    }
    public enum Color {
        Blanco, Negro, Rojo, Azul, Gris
    }

    /*Creación de atributos*/
    protected Consumo consumo_energetico;
    protected Color color;
    protected double precio_base;
    protected double peso;

    /*Creación de constructores según los datos aportados*/
    public Electrodomestico() {
        consumo_energetico = Consumo.F;
        color = Color.Blanco;
        precio_base = 100;
        peso = 5;
    }

    public Electrodomestico(double precio_base, double peso) {
        consumo_energetico = Consumo.F;
        color = Color.Blanco;
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(Consumo consumo_energetico, Color color, double precio_base, double peso) {
        this.consumo_energetico = consumo_energetico;
        this.color = color;
        this.precio_base = precio_base;
        this.peso = peso;
    }

    //USO REDUNDANTE DE GETTER PERO USABLE
    public Consumo getConsumo_energetico() {
        return consumo_energetico;
    }

    public Color getColor() {
        return color;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public double getPeso() {
        return peso;
    }
    //USO REDUNDANTE DE GETTER PERO USABLE

    /*Creación del método getPrecioFinal para sacar el precio del electrodoméstico sin contar
    el tipo que es*/
    public double getPrecioFinal() {
        double precioFinal = getPrecio_base();

        switch (consumo_energetico) {
            case A -> precioFinal += 100;
            case B -> precioFinal += 80;
            case C -> precioFinal += 60;
            case D -> precioFinal += 50;
            case E -> precioFinal += 30;
            case F -> precioFinal += 10;
        }

        if (getPeso() >= 0 && getPeso() <= 29) {
            precioFinal += 10;
        } else if (getPeso() >= 30 && getPeso() <= 49) {
            precioFinal += 60;
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            precioFinal += 80;
        } else if (getPeso() >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }

    /*Creación del método toString para mostrar en pantalla el resultado*/
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "consumo_energetico=" + consumo_energetico +
                ", color=" + color +
                ", precio_base=" + precio_base +
                ", peso=" + peso +
                ", precioFinal=" + getPrecioFinal() +
                '}';
    }
}
