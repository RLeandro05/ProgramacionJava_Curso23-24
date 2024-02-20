package org.velazquez.U5.Tarea2.Ejercicio3;

public class Circulo extends PoligonoRegular{
    //Adición del atributo radio del círculo
    private double radio;

    //Creamos el método getArea implementado de la interfaz para sacar el área del círculo
    public double getArea() {
        double areaCirculo = 3.14*(radio*radio);

        return areaCirculo;
    }

    //Constructor con parámetros
    public Circulo(Color color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    //Constructor con parámetros por defecto
    public Circulo() {
        color = Color.AZUL;
        radio = 10;
    }

    //Creamos el método toStringpara mostrar en pantalla el valor de los atributos del Círculo
    @Override
    public String toString() {
        return "Circulo{" +
                "radio:" + radio + "cms" +
                ", color:" + color +
                ", área:" + getArea() + "cms^2" +
                '}';
    }
}
