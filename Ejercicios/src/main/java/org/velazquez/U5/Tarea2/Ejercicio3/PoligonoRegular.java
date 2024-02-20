package org.velazquez.U5.Tarea2.Ejercicio3;

//Al no poder crear objetos en esta clase, ebe ser abstracta
abstract class PoligonoRegular implements Figura{

    //Creamos los atributos de los polígonos
    public enum Color {
        AZUL, ROJO, VERDE, AMARILLO
    }
    public Color color;
    protected double lado; //En cms
    protected int contadorPoligonos = 0; //Cuenta solo los cuadrados y triángulos


}
