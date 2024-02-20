package org.velazquez.U5.Tarea2.Ejercicio3;

public class Cuadrado extends PoligonoRegular{

    //Implementamos el método del área perteneciente a la interfaz de figura
    //Obtendremos el área del cuadrado
    public double getArea() {
        double areaCuadrado = lado*lado;

        contadorPoligonos++;

        return areaCuadrado;
    }

    //Constructor con parámetros
    public Cuadrado(Color color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    //Constructor con parámetros por defecto
    public Cuadrado() {
        color = Color.AZUL;
        lado = 10;
    }

    //Creamos el método toStringpara mostrar en pantalla el valor de los atributos del Cuadrado
    @Override
    public String toString() {
        return "Cuadrado{" +
                "color:" + color +
                ", lado:" + lado + "cms" +
                ", área:" + getArea() + "cms^2" +
                '}';
    }
}
