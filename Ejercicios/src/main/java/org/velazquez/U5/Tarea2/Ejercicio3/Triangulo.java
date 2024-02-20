package org.velazquez.U5.Tarea2.Ejercicio3;

public class Triangulo extends PoligonoRegular implements Comparable<Triangulo>{
    //Adición del atributo de la altura del triángulo
    private double altura;

    //Implementamos el método del área perteneciente a la interfaz de figura
    //Obtendremos el área del triángulo
    public double getArea() {
        double areaTriangulo = (lado*altura)/2;

        contadorPoligonos++;

        return areaTriangulo;
    }

    //Constructor con parámetros
    public Triangulo(Color color, double lado, double altura) {
        this.color = color;
        this.lado = lado;
        this.altura = altura;
    }

    //Constructor con parámetros por defecto
    public Triangulo() {
        color = Color.AZUL;
        lado = 10;
        altura = 10;
    }

    //Ordenación por defecto a partir del lado del triángulo
    @Override
    public int compareTo(Triangulo o) {
        if (this.lado < o.lado) {
            return -1;
        } else {
            return 1;
        }
    }

    //Creamos el método toStringpara mostrar en pantalla el valor de los atributos del Triángulo
    @Override
    public String toString() {
        return "Triangulo{" +
                "altura:" + altura + "cms" +
                ", color:" + color +
                ", lado(base):" + lado + "cms" +
                ", área:" + getArea() + "cms^2" +
                '}';
    }
}
